package com.electronic.boot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName ornament_sell_record
 */
@TableName(value ="ornament_sell_record")
@Data
public class OrnamentSellRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private BigDecimal sellPrice;

    /**
     * 
     */
    private String buyerNickname;

    /**
     * 
     */
    private String buyerId;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
    private Date transactTime;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private Integer goodsId;

    /**
     * 
     */
    private String iconUrl;

    /**
     * 
     */
    private String sellerId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}