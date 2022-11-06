package com.electronic.boot.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrnamentOnSale implements Serializable {
    private Integer id;

    private String name;

    private BigDecimal price;

    private String iconUrl;

    private Integer categoryId;

    private String categoryInternalName;

    private String categoryLocalizedName;

    private Integer categoryGroupId;

    private String categoryGroupInternalName;

    private String categoryGroupLocalizedName;

    private Integer exteriorId;

    private String exteriorInternalName;

    private String exteriorLocalizedName;

    private Integer itemsetId;

    private String itemsetInternalName;

    private String itemsetLocalizedName;

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

    private Integer weaponcaseId;

    private String weaponcaseInternalName;

    private String weaponcaseLocalizedName;

    private Integer goodsId;

    private Integer paintindex;

    private Integer paintseed;

    private String paintwear;

    private String backgroundImageUrl;

    private String description;

    private BigDecimal fee;

    private String userId;

    private String avatar;

    private String nickname;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryInternalName() {
        return categoryInternalName;
    }

    public void setCategoryInternalName(String categoryInternalName) {
        this.categoryInternalName = categoryInternalName == null ? null : categoryInternalName.trim();
    }

    public String getCategoryLocalizedName() {
        return categoryLocalizedName;
    }

    public void setCategoryLocalizedName(String categoryLocalizedName) {
        this.categoryLocalizedName = categoryLocalizedName == null ? null : categoryLocalizedName.trim();
    }

    public Integer getCategoryGroupId() {
        return categoryGroupId;
    }

    public void setCategoryGroupId(Integer categoryGroupId) {
        this.categoryGroupId = categoryGroupId;
    }

    public String getCategoryGroupInternalName() {
        return categoryGroupInternalName;
    }

    public void setCategoryGroupInternalName(String categoryGroupInternalName) {
        this.categoryGroupInternalName = categoryGroupInternalName == null ? null : categoryGroupInternalName.trim();
    }

    public String getCategoryGroupLocalizedName() {
        return categoryGroupLocalizedName;
    }

    public void setCategoryGroupLocalizedName(String categoryGroupLocalizedName) {
        this.categoryGroupLocalizedName = categoryGroupLocalizedName == null ? null : categoryGroupLocalizedName.trim();
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

    public Integer getItemsetId() {
        return itemsetId;
    }

    public void setItemsetId(Integer itemsetId) {
        this.itemsetId = itemsetId;
    }

    public String getItemsetInternalName() {
        return itemsetInternalName;
    }

    public void setItemsetInternalName(String itemsetInternalName) {
        this.itemsetInternalName = itemsetInternalName == null ? null : itemsetInternalName.trim();
    }

    public String getItemsetLocalizedName() {
        return itemsetLocalizedName;
    }

    public void setItemsetLocalizedName(String itemsetLocalizedName) {
        this.itemsetLocalizedName = itemsetLocalizedName == null ? null : itemsetLocalizedName.trim();
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

    public Integer getWeaponcaseId() {
        return weaponcaseId;
    }

    public void setWeaponcaseId(Integer weaponcaseId) {
        this.weaponcaseId = weaponcaseId;
    }

    public String getWeaponcaseInternalName() {
        return weaponcaseInternalName;
    }

    public void setWeaponcaseInternalName(String weaponcaseInternalName) {
        this.weaponcaseInternalName = weaponcaseInternalName == null ? null : weaponcaseInternalName.trim();
    }

    public String getWeaponcaseLocalizedName() {
        return weaponcaseLocalizedName;
    }

    public void setWeaponcaseLocalizedName(String weaponcaseLocalizedName) {
        this.weaponcaseLocalizedName = weaponcaseLocalizedName == null ? null : weaponcaseLocalizedName.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPaintindex() {
        return paintindex;
    }

    public void setPaintindex(Integer paintindex) {
        this.paintindex = paintindex;
    }

    public Integer getPaintseed() {
        return paintseed;
    }

    public void setPaintseed(Integer paintseed) {
        this.paintseed = paintseed;
    }

    public String getPaintwear() {
        return paintwear;
    }

    public void setPaintwear(String paintwear) {
        this.paintwear = paintwear == null ? null : paintwear.trim();
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl == null ? null : backgroundImageUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }
}