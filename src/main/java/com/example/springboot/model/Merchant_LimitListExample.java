package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Merchant_LimitListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Merchant_LimitListExample() {
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

        public Criteria andLimitlistRecordIdIsNull() {
            addCriterion("limitlist_record_id is null");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdIsNotNull() {
            addCriterion("limitlist_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdEqualTo(Integer value) {
            addCriterion("limitlist_record_id =", value, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdNotEqualTo(Integer value) {
            addCriterion("limitlist_record_id <>", value, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdGreaterThan(Integer value) {
            addCriterion("limitlist_record_id >", value, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitlist_record_id >=", value, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdLessThan(Integer value) {
            addCriterion("limitlist_record_id <", value, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("limitlist_record_id <=", value, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdIn(List<Integer> values) {
            addCriterion("limitlist_record_id in", values, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdNotIn(List<Integer> values) {
            addCriterion("limitlist_record_id not in", values, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("limitlist_record_id between", value1, value2, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitlistRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("limitlist_record_id not between", value1, value2, "limitlistRecordId");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantIsNull() {
            addCriterion("limit_merchant is null");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantIsNotNull() {
            addCriterion("limit_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantEqualTo(String value) {
            addCriterion("limit_merchant =", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantNotEqualTo(String value) {
            addCriterion("limit_merchant <>", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantGreaterThan(String value) {
            addCriterion("limit_merchant >", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("limit_merchant >=", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantLessThan(String value) {
            addCriterion("limit_merchant <", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantLessThanOrEqualTo(String value) {
            addCriterion("limit_merchant <=", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantLike(String value) {
            addCriterion("limit_merchant like", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantNotLike(String value) {
            addCriterion("limit_merchant not like", value, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantIn(List<String> values) {
            addCriterion("limit_merchant in", values, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantNotIn(List<String> values) {
            addCriterion("limit_merchant not in", values, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantBetween(String value1, String value2) {
            addCriterion("limit_merchant between", value1, value2, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitMerchantNotBetween(String value1, String value2) {
            addCriterion("limit_merchant not between", value1, value2, "limitMerchant");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIsNull() {
            addCriterion("limit_start_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIsNotNull() {
            addCriterion("limit_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateEqualTo(Date value) {
            addCriterion("limit_start_date =", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotEqualTo(Date value) {
            addCriterion("limit_start_date <>", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateGreaterThan(Date value) {
            addCriterion("limit_start_date >", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_start_date >=", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLessThan(Date value) {
            addCriterion("limit_start_date <", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLessThanOrEqualTo(Date value) {
            addCriterion("limit_start_date <=", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIn(List<Date> values) {
            addCriterion("limit_start_date in", values, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotIn(List<Date> values) {
            addCriterion("limit_start_date not in", values, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateBetween(Date value1, Date value2) {
            addCriterion("limit_start_date between", value1, value2, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotBetween(Date value1, Date value2) {
            addCriterion("limit_start_date not between", value1, value2, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIsNull() {
            addCriterion("limit_end_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIsNotNull() {
            addCriterion("limit_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateEqualTo(Date value) {
            addCriterion("limit_end_date =", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotEqualTo(Date value) {
            addCriterion("limit_end_date <>", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateGreaterThan(Date value) {
            addCriterion("limit_end_date >", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_end_date >=", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLessThan(Date value) {
            addCriterion("limit_end_date <", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLessThanOrEqualTo(Date value) {
            addCriterion("limit_end_date <=", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIn(List<Date> values) {
            addCriterion("limit_end_date in", values, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotIn(List<Date> values) {
            addCriterion("limit_end_date not in", values, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateBetween(Date value1, Date value2) {
            addCriterion("limit_end_date between", value1, value2, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotBetween(Date value1, Date value2) {
            addCriterion("limit_end_date not between", value1, value2, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(String value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(String value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(String value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(String value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLike(String value) {
            addCriterion("limit_type like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotLike(String value) {
            addCriterion("limit_type not like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<String> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<String> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(String value1, String value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(String value1, String value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
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