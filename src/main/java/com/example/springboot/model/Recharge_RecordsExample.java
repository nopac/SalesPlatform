package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recharge_RecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Recharge_RecordsExample() {
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

        public Criteria andRechargeRecordIdIsNull() {
            addCriterion("recharge_record_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdIsNotNull() {
            addCriterion("recharge_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdEqualTo(Integer value) {
            addCriterion("recharge_record_id =", value, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdNotEqualTo(Integer value) {
            addCriterion("recharge_record_id <>", value, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdGreaterThan(Integer value) {
            addCriterion("recharge_record_id >", value, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_record_id >=", value, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdLessThan(Integer value) {
            addCriterion("recharge_record_id <", value, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_record_id <=", value, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdIn(List<Integer> values) {
            addCriterion("recharge_record_id in", values, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdNotIn(List<Integer> values) {
            addCriterion("recharge_record_id not in", values, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("recharge_record_id between", value1, value2, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_record_id not between", value1, value2, "rechargeRecordId");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerIsNull() {
            addCriterion("recharge_customer is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerIsNotNull() {
            addCriterion("recharge_customer is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerEqualTo(String value) {
            addCriterion("recharge_customer =", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotEqualTo(String value) {
            addCriterion("recharge_customer <>", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerGreaterThan(String value) {
            addCriterion("recharge_customer >", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_customer >=", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerLessThan(String value) {
            addCriterion("recharge_customer <", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerLessThanOrEqualTo(String value) {
            addCriterion("recharge_customer <=", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerLike(String value) {
            addCriterion("recharge_customer like", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotLike(String value) {
            addCriterion("recharge_customer not like", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerIn(List<String> values) {
            addCriterion("recharge_customer in", values, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotIn(List<String> values) {
            addCriterion("recharge_customer not in", values, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerBetween(String value1, String value2) {
            addCriterion("recharge_customer between", value1, value2, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotBetween(String value1, String value2) {
            addCriterion("recharge_customer not between", value1, value2, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(Double value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(Double value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(Double value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(Double value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(Double value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<Double> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<Double> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(Double value1, Double value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(Double value1, Double value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNull() {
            addCriterion("recharge_date is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNotNull() {
            addCriterion("recharge_date is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateEqualTo(Date value) {
            addCriterion("recharge_date =", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotEqualTo(Date value) {
            addCriterion("recharge_date <>", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThan(Date value) {
            addCriterion("recharge_date >", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_date >=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThan(Date value) {
            addCriterion("recharge_date <", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThanOrEqualTo(Date value) {
            addCriterion("recharge_date <=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIn(List<Date> values) {
            addCriterion("recharge_date in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotIn(List<Date> values) {
            addCriterion("recharge_date not in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateBetween(Date value1, Date value2) {
            addCriterion("recharge_date between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotBetween(Date value1, Date value2) {
            addCriterion("recharge_date not between", value1, value2, "rechargeDate");
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