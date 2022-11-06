package com.electronic.boot.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrnamentMarket implements Serializable {
    private Integer id;

    private String name;

    private BigDecimal sellMinPrice;

    private Integer sellNum;

    private String iconUrl;

    private Integer exteriorId;

    private String exteriorInternalName;

    private String exteriorLocalizedName;

    private Integer qualityId;

    private String qualityInternalName;

    private String qualityLocalizedName;

    private Integer rarityId;

    private String rarityInternalName;

    private String rarityLocalizedName;

    private Integer typeId;

    private String typeInternalName;

    private String typeLocalizedName;

    private Integer weaponId;

    private String weaponInternalName;

    private String weaponLocalizedName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getSellMinPrice() {
        return sellMinPrice;
    }

    public void setSellMinPrice(BigDecimal sellMinPrice) {
        this.sellMinPrice = sellMinPrice;
    }

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getExteriorId() {
        return exteriorId;
    }

    public void setExteriorId(Integer exteriorId) {
        this.exteriorId = exteriorId;
    }

    public String getExteriorInternalName() {
        return exteriorInternalName;
    }

    public void setExteriorInternalName(String exteriorInternalName) {
        this.exteriorInternalName = exteriorInternalName == null ? null : exteriorInternalName.trim();
    }

    public String getExteriorLocalizedName() {
        return exteriorLocalizedName;
    }

    public void setExteriorLocalizedName(String exteriorLocalizedName) {
        this.exteriorLocalizedName = exteriorLocalizedName == null ? null : exteriorLocalizedName.trim();
    }

    public Integer getQualityId() {
        return qualityId;
    }

    public void setQualityId(Integer qualityId) {
        this.qualityId = qualityId;
    }

    public String getQualityInternalName() {
        return qualityInternalName;
    }

    public void setQualityInternalName(String qualityInternalName) {
        this.qualityInternalName = qualityInternalName == null ? null : qualityInternalName.trim();
    }

    public String getQualityLocalizedName() {
        return qualityLocalizedName;
    }

    public void setQualityLocalizedName(String qualityLocalizedName) {
        this.qualityLocalizedName = qualityLocalizedName == null ? null : qualityLocalizedName.trim();
    }

    public Integer getRarityId() {
        return rarityId;
    }

    public void setRarityId(Integer rarityId) {
        this.rarityId = rarityId;
    }

    public String getRarityInternalName() {
        return rarityInternalName;
    }

    public void setRarityInternalName(String rarityInternalName) {
        this.rarityInternalName = rarityInternalName == null ? null : rarityInternalName.trim();
    }

    public String getRarityLocalizedName() {
        return rarityLocalizedName;
    }

    public void setRarityLocalizedName(String rarityLocalizedName) {
        this.rarityLocalizedName = rarityLocalizedName == null ? null : rarityLocalizedName.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeInternalName() {
        return typeInternalName;
    }

    public void setTypeInternalName(String typeInternalName) {
        this.typeInternalName = typeInternalName == null ? null : typeInternalName.trim();
    }

    public String getTypeLocalizedName() {
        return typeLocalizedName;
    }

    public void setTypeLocalizedName(String typeLocalizedName) {
        this.typeLocalizedName = typeLocalizedName == null ? null : typeLocalizedName.trim();
    }

    public Integer getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Integer weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponInternalName() {
        return weaponInternalName;
    }

    public void setWeaponInternalName(String weaponInternalName) {
        this.weaponInternalName = weaponInternalName == null ? null : weaponInternalName.trim();
    }

    public String getWeaponLocalizedName() {
        return weaponLocalizedName;
    }

    public void setWeaponLocalizedName(String weaponLocalizedName) {
        this.weaponLocalizedName = weaponLocalizedName == null ? null : weaponLocalizedName.trim();
    }
}