package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment_From_MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Comment_From_MerchantExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountIsNull() {
            addCriterion("merchant_account is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountIsNotNull() {
            addCriterion("merchant_account is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountEqualTo(String value) {
            addCriterion("merchant_account =", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotEqualTo(String value) {
            addCriterion("merchant_account <>", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountGreaterThan(String value) {
            addCriterion("merchant_account >", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_account >=", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountLessThan(String value) {
            addCriterion("merchant_account <", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountLessThanOrEqualTo(String value) {
            addCriterion("merchant_account <=", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountLike(String value) {
            addCriterion("merchant_account like", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotLike(String value) {
            addCriterion("merchant_account not like", value, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountIn(List<String> values) {
            addCriterion("merchant_account in", values, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotIn(List<String> values) {
            addCriterion("merchant_account not in", values, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountBetween(String value1, String value2) {
            addCriterion("merchant_account between", value1, value2, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andMerchantAccountNotBetween(String value1, String value2) {
            addCriterion("merchant_account not between", value1, value2, "merchantAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNull() {
            addCriterion("customer_account is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNotNull() {
            addCriterion("customer_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountEqualTo(String value) {
            addCriterion("customer_account =", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotEqualTo(String value) {
            addCriterion("customer_account <>", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThan(String value) {
            addCriterion("customer_account >", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_account >=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThan(String value) {
            addCriterion("customer_account <", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThanOrEqualTo(String value) {
            addCriterion("customer_account <=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLike(String value) {
            addCriterion("customer_account like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotLike(String value) {
            addCriterion("customer_account not like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIn(List<String> values) {
            addCriterion("customer_account in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotIn(List<String> values) {
            addCriterion("customer_account not in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountBetween(String value1, String value2) {
            addCriterion("customer_account between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotBetween(String value1, String value2) {
            addCriterion("customer_account not between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdIsNull() {
            addCriterion("sale_record_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdIsNotNull() {
            addCriterion("sale_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdEqualTo(Integer value) {
            addCriterion("sale_record_id =", value, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdNotEqualTo(Integer value) {
            addCriterion("sale_record_id <>", value, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdGreaterThan(Integer value) {
            addCriterion("sale_record_id >", value, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_record_id >=", value, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdLessThan(Integer value) {
            addCriterion("sale_record_id <", value, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_record_id <=", value, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdIn(List<Integer> values) {
            addCriterion("sale_record_id in", values, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdNotIn(List<Integer> values) {
            addCriterion("sale_record_id not in", values, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_record_id between", value1, value2, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_record_id not between", value1, value2, "saleRecordId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andTextInfoIsNull() {
            addCriterion("text_info is null");
            return (Criteria) this;
        }

        public Criteria andTextInfoIsNotNull() {
            addCriterion("text_info is not null");
            return (Criteria) this;
        }

        public Criteria andTextInfoEqualTo(String value) {
            addCriterion("text_info =", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotEqualTo(String value) {
            addCriterion("text_info <>", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoGreaterThan(String value) {
            addCriterion("text_info >", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoGreaterThanOrEqualTo(String value) {
            addCriterion("text_info >=", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoLessThan(String value) {
            addCriterion("text_info <", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoLessThanOrEqualTo(String value) {
            addCriterion("text_info <=", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoLike(String value) {
            addCriterion("text_info like", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotLike(String value) {
            addCriterion("text_info not like", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoIn(List<String> values) {
            addCriterion("text_info in", values, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotIn(List<String> values) {
            addCriterion("text_info not in", values, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoBetween(String value1, String value2) {
            addCriterion("text_info between", value1, value2, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotBetween(String value1, String value2) {
            addCriterion("text_info not between", value1, value2, "textInfo");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
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