package com.electronic.boot.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.electronic.boot.config.AlipayResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Slf4j
@Controller
public class AlipayController {

    private String userId;

    @Autowired
    private AlipayResource aliPayResource;

    @RequestMapping("/pay")
    public void payController(HttpServletRequest request, HttpServletResponse response) throws IOException {


        //获得初始化的AlipayClient

        AlipayClient alipayClient = new DefaultAlipayClient(aliPayResource.getGatewayUrl(), aliPayResource.getAppId(), aliPayResource.getMerchantPrivateKey(), "json",aliPayResource.getCharset(), aliPayResource.getAlipayPublicKey(), aliPayResource.getSignType());


        //设置请求参数

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();

        alipayRequest.setReturnUrl(aliPayResource.getReturnUrl());

        alipayRequest.setNotifyUrl(aliPayResource.getNotifyUrl());

        this.userId = request.getParameter("userId");
        //商户订单号，商户网站订单系统中唯一订单号，必填
        StringBuffer serialNumber = new StringBuffer();
        long millis = System.currentTimeMillis();
        SimpleDateFormat formatter= new SimpleDateFormat("yyMMdd");
        Date date = new Date(millis);
        String serialNumberToUse = serialNumber.append(formatter.format(date)).append('R').append(millis / 1000).toString();
        String out_trade_no = serialNumberToUse;

        //付款金额，必填

        String total_amount = request.getParameter("rechargeAmount");

        //订单名称，必填
        String subject = "饰品余额充值";
        log.info("{}",total_amount );
        //商品描述，可空

        String body = subject;
        log.info("{}", body);

        alipayRequest.setBizContent(
                "{\"out_trade_no\":\"" + out_trade_no + "\","

                + "\"total_amount\":\"" + total_amount + "\","

                + "\"subject\":\"" + subject + "\","

                + "\"body\":\"" + body + "\","

                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");


        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明

        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","

        //      + "\"total_amount\":\""+ total_amount +"\","

        //      + "\"subject\":\""+ subject +"\","

        //      + "\"body\":\""+ body +"\","

        //      + "\"timeout_express\":\"10m\","

        //      + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节


        //请求

        String form = "";

        try {

            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单

        } catch (AlipayApiException e) {

            e.printStackTrace();

        }

        response.setContentType("text/html;charset=" + aliPayResource.getCharset());

        response.getWriter().write(form);//直接将完整的表单html输出到页面

        response.getWriter().flush();

        response.getWriter().close();
    }
    /**
     * 支付成功后的支付宝异步通知
     */
    @PostMapping(value="/alipayResult")
    public String alipay(HttpServletRequest request, HttpServletResponse response) throws Exception {

        log.info("支付成功后的支付宝异步通知");
        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
//       valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params,
                aliPayResource.getAlipayPublicKey(),
                aliPayResource.getCharset(),
                aliPayResource.getSignType()); //调用SDK验证签名

        if(signVerified) {//验证成功
            log.info("{}", "验证成功");
            request.setAttribute("userId", this.userId);
            return "forward:/rechargeRecord/dealRechargeRecordWithSuccess";
        }else {
            //验证失败
            log.info("验签失败, 时间: {}", System.currentTimeMillis());
            return "fail";
        }
    }
}
