package com.electronic.boot.mapper;

import com.electronic.boot.bean.OrnamentOnSale;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
* @author Administrator
* @description 针对表【ornament_on_sale】的数据库操作Mapper
* @createDate 2022-11-18 22:47:46
* @Entity com.electronic.boot.bean.OrnamentOnSale
*/
@Repository
public interface OrnamentOnSaleMapper extends BaseMapper<OrnamentOnSale> {

    List<Map<String, Object>> getEveryExteriorGoods(String s);
}




