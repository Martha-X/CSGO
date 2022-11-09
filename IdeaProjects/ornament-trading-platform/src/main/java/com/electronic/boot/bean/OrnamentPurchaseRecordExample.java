package com.electronic.boot.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrnamentPurchaseRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrnamentPurchaseRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarIsNull() {
            addCriterion("seller_avatar is null");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarIsNotNull() {
            addCriterion("seller_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarEqualTo(String value) {
            addCriterion("seller_avatar =", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarNotEqualTo(String value) {
            addCriterion("seller_avatar <>", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarGreaterThan(String value) {
            addCriterion("seller_avatar >", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("seller_avatar >=", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarLessThan(String value) {
            addCriterion("seller_avatar <", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarLessThanOrEqualTo(String value) {
            addCriterion("seller_avatar <=", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarLike(String value) {
            addCriterion("seller_avatar like", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarNotLike(String value) {
            addCriterion("seller_avatar not like", value, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarIn(List<String> values) {
            addCriterion("seller_avatar in", values, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarNotIn(List<String> values) {
            addCriterion("seller_avatar not in", values, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarBetween(String value1, String value2) {
            addCriterion("seller_avatar between", value1, value2, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerAvatarNotBetween(String value1, String value2) {
            addCriterion("seller_avatar not between", value1, value2, "sellerAvatar");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameIsNull() {
            addCriterion("seller_nickname is null");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameIsNotNull() {
            addCriterion("seller_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameEqualTo(String value) {
            addCriterion("seller_nickname =", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameNotEqualTo(String value) {
            addCriterion("seller_nickname <>", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameGreaterThan(String value) {
            addCriterion("seller_nickname >", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_nickname >=", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameLessThan(String value) {
            addCriterion("seller_nickname <", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameLessThanOrEqualTo(String value) {
            addCriterion("seller_nickname <=", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameLike(String value) {
            addCriterion("seller_nickname like", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameNotLike(String value) {
            addCriterion("seller_nickname not like", value, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameIn(List<String> values) {
            addCriterion("seller_nickname in", values, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameNotIn(List<String> values) {
            addCriterion("seller_nickname not in", values, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameBetween(String value1, String value2) {
            addCriterion("seller_nickname between", value1, value2, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andSellerNicknameNotBetween(String value1, String value2) {
            addCriterion("seller_nickname not between", value1, value2, "sellerNickname");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeIsNull() {
            addCriterion("transact_datetime is null");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeIsNotNull() {
            addCriterion("transact_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeEqualTo(Date value) {
            addCriterion("transact_datetime =", value, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeNotEqualTo(Date value) {
            addCriterion("transact_datetime <>", value, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeGreaterThan(Date value) {
            addCriterion("transact_datetime >", value, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transact_datetime >=", value, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeLessThan(Date value) {
            addCriterion("transact_datetime <", value, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("transact_datetime <=", value, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeIn(List<Date> values) {
            addCriterion("transact_datetime in", values, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeNotIn(List<Date> values) {
            addCriterion("transact_datetime not in", values, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeBetween(Date value1, Date value2) {
            addCriterion("transact_datetime between", value1, value2, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andTransactDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("transact_datetime not between", value1, value2, "transactDatetime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("buyer_id like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("buyer_id not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andSellIdIsNull() {
            addCriterion("sell_id is null");
            return (Criteria) this;
        }

        public Criteria andSellIdIsNotNull() {
            addCriterion("sell_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellIdEqualTo(String value) {
            addCriterion("sell_id =", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotEqualTo(String value) {
            addCriterion("sell_id <>", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdGreaterThan(String value) {
            addCriterion("sell_id >", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdGreaterThanOrEqualTo(String value) {
            addCriterion("sell_id >=", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLessThan(String value) {
            addCriterion("sell_id <", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLessThanOrEqualTo(String value) {
            addCriterion("sell_id <=", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLike(String value) {
            addCriterion("sell_id like", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotLike(String value) {
            addCriterion("sell_id not like", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdIn(List<String> values) {
            addCriterion("sell_id in", values, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotIn(List<String> values) {
            addCriterion("sell_id not in", values, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdBetween(String value1, String value2) {
            addCriterion("sell_id between", value1, value2, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotBetween(String value1, String value2) {
            addCriterion("sell_id not between", value1, value2, "sellId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}