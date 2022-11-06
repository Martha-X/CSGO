package com.electronic.boot.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrnamentMarketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrnamentMarketExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andSellMinPriceIsNull() {
            addCriterion("sell_min_price is null");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceIsNotNull() {
            addCriterion("sell_min_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceEqualTo(BigDecimal value) {
            addCriterion("sell_min_price =", value, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("sell_min_price <>", value, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceGreaterThan(BigDecimal value) {
            addCriterion("sell_min_price >", value, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_min_price >=", value, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceLessThan(BigDecimal value) {
            addCriterion("sell_min_price <", value, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_min_price <=", value, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceIn(List<BigDecimal> values) {
            addCriterion("sell_min_price in", values, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("sell_min_price not in", values, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_min_price between", value1, value2, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_min_price not between", value1, value2, "sellMinPrice");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNull() {
            addCriterion("sell_num is null");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNotNull() {
            addCriterion("sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andSellNumEqualTo(Integer value) {
            addCriterion("sell_num =", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotEqualTo(Integer value) {
            addCriterion("sell_num <>", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThan(Integer value) {
            addCriterion("sell_num >", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_num >=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThan(Integer value) {
            addCriterion("sell_num <", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("sell_num <=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumIn(List<Integer> values) {
            addCriterion("sell_num in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotIn(List<Integer> values) {
            addCriterion("sell_num not in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumBetween(Integer value1, Integer value2) {
            addCriterion("sell_num between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_num not between", value1, value2, "sellNum");
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

        public Criteria andExteriorIdIsNull() {
            addCriterion("exterior_id is null");
            return (Criteria) this;
        }

        public Criteria andExteriorIdIsNotNull() {
            addCriterion("exterior_id is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorIdEqualTo(Integer value) {
            addCriterion("exterior_id =", value, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdNotEqualTo(Integer value) {
            addCriterion("exterior_id <>", value, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdGreaterThan(Integer value) {
            addCriterion("exterior_id >", value, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exterior_id >=", value, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdLessThan(Integer value) {
            addCriterion("exterior_id <", value, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdLessThanOrEqualTo(Integer value) {
            addCriterion("exterior_id <=", value, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdIn(List<Integer> values) {
            addCriterion("exterior_id in", values, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdNotIn(List<Integer> values) {
            addCriterion("exterior_id not in", values, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdBetween(Integer value1, Integer value2) {
            addCriterion("exterior_id between", value1, value2, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exterior_id not between", value1, value2, "exteriorId");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameIsNull() {
            addCriterion("exterior_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameIsNotNull() {
            addCriterion("exterior_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameEqualTo(String value) {
            addCriterion("exterior_internal_name =", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameNotEqualTo(String value) {
            addCriterion("exterior_internal_name <>", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameGreaterThan(String value) {
            addCriterion("exterior_internal_name >", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("exterior_internal_name >=", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameLessThan(String value) {
            addCriterion("exterior_internal_name <", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameLessThanOrEqualTo(String value) {
            addCriterion("exterior_internal_name <=", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameLike(String value) {
            addCriterion("exterior_internal_name like", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameNotLike(String value) {
            addCriterion("exterior_internal_name not like", value, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameIn(List<String> values) {
            addCriterion("exterior_internal_name in", values, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameNotIn(List<String> values) {
            addCriterion("exterior_internal_name not in", values, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameBetween(String value1, String value2) {
            addCriterion("exterior_internal_name between", value1, value2, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorInternalNameNotBetween(String value1, String value2) {
            addCriterion("exterior_internal_name not between", value1, value2, "exteriorInternalName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameIsNull() {
            addCriterion("exterior_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameIsNotNull() {
            addCriterion("exterior_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameEqualTo(String value) {
            addCriterion("exterior_localized_name =", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameNotEqualTo(String value) {
            addCriterion("exterior_localized_name <>", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameGreaterThan(String value) {
            addCriterion("exterior_localized_name >", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("exterior_localized_name >=", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameLessThan(String value) {
            addCriterion("exterior_localized_name <", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("exterior_localized_name <=", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameLike(String value) {
            addCriterion("exterior_localized_name like", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameNotLike(String value) {
            addCriterion("exterior_localized_name not like", value, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameIn(List<String> values) {
            addCriterion("exterior_localized_name in", values, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameNotIn(List<String> values) {
            addCriterion("exterior_localized_name not in", values, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameBetween(String value1, String value2) {
            addCriterion("exterior_localized_name between", value1, value2, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andExteriorLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("exterior_localized_name not between", value1, value2, "exteriorLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityIdIsNull() {
            addCriterion("quality_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityIdIsNotNull() {
            addCriterion("quality_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityIdEqualTo(Integer value) {
            addCriterion("quality_id =", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotEqualTo(Integer value) {
            addCriterion("quality_id <>", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdGreaterThan(Integer value) {
            addCriterion("quality_id >", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_id >=", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdLessThan(Integer value) {
            addCriterion("quality_id <", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdLessThanOrEqualTo(Integer value) {
            addCriterion("quality_id <=", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdIn(List<Integer> values) {
            addCriterion("quality_id in", values, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotIn(List<Integer> values) {
            addCriterion("quality_id not in", values, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdBetween(Integer value1, Integer value2) {
            addCriterion("quality_id between", value1, value2, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_id not between", value1, value2, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameIsNull() {
            addCriterion("quality_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameIsNotNull() {
            addCriterion("quality_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameEqualTo(String value) {
            addCriterion("quality_internal_name =", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameNotEqualTo(String value) {
            addCriterion("quality_internal_name <>", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameGreaterThan(String value) {
            addCriterion("quality_internal_name >", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("quality_internal_name >=", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameLessThan(String value) {
            addCriterion("quality_internal_name <", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameLessThanOrEqualTo(String value) {
            addCriterion("quality_internal_name <=", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameLike(String value) {
            addCriterion("quality_internal_name like", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameNotLike(String value) {
            addCriterion("quality_internal_name not like", value, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameIn(List<String> values) {
            addCriterion("quality_internal_name in", values, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameNotIn(List<String> values) {
            addCriterion("quality_internal_name not in", values, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameBetween(String value1, String value2) {
            addCriterion("quality_internal_name between", value1, value2, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityInternalNameNotBetween(String value1, String value2) {
            addCriterion("quality_internal_name not between", value1, value2, "qualityInternalName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameIsNull() {
            addCriterion("quality_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameIsNotNull() {
            addCriterion("quality_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameEqualTo(String value) {
            addCriterion("quality_localized_name =", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameNotEqualTo(String value) {
            addCriterion("quality_localized_name <>", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameGreaterThan(String value) {
            addCriterion("quality_localized_name >", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("quality_localized_name >=", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameLessThan(String value) {
            addCriterion("quality_localized_name <", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("quality_localized_name <=", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameLike(String value) {
            addCriterion("quality_localized_name like", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameNotLike(String value) {
            addCriterion("quality_localized_name not like", value, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameIn(List<String> values) {
            addCriterion("quality_localized_name in", values, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameNotIn(List<String> values) {
            addCriterion("quality_localized_name not in", values, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameBetween(String value1, String value2) {
            addCriterion("quality_localized_name between", value1, value2, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andQualityLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("quality_localized_name not between", value1, value2, "qualityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityIdIsNull() {
            addCriterion("rarity_id is null");
            return (Criteria) this;
        }

        public Criteria andRarityIdIsNotNull() {
            addCriterion("rarity_id is not null");
            return (Criteria) this;
        }

        public Criteria andRarityIdEqualTo(Integer value) {
            addCriterion("rarity_id =", value, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdNotEqualTo(Integer value) {
            addCriterion("rarity_id <>", value, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdGreaterThan(Integer value) {
            addCriterion("rarity_id >", value, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rarity_id >=", value, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdLessThan(Integer value) {
            addCriterion("rarity_id <", value, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdLessThanOrEqualTo(Integer value) {
            addCriterion("rarity_id <=", value, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdIn(List<Integer> values) {
            addCriterion("rarity_id in", values, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdNotIn(List<Integer> values) {
            addCriterion("rarity_id not in", values, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdBetween(Integer value1, Integer value2) {
            addCriterion("rarity_id between", value1, value2, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rarity_id not between", value1, value2, "rarityId");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameIsNull() {
            addCriterion("rarity_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameIsNotNull() {
            addCriterion("rarity_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameEqualTo(String value) {
            addCriterion("rarity_internal_name =", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameNotEqualTo(String value) {
            addCriterion("rarity_internal_name <>", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameGreaterThan(String value) {
            addCriterion("rarity_internal_name >", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("rarity_internal_name >=", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameLessThan(String value) {
            addCriterion("rarity_internal_name <", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameLessThanOrEqualTo(String value) {
            addCriterion("rarity_internal_name <=", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameLike(String value) {
            addCriterion("rarity_internal_name like", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameNotLike(String value) {
            addCriterion("rarity_internal_name not like", value, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameIn(List<String> values) {
            addCriterion("rarity_internal_name in", values, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameNotIn(List<String> values) {
            addCriterion("rarity_internal_name not in", values, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameBetween(String value1, String value2) {
            addCriterion("rarity_internal_name between", value1, value2, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityInternalNameNotBetween(String value1, String value2) {
            addCriterion("rarity_internal_name not between", value1, value2, "rarityInternalName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameIsNull() {
            addCriterion("rarity_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameIsNotNull() {
            addCriterion("rarity_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameEqualTo(String value) {
            addCriterion("rarity_localized_name =", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameNotEqualTo(String value) {
            addCriterion("rarity_localized_name <>", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameGreaterThan(String value) {
            addCriterion("rarity_localized_name >", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("rarity_localized_name >=", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameLessThan(String value) {
            addCriterion("rarity_localized_name <", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("rarity_localized_name <=", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameLike(String value) {
            addCriterion("rarity_localized_name like", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameNotLike(String value) {
            addCriterion("rarity_localized_name not like", value, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameIn(List<String> values) {
            addCriterion("rarity_localized_name in", values, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameNotIn(List<String> values) {
            addCriterion("rarity_localized_name not in", values, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameBetween(String value1, String value2) {
            addCriterion("rarity_localized_name between", value1, value2, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andRarityLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("rarity_localized_name not between", value1, value2, "rarityLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameIsNull() {
            addCriterion("type_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameIsNotNull() {
            addCriterion("type_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameEqualTo(String value) {
            addCriterion("type_internal_name =", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameNotEqualTo(String value) {
            addCriterion("type_internal_name <>", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameGreaterThan(String value) {
            addCriterion("type_internal_name >", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_internal_name >=", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameLessThan(String value) {
            addCriterion("type_internal_name <", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameLessThanOrEqualTo(String value) {
            addCriterion("type_internal_name <=", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameLike(String value) {
            addCriterion("type_internal_name like", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameNotLike(String value) {
            addCriterion("type_internal_name not like", value, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameIn(List<String> values) {
            addCriterion("type_internal_name in", values, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameNotIn(List<String> values) {
            addCriterion("type_internal_name not in", values, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameBetween(String value1, String value2) {
            addCriterion("type_internal_name between", value1, value2, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeInternalNameNotBetween(String value1, String value2) {
            addCriterion("type_internal_name not between", value1, value2, "typeInternalName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameIsNull() {
            addCriterion("type_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameIsNotNull() {
            addCriterion("type_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameEqualTo(String value) {
            addCriterion("type_localized_name =", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameNotEqualTo(String value) {
            addCriterion("type_localized_name <>", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameGreaterThan(String value) {
            addCriterion("type_localized_name >", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_localized_name >=", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameLessThan(String value) {
            addCriterion("type_localized_name <", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("type_localized_name <=", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameLike(String value) {
            addCriterion("type_localized_name like", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameNotLike(String value) {
            addCriterion("type_localized_name not like", value, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameIn(List<String> values) {
            addCriterion("type_localized_name in", values, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameNotIn(List<String> values) {
            addCriterion("type_localized_name not in", values, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameBetween(String value1, String value2) {
            addCriterion("type_localized_name between", value1, value2, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andTypeLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("type_localized_name not between", value1, value2, "typeLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponIdIsNull() {
            addCriterion("weapon_id is null");
            return (Criteria) this;
        }

        public Criteria andWeaponIdIsNotNull() {
            addCriterion("weapon_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponIdEqualTo(Integer value) {
            addCriterion("weapon_id =", value, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdNotEqualTo(Integer value) {
            addCriterion("weapon_id <>", value, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdGreaterThan(Integer value) {
            addCriterion("weapon_id >", value, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("weapon_id >=", value, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdLessThan(Integer value) {
            addCriterion("weapon_id <", value, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdLessThanOrEqualTo(Integer value) {
            addCriterion("weapon_id <=", value, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdIn(List<Integer> values) {
            addCriterion("weapon_id in", values, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdNotIn(List<Integer> values) {
            addCriterion("weapon_id not in", values, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdBetween(Integer value1, Integer value2) {
            addCriterion("weapon_id between", value1, value2, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("weapon_id not between", value1, value2, "weaponId");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameIsNull() {
            addCriterion("weapon_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameIsNotNull() {
            addCriterion("weapon_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameEqualTo(String value) {
            addCriterion("weapon_internal_name =", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameNotEqualTo(String value) {
            addCriterion("weapon_internal_name <>", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameGreaterThan(String value) {
            addCriterion("weapon_internal_name >", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("weapon_internal_name >=", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameLessThan(String value) {
            addCriterion("weapon_internal_name <", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameLessThanOrEqualTo(String value) {
            addCriterion("weapon_internal_name <=", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameLike(String value) {
            addCriterion("weapon_internal_name like", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameNotLike(String value) {
            addCriterion("weapon_internal_name not like", value, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameIn(List<String> values) {
            addCriterion("weapon_internal_name in", values, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameNotIn(List<String> values) {
            addCriterion("weapon_internal_name not in", values, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameBetween(String value1, String value2) {
            addCriterion("weapon_internal_name between", value1, value2, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponInternalNameNotBetween(String value1, String value2) {
            addCriterion("weapon_internal_name not between", value1, value2, "weaponInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameIsNull() {
            addCriterion("weapon_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameIsNotNull() {
            addCriterion("weapon_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameEqualTo(String value) {
            addCriterion("weapon_localized_name =", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameNotEqualTo(String value) {
            addCriterion("weapon_localized_name <>", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameGreaterThan(String value) {
            addCriterion("weapon_localized_name >", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("weapon_localized_name >=", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameLessThan(String value) {
            addCriterion("weapon_localized_name <", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("weapon_localized_name <=", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameLike(String value) {
            addCriterion("weapon_localized_name like", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameNotLike(String value) {
            addCriterion("weapon_localized_name not like", value, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameIn(List<String> values) {
            addCriterion("weapon_localized_name in", values, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameNotIn(List<String> values) {
            addCriterion("weapon_localized_name not in", values, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameBetween(String value1, String value2) {
            addCriterion("weapon_localized_name between", value1, value2, "weaponLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("weapon_localized_name not between", value1, value2, "weaponLocalizedName");
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