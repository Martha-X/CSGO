package com.electronic.boot.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName ornament_on_sale
 */
@TableName(value ="ornament_on_sale")
@Data
public class OrnamentOnSale implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

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
    private String iconUrl;

    /**
     * 
     */
    private Integer categoryId;

    /**
     * 
     */
    private String categoryInternalName;

    /**
     * 
     */
    private String categoryLocalizedName;

    /**
     * 
     */
    private Integer categoryGroupId;

    /**
     * 
     */
    private String categoryGroupInternalName;

    /**
     * 
     */
    private String categoryGroupLocalizedName;

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
    private Integer itemsetId;

    /**
     * 
     */
    private String itemsetInternalName;

    /**
     * 
     */
    private String itemsetLocalizedName;

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

    /**
     * 
     */
    private Integer weaponcaseId;

    /**
     * 
     */
    private String weaponcaseInternalName;

    /**
     * 
     */
    private String weaponcaseLocalizedName;

    /**
     * 
     */
    private Integer goodsId;

    /**
     * 
     */
    private Integer paintindex;

    /**
     * 
     */
    private Integer paintseed;

    /**
     * 
     */
    private String paintwear;

    /**
     * 
     */
    private String backgroundImageUrl;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private BigDecimal fee;

    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String avatar;

    /**
     * 
     */
    private String nickname;

    /**
     * 
     */
    private Integer isSoldOut;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}