package com.electronic.boot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName ornament_market
 */
@TableName(value ="ornament_market")
@Data
public class OrnamentMarket implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private BigDecimal sellMinPrice;

    /**
     * 
     */
    private Integer sellNum;

    /**
     * 
     */
    private String iconUrl;

    /**
     * 
     */
    private Integer exteriorId;

    /**
     * 
     */
    private String exteriorInternalName;

    /**
     * 
     */
    private String exteriorLocalizedName;

    /**
     * 
     */
    private Integer qualityId;

    /**
     * 
     */
    private String qualityInternalName;

    /**
     * 
     */
    private String qualityLocalizedName;

    /**
     * 
     */
    private Integer rarityId;

    /**
     * 
     */
    private String rarityInternalName;

    /**
     * 
     */
    private String rarityLocalizedName;

    /**
     * 
     */
    private Integer typeId;

    /**
     * 
     */
    private String typeInternalName;

    /**
     * 
     */
    private String typeLocalizedName;

    /**
     * 
     */
    private Integer weaponId;

    /**
     * 
     */
    private String weaponInternalName;

    /**
     * 
     */
    private String weaponLocalizedName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}