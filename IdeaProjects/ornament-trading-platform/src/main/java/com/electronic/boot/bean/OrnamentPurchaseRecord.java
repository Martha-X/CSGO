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
 * @TableName ornament_purchase_record
 */
@TableName(value ="ornament_purchase_record")
@Data
public class OrnamentPurchaseRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String iconUrl;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 
     */
    private String sellerAvatar;

    /**
     * 
     */
    private String sellerNickname;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
    private Date transactDatetime;

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
    private String buyerId;

    /**
     * 
     */
    private String sellId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}