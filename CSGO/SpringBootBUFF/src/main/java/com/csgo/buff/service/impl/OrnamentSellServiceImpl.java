package com.csgo.buff.service.impl;

import cn.hutool.core.date.DateUtil;
import com.csgo.buff.bean.OrnamentSellRecord;
import com.csgo.buff.example.OrnamentSellRecordHttpExample;
import com.csgo.buff.mapper.OrnamentSellRecordMapper;
import com.csgo.buff.service.OrnamentSellService;
import com.csgo.buff.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Slf4j
@Service
public class OrnamentSellServiceImpl implements OrnamentSellService {
    @Autowired
    private OrnamentSellRecordMapper mapper;
    @Autowired
    private OrnamentSellRecordHttpExample example;

    @Override
    public int insertBatch() throws URISyntaxException, IOException, InterruptedException {
        CloseableHttpResponse response = null;
        int i = 0; // 变量i 用作页数请求变量
        List<OrnamentSellRecord> recordList = null;
        StringBuffer reqUrl = new StringBuffer(example.getReqUrl());
        // 记录总页数
        int totalPage = 0;
        do {
            recordList = new ArrayList<>();
            String url = example.getUrl(reqUrl, i).toString();
            log.info("{}", url);
            URIBuilder uriBuilder = new URIBuilder(url);
            HttpGet httpGet = new HttpGet(uriBuilder.build());
            // 添加请求头
            httpGet.setHeaders(example.getHeaders());
            response = HttpUtil.getHttpClient().execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                List<String> ids = selectStringIds();
//                log.info("{}", ids);
                String content = EntityUtils.toString(response.getEntity(), "utf8");
                // 将字符串转为JSON对象
                JSONObject json = JSONObject.fromObject(content);
                JSONObject data = json.getJSONObject("data");
                // 获取总页数
                totalPage = json.getJSONObject("data").getInt("total_page");
                // 获取Data包含的JSON数组
                JSONArray items = data.getJSONArray("items");
                for (int j = 0; j < items.size(); j++) {
                    OrnamentSellRecord osr = new OrnamentSellRecord();
                    JSONObject user_infos = data.getJSONObject("user_infos");
                    // 获取每一个item[j]对象
                    JSONObject item = items.getJSONObject(j);
                    // 获取每一个item的goods_info
                    String iconUrl = item.getJSONObject("asset_info").getJSONObject("info").getString("icon_url");
                    osr.setIconUrl(iconUrl);
                    String id = item.getString("id");
                    if (ids.contains(id))
                        continue;
                    osr.setId(id);
                    Integer goodsId = item.getInt("goods_id");
                    osr.setGoodsId(goodsId);
                    osr.setName(data.getJSONObject("goods_infos").getJSONObject(String.valueOf(goodsId)).getString("name"));
                    osr.setSellPrice(new BigDecimal(item.getString("price")));
                    String buyerId = item.getString("buyer_id");
                    osr.setSellerId(item.getString("seller_id"));
                    Date created_at = DateUtil.date((item.getInt("created_at") * 1000L));
                    osr.setTransactTime(created_at);
                    osr.setState(item.getString("state_text"));
                    osr.setBuyerId(buyerId);
                    osr.setBuyerNickname(user_infos.getJSONObject(String.valueOf(buyerId)).getString("nickname"));
                    log.info("{}", osr);
                    recordList.add(osr);
                }
            }
            mapper.insertBatch(recordList);
            i++;
            Thread.sleep((int) (Math.random() * (3 - 1 + 1) + 1) * 1000); // 随机睡眠 1-3秒(int)(Math.random()*(b-a+1)+a)*1000
        } while (i < totalPage);
        return 0;
    }


    @Override
    public List<String> selectStringIds() {
        return mapper.selectStringIds();
    }
}
