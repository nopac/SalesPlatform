package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIsNull() {
            addCriterion("order_customer is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIsNotNull() {
            addCriterion("order_customer is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerEqualTo(String value) {
            addCriterion("order_customer =", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNotEqualTo(String value) {
            addCriterion("order_customer <>", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerGreaterThan(String value) {
            addCriterion("order_customer >", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("order_customer >=", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerLessThan(String value) {
            addCriterion("order_customer <", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerLessThanOrEqualTo(String value) {
            addCriterion("order_customer <=", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerLike(String value) {
            addCriterion("order_customer like", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNotLike(String value) {
            addCriterion("order_customer not like", value, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIn(List<String> values) {
            addCriterion("order_customer in", values, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNotIn(List<String> values) {
            addCriterion("order_customer not in", values, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerBetween(String value1, String value2) {
            addCriterion("order_customer between", value1, value2, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNotBetween(String value1, String value2) {
            addCriterion("order_customer not between", value1, value2, "orderCustomer");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantIsNull() {
            addCriterion("order_merchant is null");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantIsNotNull() {
            addCriterion("order_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantEqualTo(String value) {
            addCriterion("order_merchant =", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotEqualTo(String value) {
            addCriterion("order_merchant <>", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantGreaterThan(String value) {
            addCriterion("order_merchant >", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("order_merchant >=", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantLessThan(String value) {
            addCriterion("order_merchant <", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantLessThanOrEqualTo(String value) {
            addCriterion("order_merchant <=", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantLike(String value) {
            addCriterion("order_merchant like", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotLike(String value) {
            addCriterion("order_merchant not like", value, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantIn(List<String> values) {
            addCriterion("order_merchant in", values, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotIn(List<String> values) {
            addCriterion("order_merchant not in", values, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantBetween(String value1, String value2) {
            addCriterion("order_merchant between", value1, value2, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderMerchantNotBetween(String value1, String value2) {
            addCriterion("order_merchant not between", value1, value2, "orderMerchant");
            return (Criteria) this;
        }

        public Criteria andOrderProductIsNull() {
            addCriterion("order_product is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductIsNotNull() {
            addCriterion("order_product is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductEqualTo(Integer value) {
            addCriterion("order_product =", value, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductNotEqualTo(Integer value) {
            addCriterion("order_product <>", value, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductGreaterThan(Integer value) {
            addCriterion("order_product >", value, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_product >=", value, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductLessThan(Integer value) {
            addCriterion("order_product <", value, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductLessThanOrEqualTo(Integer value) {
            addCriterion("order_product <=", value, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductIn(List<Integer> values) {
            addCriterion("order_product in", values, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductNotIn(List<Integer> values) {
            addCriterion("order_product not in", values, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductBetween(Integer value1, Integer value2) {
            addCriterion("order_product between", value1, value2, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderProductNotBetween(Integer value1, Integer value2) {
            addCriterion("order_product not between", value1, value2, "orderProduct");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Double value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Double value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Double value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Double value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Double> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Double> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Double value1, Double value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Integer value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Integer value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Integer value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Integer value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Integer value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Integer> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Integer> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Integer value1, Integer value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNull() {
            addCriterion("order_total_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNotNull() {
            addCriterion("order_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceEqualTo(Double value) {
            addCriterion("order_total_price =", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotEqualTo(Double value) {
            addCriterion("order_total_price <>", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThan(Double value) {
            addCriterion("order_total_price >", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_total_price >=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThan(Double value) {
            addCriterion("order_total_price <", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("order_total_price <=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIn(List<Double> values) {
            addCriterion("order_total_price in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotIn(List<Double> values) {
            addCriterion("order_total_price not in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceBetween(Double value1, Double value2) {
            addCriterion("order_total_price between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("order_total_price not between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderWayIsNull() {
            addCriterion("order_way is null");
            return (Criteria) this;
        }

        public Criteria andOrderWayIsNotNull() {
            addCriterion("order_way is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWayEqualTo(String value) {
            addCriterion("order_way =", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotEqualTo(String value) {
            addCriterion("order_way <>", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayGreaterThan(String value) {
            addCriterion("order_way >", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayGreaterThanOrEqualTo(String value) {
            addCriterion("order_way >=", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayLessThan(String value) {
            addCriterion("order_way <", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayLessThanOrEqualTo(String value) {
            addCriterion("order_way <=", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayLike(String value) {
            addCriterion("order_way like", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotLike(String value) {
            addCriterion("order_way not like", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayIn(List<String> values) {
            addCriterion("order_way in", values, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotIn(List<String> values) {
            addCriterion("order_way not in", values, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayBetween(String value1, String value2) {
            addCriterion("order_way between", value1, value2, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotBetween(String value1, String value2) {
            addCriterion("order_way not between", value1, value2, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
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