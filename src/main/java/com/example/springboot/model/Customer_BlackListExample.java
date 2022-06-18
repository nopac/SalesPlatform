package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer_BlackListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Customer_BlackListExample() {
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

        public Criteria andBlacklistIdIsNull() {
            addCriterion("blacklist_id is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdIsNotNull() {
            addCriterion("blacklist_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdEqualTo(Integer value) {
            addCriterion("blacklist_id =", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotEqualTo(Integer value) {
            addCriterion("blacklist_id <>", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdGreaterThan(Integer value) {
            addCriterion("blacklist_id >", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blacklist_id >=", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdLessThan(Integer value) {
            addCriterion("blacklist_id <", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdLessThanOrEqualTo(Integer value) {
            addCriterion("blacklist_id <=", value, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdIn(List<Integer> values) {
            addCriterion("blacklist_id in", values, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotIn(List<Integer> values) {
            addCriterion("blacklist_id not in", values, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdBetween(Integer value1, Integer value2) {
            addCriterion("blacklist_id between", value1, value2, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blacklist_id not between", value1, value2, "blacklistId");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromIsNull() {
            addCriterion("blacklist_from is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromIsNotNull() {
            addCriterion("blacklist_from is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromEqualTo(String value) {
            addCriterion("blacklist_from =", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromNotEqualTo(String value) {
            addCriterion("blacklist_from <>", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromGreaterThan(String value) {
            addCriterion("blacklist_from >", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromGreaterThanOrEqualTo(String value) {
            addCriterion("blacklist_from >=", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromLessThan(String value) {
            addCriterion("blacklist_from <", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromLessThanOrEqualTo(String value) {
            addCriterion("blacklist_from <=", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromLike(String value) {
            addCriterion("blacklist_from like", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromNotLike(String value) {
            addCriterion("blacklist_from not like", value, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromIn(List<String> values) {
            addCriterion("blacklist_from in", values, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromNotIn(List<String> values) {
            addCriterion("blacklist_from not in", values, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromBetween(String value1, String value2) {
            addCriterion("blacklist_from between", value1, value2, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistFromNotBetween(String value1, String value2) {
            addCriterion("blacklist_from not between", value1, value2, "blacklistFrom");
            return (Criteria) this;
        }

        public Criteria andBlacklistToIsNull() {
            addCriterion("blacklist_to is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistToIsNotNull() {
            addCriterion("blacklist_to is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistToEqualTo(String value) {
            addCriterion("blacklist_to =", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToNotEqualTo(String value) {
            addCriterion("blacklist_to <>", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToGreaterThan(String value) {
            addCriterion("blacklist_to >", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToGreaterThanOrEqualTo(String value) {
            addCriterion("blacklist_to >=", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToLessThan(String value) {
            addCriterion("blacklist_to <", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToLessThanOrEqualTo(String value) {
            addCriterion("blacklist_to <=", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToLike(String value) {
            addCriterion("blacklist_to like", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToNotLike(String value) {
            addCriterion("blacklist_to not like", value, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToIn(List<String> values) {
            addCriterion("blacklist_to in", values, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToNotIn(List<String> values) {
            addCriterion("blacklist_to not in", values, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToBetween(String value1, String value2) {
            addCriterion("blacklist_to between", value1, value2, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistToNotBetween(String value1, String value2) {
            addCriterion("blacklist_to not between", value1, value2, "blacklistTo");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeIsNull() {
            addCriterion("blacklist_type is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeIsNotNull() {
            addCriterion("blacklist_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeEqualTo(String value) {
            addCriterion("blacklist_type =", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeNotEqualTo(String value) {
            addCriterion("blacklist_type <>", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeGreaterThan(String value) {
            addCriterion("blacklist_type >", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blacklist_type >=", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeLessThan(String value) {
            addCriterion("blacklist_type <", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeLessThanOrEqualTo(String value) {
            addCriterion("blacklist_type <=", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeLike(String value) {
            addCriterion("blacklist_type like", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeNotLike(String value) {
            addCriterion("blacklist_type not like", value, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeIn(List<String> values) {
            addCriterion("blacklist_type in", values, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeNotIn(List<String> values) {
            addCriterion("blacklist_type not in", values, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeBetween(String value1, String value2) {
            addCriterion("blacklist_type between", value1, value2, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistTypeNotBetween(String value1, String value2) {
            addCriterion("blacklist_type not between", value1, value2, "blacklistType");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateIsNull() {
            addCriterion("blacklist_start_date is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateIsNotNull() {
            addCriterion("blacklist_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateEqualTo(Date value) {
            addCriterion("blacklist_start_date =", value, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateNotEqualTo(Date value) {
            addCriterion("blacklist_start_date <>", value, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateGreaterThan(Date value) {
            addCriterion("blacklist_start_date >", value, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("blacklist_start_date >=", value, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateLessThan(Date value) {
            addCriterion("blacklist_start_date <", value, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateLessThanOrEqualTo(Date value) {
            addCriterion("blacklist_start_date <=", value, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateIn(List<Date> values) {
            addCriterion("blacklist_start_date in", values, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateNotIn(List<Date> values) {
            addCriterion("blacklist_start_date not in", values, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateBetween(Date value1, Date value2) {
            addCriterion("blacklist_start_date between", value1, value2, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistStartDateNotBetween(Date value1, Date value2) {
            addCriterion("blacklist_start_date not between", value1, value2, "blacklistStartDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateIsNull() {
            addCriterion("blacklist_end_date is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateIsNotNull() {
            addCriterion("blacklist_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateEqualTo(Date value) {
            addCriterion("blacklist_end_date =", value, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateNotEqualTo(Date value) {
            addCriterion("blacklist_end_date <>", value, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateGreaterThan(Date value) {
            addCriterion("blacklist_end_date >", value, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("blacklist_end_date >=", value, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateLessThan(Date value) {
            addCriterion("blacklist_end_date <", value, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateLessThanOrEqualTo(Date value) {
            addCriterion("blacklist_end_date <=", value, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateIn(List<Date> values) {
            addCriterion("blacklist_end_date in", values, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateNotIn(List<Date> values) {
            addCriterion("blacklist_end_date not in", values, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateBetween(Date value1, Date value2) {
            addCriterion("blacklist_end_date between", value1, value2, "blacklistEndDate");
            return (Criteria) this;
        }

        public Criteria andBlacklistEndDateNotBetween(Date value1, Date value2) {
            addCriterion("blacklist_end_date not between", value1, value2, "blacklistEndDate");
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