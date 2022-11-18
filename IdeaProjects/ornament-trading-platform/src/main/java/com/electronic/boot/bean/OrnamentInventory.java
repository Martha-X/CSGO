package com.electronic.boot.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName ornament_inventory
 */
@TableName(value ="ornament_inventory")
@Data
public class OrnamentInventory implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer goodsId;

    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private Integer itemId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}