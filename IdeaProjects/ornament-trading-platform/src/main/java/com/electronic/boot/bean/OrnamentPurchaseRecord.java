package com.electronic.boot.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@ToString
public class OrnamentPurchaseRecord implements Serializable {
    private String id;

    private String iconUrl;

    private String name;

    private BigDecimal price;

    private String sellerAvatar;

    private String sellerNickname;

    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
    private Date transactDatetime;

    private String state;

    private Integer goodsId;

    private String buyerId;

    private String sellId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
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

    public String getSellerAvatar() {
        return sellerAvatar;
    }

    public void setSellerAvatar(String sellerAvatar) {
        this.sellerAvatar = sellerAvatar == null ? null : sellerAvatar.trim();
    }

    public String getSellerNickname() {
        return sellerNickname;
    }

    public void setSellerNickname(String sellerNickname) {
        this.sellerNickname = sellerNickname == null ? null : sellerNickname.trim();
    }

    public Date getTransactDatetime() {
        return transactDatetime;
    }

    public void setTransactDatetime(Date transactDatetime) {
        this.transactDatetime = transactDatetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId == null ? null : sellId.trim();
    }
}