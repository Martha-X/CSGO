package com.electronic.boot.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrnamentOnSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrnamentOnSaleExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameIsNull() {
            addCriterion("category_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameIsNotNull() {
            addCriterion("category_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameEqualTo(String value) {
            addCriterion("category_internal_name =", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameNotEqualTo(String value) {
            addCriterion("category_internal_name <>", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameGreaterThan(String value) {
            addCriterion("category_internal_name >", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_internal_name >=", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameLessThan(String value) {
            addCriterion("category_internal_name <", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameLessThanOrEqualTo(String value) {
            addCriterion("category_internal_name <=", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameLike(String value) {
            addCriterion("category_internal_name like", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameNotLike(String value) {
            addCriterion("category_internal_name not like", value, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameIn(List<String> values) {
            addCriterion("category_internal_name in", values, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameNotIn(List<String> values) {
            addCriterion("category_internal_name not in", values, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameBetween(String value1, String value2) {
            addCriterion("category_internal_name between", value1, value2, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryInternalNameNotBetween(String value1, String value2) {
            addCriterion("category_internal_name not between", value1, value2, "categoryInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameIsNull() {
            addCriterion("category_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameIsNotNull() {
            addCriterion("category_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameEqualTo(String value) {
            addCriterion("category_localized_name =", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameNotEqualTo(String value) {
            addCriterion("category_localized_name <>", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameGreaterThan(String value) {
            addCriterion("category_localized_name >", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_localized_name >=", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameLessThan(String value) {
            addCriterion("category_localized_name <", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("category_localized_name <=", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameLike(String value) {
            addCriterion("category_localized_name like", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameNotLike(String value) {
            addCriterion("category_localized_name not like", value, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameIn(List<String> values) {
            addCriterion("category_localized_name in", values, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameNotIn(List<String> values) {
            addCriterion("category_localized_name not in", values, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameBetween(String value1, String value2) {
            addCriterion("category_localized_name between", value1, value2, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("category_localized_name not between", value1, value2, "categoryLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdIsNull() {
            addCriterion("category_group_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdIsNotNull() {
            addCriterion("category_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdEqualTo(Integer value) {
            addCriterion("category_group_id =", value, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdNotEqualTo(Integer value) {
            addCriterion("category_group_id <>", value, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdGreaterThan(Integer value) {
            addCriterion("category_group_id >", value, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_group_id >=", value, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdLessThan(Integer value) {
            addCriterion("category_group_id <", value, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_group_id <=", value, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdIn(List<Integer> values) {
            addCriterion("category_group_id in", values, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdNotIn(List<Integer> values) {
            addCriterion("category_group_id not in", values, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("category_group_id between", value1, value2, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_group_id not between", value1, value2, "categoryGroupId");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameIsNull() {
            addCriterion("category_group_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameIsNotNull() {
            addCriterion("category_group_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameEqualTo(String value) {
            addCriterion("category_group_internal_name =", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameNotEqualTo(String value) {
            addCriterion("category_group_internal_name <>", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameGreaterThan(String value) {
            addCriterion("category_group_internal_name >", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_group_internal_name >=", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameLessThan(String value) {
            addCriterion("category_group_internal_name <", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameLessThanOrEqualTo(String value) {
            addCriterion("category_group_internal_name <=", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameLike(String value) {
            addCriterion("category_group_internal_name like", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameNotLike(String value) {
            addCriterion("category_group_internal_name not like", value, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameIn(List<String> values) {
            addCriterion("category_group_internal_name in", values, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameNotIn(List<String> values) {
            addCriterion("category_group_internal_name not in", values, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameBetween(String value1, String value2) {
            addCriterion("category_group_internal_name between", value1, value2, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupInternalNameNotBetween(String value1, String value2) {
            addCriterion("category_group_internal_name not between", value1, value2, "categoryGroupInternalName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameIsNull() {
            addCriterion("category_group_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameIsNotNull() {
            addCriterion("category_group_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameEqualTo(String value) {
            addCriterion("category_group_localized_name =", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameNotEqualTo(String value) {
            addCriterion("category_group_localized_name <>", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameGreaterThan(String value) {
            addCriterion("category_group_localized_name >", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_group_localized_name >=", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameLessThan(String value) {
            addCriterion("category_group_localized_name <", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("category_group_localized_name <=", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameLike(String value) {
            addCriterion("category_group_localized_name like", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameNotLike(String value) {
            addCriterion("category_group_localized_name not like", value, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameIn(List<String> values) {
            addCriterion("category_group_localized_name in", values, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameNotIn(List<String> values) {
            addCriterion("category_group_localized_name not in", values, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameBetween(String value1, String value2) {
            addCriterion("category_group_localized_name between", value1, value2, "categoryGroupLocalizedName");
            return (Criteria) this;
        }

        public Criteria andCategoryGroupLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("category_group_localized_name not between", value1, value2, "categoryGroupLocalizedName");
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

        public Criteria andItemsetIdIsNull() {
            addCriterion("itemset_id is null");
            return (Criteria) this;
        }

        public Criteria andItemsetIdIsNotNull() {
            addCriterion("itemset_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemsetIdEqualTo(Integer value) {
            addCriterion("itemset_id =", value, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdNotEqualTo(Integer value) {
            addCriterion("itemset_id <>", value, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdGreaterThan(Integer value) {
            addCriterion("itemset_id >", value, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemset_id >=", value, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdLessThan(Integer value) {
            addCriterion("itemset_id <", value, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdLessThanOrEqualTo(Integer value) {
            addCriterion("itemset_id <=", value, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdIn(List<Integer> values) {
            addCriterion("itemset_id in", values, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdNotIn(List<Integer> values) {
            addCriterion("itemset_id not in", values, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdBetween(Integer value1, Integer value2) {
            addCriterion("itemset_id between", value1, value2, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("itemset_id not between", value1, value2, "itemsetId");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameIsNull() {
            addCriterion("itemset_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameIsNotNull() {
            addCriterion("itemset_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameEqualTo(String value) {
            addCriterion("itemset_internal_name =", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameNotEqualTo(String value) {
            addCriterion("itemset_internal_name <>", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameGreaterThan(String value) {
            addCriterion("itemset_internal_name >", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("itemset_internal_name >=", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameLessThan(String value) {
            addCriterion("itemset_internal_name <", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameLessThanOrEqualTo(String value) {
            addCriterion("itemset_internal_name <=", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameLike(String value) {
            addCriterion("itemset_internal_name like", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameNotLike(String value) {
            addCriterion("itemset_internal_name not like", value, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameIn(List<String> values) {
            addCriterion("itemset_internal_name in", values, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameNotIn(List<String> values) {
            addCriterion("itemset_internal_name not in", values, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameBetween(String value1, String value2) {
            addCriterion("itemset_internal_name between", value1, value2, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetInternalNameNotBetween(String value1, String value2) {
            addCriterion("itemset_internal_name not between", value1, value2, "itemsetInternalName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameIsNull() {
            addCriterion("itemset_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameIsNotNull() {
            addCriterion("itemset_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameEqualTo(String value) {
            addCriterion("itemset_localized_name =", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameNotEqualTo(String value) {
            addCriterion("itemset_localized_name <>", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameGreaterThan(String value) {
            addCriterion("itemset_localized_name >", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("itemset_localized_name >=", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameLessThan(String value) {
            addCriterion("itemset_localized_name <", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("itemset_localized_name <=", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameLike(String value) {
            addCriterion("itemset_localized_name like", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameNotLike(String value) {
            addCriterion("itemset_localized_name not like", value, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameIn(List<String> values) {
            addCriterion("itemset_localized_name in", values, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameNotIn(List<String> values) {
            addCriterion("itemset_localized_name not in", values, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameBetween(String value1, String value2) {
            addCriterion("itemset_localized_name between", value1, value2, "itemsetLocalizedName");
            return (Criteria) this;
        }

        public Criteria andItemsetLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("itemset_localized_name not between", value1, value2, "itemsetLocalizedName");
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

        public Criteria andWeaponcaseIdIsNull() {
            addCriterion("weaponcase_id is null");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdIsNotNull() {
            addCriterion("weaponcase_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdEqualTo(Integer value) {
            addCriterion("weaponcase_id =", value, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdNotEqualTo(Integer value) {
            addCriterion("weaponcase_id <>", value, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdGreaterThan(Integer value) {
            addCriterion("weaponcase_id >", value, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("weaponcase_id >=", value, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdLessThan(Integer value) {
            addCriterion("weaponcase_id <", value, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("weaponcase_id <=", value, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdIn(List<Integer> values) {
            addCriterion("weaponcase_id in", values, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdNotIn(List<Integer> values) {
            addCriterion("weaponcase_id not in", values, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdBetween(Integer value1, Integer value2) {
            addCriterion("weaponcase_id between", value1, value2, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("weaponcase_id not between", value1, value2, "weaponcaseId");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameIsNull() {
            addCriterion("weaponcase_internal_name is null");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameIsNotNull() {
            addCriterion("weaponcase_internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameEqualTo(String value) {
            addCriterion("weaponcase_internal_name =", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameNotEqualTo(String value) {
            addCriterion("weaponcase_internal_name <>", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameGreaterThan(String value) {
            addCriterion("weaponcase_internal_name >", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("weaponcase_internal_name >=", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameLessThan(String value) {
            addCriterion("weaponcase_internal_name <", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameLessThanOrEqualTo(String value) {
            addCriterion("weaponcase_internal_name <=", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameLike(String value) {
            addCriterion("weaponcase_internal_name like", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameNotLike(String value) {
            addCriterion("weaponcase_internal_name not like", value, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameIn(List<String> values) {
            addCriterion("weaponcase_internal_name in", values, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameNotIn(List<String> values) {
            addCriterion("weaponcase_internal_name not in", values, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameBetween(String value1, String value2) {
            addCriterion("weaponcase_internal_name between", value1, value2, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseInternalNameNotBetween(String value1, String value2) {
            addCriterion("weaponcase_internal_name not between", value1, value2, "weaponcaseInternalName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameIsNull() {
            addCriterion("weaponcase_localized_name is null");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameIsNotNull() {
            addCriterion("weaponcase_localized_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameEqualTo(String value) {
            addCriterion("weaponcase_localized_name =", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameNotEqualTo(String value) {
            addCriterion("weaponcase_localized_name <>", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameGreaterThan(String value) {
            addCriterion("weaponcase_localized_name >", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("weaponcase_localized_name >=", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameLessThan(String value) {
            addCriterion("weaponcase_localized_name <", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameLessThanOrEqualTo(String value) {
            addCriterion("weaponcase_localized_name <=", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameLike(String value) {
            addCriterion("weaponcase_localized_name like", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameNotLike(String value) {
            addCriterion("weaponcase_localized_name not like", value, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameIn(List<String> values) {
            addCriterion("weaponcase_localized_name in", values, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameNotIn(List<String> values) {
            addCriterion("weaponcase_localized_name not in", values, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameBetween(String value1, String value2) {
            addCriterion("weaponcase_localized_name between", value1, value2, "weaponcaseLocalizedName");
            return (Criteria) this;
        }

        public Criteria andWeaponcaseLocalizedNameNotBetween(String value1, String value2) {
            addCriterion("weaponcase_localized_name not between", value1, value2, "weaponcaseLocalizedName");
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

        public Criteria andPaintindexIsNull() {
            addCriterion("paintindex is null");
            return (Criteria) this;
        }

        public Criteria andPaintindexIsNotNull() {
            addCriterion("paintindex is not null");
            return (Criteria) this;
        }

        public Criteria andPaintindexEqualTo(Integer value) {
            addCriterion("paintindex =", value, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexNotEqualTo(Integer value) {
            addCriterion("paintindex <>", value, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexGreaterThan(Integer value) {
            addCriterion("paintindex >", value, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("paintindex >=", value, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexLessThan(Integer value) {
            addCriterion("paintindex <", value, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexLessThanOrEqualTo(Integer value) {
            addCriterion("paintindex <=", value, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexIn(List<Integer> values) {
            addCriterion("paintindex in", values, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexNotIn(List<Integer> values) {
            addCriterion("paintindex not in", values, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexBetween(Integer value1, Integer value2) {
            addCriterion("paintindex between", value1, value2, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintindexNotBetween(Integer value1, Integer value2) {
            addCriterion("paintindex not between", value1, value2, "paintindex");
            return (Criteria) this;
        }

        public Criteria andPaintseedIsNull() {
            addCriterion("paintseed is null");
            return (Criteria) this;
        }

        public Criteria andPaintseedIsNotNull() {
            addCriterion("paintseed is not null");
            return (Criteria) this;
        }

        public Criteria andPaintseedEqualTo(Integer value) {
            addCriterion("paintseed =", value, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedNotEqualTo(Integer value) {
            addCriterion("paintseed <>", value, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedGreaterThan(Integer value) {
            addCriterion("paintseed >", value, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedGreaterThanOrEqualTo(Integer value) {
            addCriterion("paintseed >=", value, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedLessThan(Integer value) {
            addCriterion("paintseed <", value, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedLessThanOrEqualTo(Integer value) {
            addCriterion("paintseed <=", value, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedIn(List<Integer> values) {
            addCriterion("paintseed in", values, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedNotIn(List<Integer> values) {
            addCriterion("paintseed not in", values, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedBetween(Integer value1, Integer value2) {
            addCriterion("paintseed between", value1, value2, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintseedNotBetween(Integer value1, Integer value2) {
            addCriterion("paintseed not between", value1, value2, "paintseed");
            return (Criteria) this;
        }

        public Criteria andPaintwearIsNull() {
            addCriterion("paintwear is null");
            return (Criteria) this;
        }

        public Criteria andPaintwearIsNotNull() {
            addCriterion("paintwear is not null");
            return (Criteria) this;
        }

        public Criteria andPaintwearEqualTo(String value) {
            addCriterion("paintwear =", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearNotEqualTo(String value) {
            addCriterion("paintwear <>", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearGreaterThan(String value) {
            addCriterion("paintwear >", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearGreaterThanOrEqualTo(String value) {
            addCriterion("paintwear >=", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearLessThan(String value) {
            addCriterion("paintwear <", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearLessThanOrEqualTo(String value) {
            addCriterion("paintwear <=", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearLike(String value) {
            addCriterion("paintwear like", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearNotLike(String value) {
            addCriterion("paintwear not like", value, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearIn(List<String> values) {
            addCriterion("paintwear in", values, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearNotIn(List<String> values) {
            addCriterion("paintwear not in", values, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearBetween(String value1, String value2) {
            addCriterion("paintwear between", value1, value2, "paintwear");
            return (Criteria) this;
        }

        public Criteria andPaintwearNotBetween(String value1, String value2) {
            addCriterion("paintwear not between", value1, value2, "paintwear");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlIsNull() {
            addCriterion("background_image_url is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlIsNotNull() {
            addCriterion("background_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlEqualTo(String value) {
            addCriterion("background_image_url =", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotEqualTo(String value) {
            addCriterion("background_image_url <>", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlGreaterThan(String value) {
            addCriterion("background_image_url >", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("background_image_url >=", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlLessThan(String value) {
            addCriterion("background_image_url <", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlLessThanOrEqualTo(String value) {
            addCriterion("background_image_url <=", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlLike(String value) {
            addCriterion("background_image_url like", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotLike(String value) {
            addCriterion("background_image_url not like", value, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlIn(List<String> values) {
            addCriterion("background_image_url in", values, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotIn(List<String> values) {
            addCriterion("background_image_url not in", values, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlBetween(String value1, String value2) {
            addCriterion("background_image_url between", value1, value2, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageUrlNotBetween(String value1, String value2) {
            addCriterion("background_image_url not between", value1, value2, "backgroundImageUrl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutIsNull() {
            addCriterion("is_sold_out is null");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutIsNotNull() {
            addCriterion("is_sold_out is not null");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutEqualTo(Integer value) {
            addCriterion("is_sold_out =", value, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutNotEqualTo(Integer value) {
            addCriterion("is_sold_out <>", value, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutGreaterThan(Integer value) {
            addCriterion("is_sold_out >", value, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sold_out >=", value, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutLessThan(Integer value) {
            addCriterion("is_sold_out <", value, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutLessThanOrEqualTo(Integer value) {
            addCriterion("is_sold_out <=", value, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutIn(List<Integer> values) {
            addCriterion("is_sold_out in", values, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutNotIn(List<Integer> values) {
            addCriterion("is_sold_out not in", values, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutBetween(Integer value1, Integer value2) {
            addCriterion("is_sold_out between", value1, value2, "isSoldOut");
            return (Criteria) this;
        }

        public Criteria andIsSoldOutNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sold_out not between", value1, value2, "isSoldOut");
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