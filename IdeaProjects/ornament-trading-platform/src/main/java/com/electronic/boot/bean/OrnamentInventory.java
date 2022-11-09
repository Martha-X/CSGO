package com.electronic.boot.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
@Data
@ToString
public class OrnamentInventory implements Serializable {
    private Integer id;

    private Integer goodsId;

    private String userId;

    private Integer itemId;

    private List<OrnamentOnSale> inventoryList;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}