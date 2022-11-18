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
 * @TableName recharge_record
 */
@TableName(value ="recharge_record")
@Data
public class RechargeRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private String serialNumber;

    /**
     * 
     */
    private BigDecimal rechargeAmount;

    /**
     * 
     */
    private String paymentAccount;

    /**
     * 
     */
    private String rechargeStatus;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss",timezone = "GMT+8")
    private Date createTime;

    /**
     * 
     */
    private String userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}