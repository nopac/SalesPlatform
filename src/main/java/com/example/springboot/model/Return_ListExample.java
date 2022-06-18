package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Return_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Return_ListExample() {
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

        public Criteria andSaleRecordIsNull() {
            addCriterion("sale_record is null");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIsNotNull() {
            addCriterion("sale_record is not null");
            return (Criteria) this;
        }

        public Criteria andSaleRecordEqualTo(Integer value) {
            addCriterion("sale_record =", value, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordNotEqualTo(Integer value) {
            addCriterion("sale_record <>", value, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordGreaterThan(Integer value) {
            addCriterion("sale_record >", value, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_record >=", value, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordLessThan(Integer value) {
            addCriterion("sale_record <", value, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordLessThanOrEqualTo(Integer value) {
            addCriterion("sale_record <=", value, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordIn(List<Integer> values) {
            addCriterion("sale_record in", values, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordNotIn(List<Integer> values) {
            addCriterion("sale_record not in", values, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordBetween(Integer value1, Integer value2) {
            addCriterion("sale_record between", value1, value2, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andSaleRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_record not between", value1, value2, "saleRecord");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerIsNull() {
            addCriterion("return_customer is null");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerIsNotNull() {
            addCriterion("return_customer is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerEqualTo(String value) {
            addCriterion("return_customer =", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerNotEqualTo(String value) {
            addCriterion("return_customer <>", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerGreaterThan(String value) {
            addCriterion("return_customer >", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("return_customer >=", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerLessThan(String value) {
            addCriterion("return_customer <", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerLessThanOrEqualTo(String value) {
            addCriterion("return_customer <=", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerLike(String value) {
            addCriterion("return_customer like", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerNotLike(String value) {
            addCriterion("return_customer not like", value, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerIn(List<String> values) {
            addCriterion("return_customer in", values, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerNotIn(List<String> values) {
            addCriterion("return_customer not in", values, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerBetween(String value1, String value2) {
            addCriterion("return_customer between", value1, value2, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnCustomerNotBetween(String value1, String value2) {
            addCriterion("return_customer not between", value1, value2, "returnCustomer");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantIsNull() {
            addCriterion("return_merchant is null");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantIsNotNull() {
            addCriterion("return_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantEqualTo(String value) {
            addCriterion("return_merchant =", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantNotEqualTo(String value) {
            addCriterion("return_merchant <>", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantGreaterThan(String value) {
            addCriterion("return_merchant >", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("return_merchant >=", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantLessThan(String value) {
            addCriterion("return_merchant <", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantLessThanOrEqualTo(String value) {
            addCriterion("return_merchant <=", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantLike(String value) {
            addCriterion("return_merchant like", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantNotLike(String value) {
            addCriterion("return_merchant not like", value, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantIn(List<String> values) {
            addCriterion("return_merchant in", values, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantNotIn(List<String> values) {
            addCriterion("return_merchant not in", values, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantBetween(String value1, String value2) {
            addCriterion("return_merchant between", value1, value2, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnMerchantNotBetween(String value1, String value2) {
            addCriterion("return_merchant not between", value1, value2, "returnMerchant");
            return (Criteria) this;
        }

        public Criteria andReturnProductIsNull() {
            addCriterion("return_product is null");
            return (Criteria) this;
        }

        public Criteria andReturnProductIsNotNull() {
            addCriterion("return_product is not null");
            return (Criteria) this;
        }

        public Criteria andReturnProductEqualTo(Integer value) {
            addCriterion("return_product =", value, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductNotEqualTo(Integer value) {
            addCriterion("return_product <>", value, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductGreaterThan(Integer value) {
            addCriterion("return_product >", value, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_product >=", value, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductLessThan(Integer value) {
            addCriterion("return_product <", value, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductLessThanOrEqualTo(Integer value) {
            addCriterion("return_product <=", value, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductIn(List<Integer> values) {
            addCriterion("return_product in", values, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductNotIn(List<Integer> values) {
            addCriterion("return_product not in", values, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductBetween(Integer value1, Integer value2) {
            addCriterion("return_product between", value1, value2, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnProductNotBetween(Integer value1, Integer value2) {
            addCriterion("return_product not between", value1, value2, "returnProduct");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(Integer value) {
            addCriterion("return_amount =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(Integer value) {
            addCriterion("return_amount <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(Integer value) {
            addCriterion("return_amount >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_amount >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(Integer value) {
            addCriterion("return_amount <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(Integer value) {
            addCriterion("return_amount <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<Integer> values) {
            addCriterion("return_amount in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<Integer> values) {
            addCriterion("return_amount not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(Integer value1, Integer value2) {
            addCriterion("return_amount between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("return_amount not between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIsNull() {
            addCriterion("return_money is null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIsNotNull() {
            addCriterion("return_money is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyEqualTo(Double value) {
            addCriterion("return_money =", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotEqualTo(Double value) {
            addCriterion("return_money <>", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyGreaterThan(Double value) {
            addCriterion("return_money >", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("return_money >=", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLessThan(Double value) {
            addCriterion("return_money <", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLessThanOrEqualTo(Double value) {
            addCriterion("return_money <=", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIn(List<Double> values) {
            addCriterion("return_money in", values, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotIn(List<Double> values) {
            addCriterion("return_money not in", values, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyBetween(Double value1, Double value2) {
            addCriterion("return_money between", value1, value2, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotBetween(Double value1, Double value2) {
            addCriterion("return_money not between", value1, value2, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterion("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterion("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterion("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterion("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterion("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterion("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterion("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnStateIsNull() {
            addCriterion("return_state is null");
            return (Criteria) this;
        }

        public Criteria andReturnStateIsNotNull() {
            addCriterion("return_state is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStateEqualTo(String value) {
            addCriterion("return_state =", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotEqualTo(String value) {
            addCriterion("return_state <>", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateGreaterThan(String value) {
            addCriterion("return_state >", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateGreaterThanOrEqualTo(String value) {
            addCriterion("return_state >=", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLessThan(String value) {
            addCriterion("return_state <", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLessThanOrEqualTo(String value) {
            addCriterion("return_state <=", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLike(String value) {
            addCriterion("return_state like", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotLike(String value) {
            addCriterion("return_state not like", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateIn(List<String> values) {
            addCriterion("return_state in", values, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotIn(List<String> values) {
            addCriterion("return_state not in", values, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateBetween(String value1, String value2) {
            addCriterion("return_state between", value1, value2, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotBetween(String value1, String value2) {
            addCriterion("return_state not between", value1, value2, "returnState");
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