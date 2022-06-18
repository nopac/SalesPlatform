package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shopping_CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Shopping_CartExample() {
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

        public Criteria andShoppingCartIdIsNull() {
            addCriterion("shopping_cart_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdIsNotNull() {
            addCriterion("shopping_cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdEqualTo(Integer value) {
            addCriterion("shopping_cart_id =", value, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdNotEqualTo(Integer value) {
            addCriterion("shopping_cart_id <>", value, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdGreaterThan(Integer value) {
            addCriterion("shopping_cart_id >", value, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_cart_id >=", value, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdLessThan(Integer value) {
            addCriterion("shopping_cart_id <", value, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_cart_id <=", value, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdIn(List<Integer> values) {
            addCriterion("shopping_cart_id in", values, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdNotIn(List<Integer> values) {
            addCriterion("shopping_cart_id not in", values, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdBetween(Integer value1, Integer value2) {
            addCriterion("shopping_cart_id between", value1, value2, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_cart_id not between", value1, value2, "shoppingCartId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerIsNull() {
            addCriterion("shopping_cart_customer is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerIsNotNull() {
            addCriterion("shopping_cart_customer is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerEqualTo(String value) {
            addCriterion("shopping_cart_customer =", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerNotEqualTo(String value) {
            addCriterion("shopping_cart_customer <>", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerGreaterThan(String value) {
            addCriterion("shopping_cart_customer >", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_cart_customer >=", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerLessThan(String value) {
            addCriterion("shopping_cart_customer <", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerLessThanOrEqualTo(String value) {
            addCriterion("shopping_cart_customer <=", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerLike(String value) {
            addCriterion("shopping_cart_customer like", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerNotLike(String value) {
            addCriterion("shopping_cart_customer not like", value, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerIn(List<String> values) {
            addCriterion("shopping_cart_customer in", values, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerNotIn(List<String> values) {
            addCriterion("shopping_cart_customer not in", values, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerBetween(String value1, String value2) {
            addCriterion("shopping_cart_customer between", value1, value2, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCustomerNotBetween(String value1, String value2) {
            addCriterion("shopping_cart_customer not between", value1, value2, "shoppingCartCustomer");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantIsNull() {
            addCriterion("shopping_cart_merchant is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantIsNotNull() {
            addCriterion("shopping_cart_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantEqualTo(String value) {
            addCriterion("shopping_cart_merchant =", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantNotEqualTo(String value) {
            addCriterion("shopping_cart_merchant <>", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantGreaterThan(String value) {
            addCriterion("shopping_cart_merchant >", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_cart_merchant >=", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantLessThan(String value) {
            addCriterion("shopping_cart_merchant <", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantLessThanOrEqualTo(String value) {
            addCriterion("shopping_cart_merchant <=", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantLike(String value) {
            addCriterion("shopping_cart_merchant like", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantNotLike(String value) {
            addCriterion("shopping_cart_merchant not like", value, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantIn(List<String> values) {
            addCriterion("shopping_cart_merchant in", values, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantNotIn(List<String> values) {
            addCriterion("shopping_cart_merchant not in", values, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantBetween(String value1, String value2) {
            addCriterion("shopping_cart_merchant between", value1, value2, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartMerchantNotBetween(String value1, String value2) {
            addCriterion("shopping_cart_merchant not between", value1, value2, "shoppingCartMerchant");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdIsNull() {
            addCriterion("shopping_cart_product_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdIsNotNull() {
            addCriterion("shopping_cart_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdEqualTo(Integer value) {
            addCriterion("shopping_cart_product_id =", value, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdNotEqualTo(Integer value) {
            addCriterion("shopping_cart_product_id <>", value, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdGreaterThan(Integer value) {
            addCriterion("shopping_cart_product_id >", value, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_cart_product_id >=", value, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdLessThan(Integer value) {
            addCriterion("shopping_cart_product_id <", value, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_cart_product_id <=", value, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdIn(List<Integer> values) {
            addCriterion("shopping_cart_product_id in", values, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdNotIn(List<Integer> values) {
            addCriterion("shopping_cart_product_id not in", values, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdBetween(Integer value1, Integer value2) {
            addCriterion("shopping_cart_product_id between", value1, value2, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_cart_product_id not between", value1, value2, "shoppingCartProductId");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameIsNull() {
            addCriterion("shopping_cart_product_name is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameIsNotNull() {
            addCriterion("shopping_cart_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameEqualTo(String value) {
            addCriterion("shopping_cart_product_name =", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameNotEqualTo(String value) {
            addCriterion("shopping_cart_product_name <>", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameGreaterThan(String value) {
            addCriterion("shopping_cart_product_name >", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_cart_product_name >=", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameLessThan(String value) {
            addCriterion("shopping_cart_product_name <", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameLessThanOrEqualTo(String value) {
            addCriterion("shopping_cart_product_name <=", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameLike(String value) {
            addCriterion("shopping_cart_product_name like", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameNotLike(String value) {
            addCriterion("shopping_cart_product_name not like", value, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameIn(List<String> values) {
            addCriterion("shopping_cart_product_name in", values, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameNotIn(List<String> values) {
            addCriterion("shopping_cart_product_name not in", values, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameBetween(String value1, String value2) {
            addCriterion("shopping_cart_product_name between", value1, value2, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartProductNameNotBetween(String value1, String value2) {
            addCriterion("shopping_cart_product_name not between", value1, value2, "shoppingCartProductName");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountIsNull() {
            addCriterion("shopping_cart_count is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountIsNotNull() {
            addCriterion("shopping_cart_count is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountEqualTo(Integer value) {
            addCriterion("shopping_cart_count =", value, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountNotEqualTo(Integer value) {
            addCriterion("shopping_cart_count <>", value, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountGreaterThan(Integer value) {
            addCriterion("shopping_cart_count >", value, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_cart_count >=", value, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountLessThan(Integer value) {
            addCriterion("shopping_cart_count <", value, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_cart_count <=", value, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountIn(List<Integer> values) {
            addCriterion("shopping_cart_count in", values, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountNotIn(List<Integer> values) {
            addCriterion("shopping_cart_count not in", values, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountBetween(Integer value1, Integer value2) {
            addCriterion("shopping_cart_count between", value1, value2, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_cart_count not between", value1, value2, "shoppingCartCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceIsNull() {
            addCriterion("shopping_cart_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceIsNotNull() {
            addCriterion("shopping_cart_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceEqualTo(Double value) {
            addCriterion("shopping_cart_unit_price =", value, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceNotEqualTo(Double value) {
            addCriterion("shopping_cart_unit_price <>", value, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceGreaterThan(Double value) {
            addCriterion("shopping_cart_unit_price >", value, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("shopping_cart_unit_price >=", value, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceLessThan(Double value) {
            addCriterion("shopping_cart_unit_price <", value, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("shopping_cart_unit_price <=", value, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceIn(List<Double> values) {
            addCriterion("shopping_cart_unit_price in", values, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceNotIn(List<Double> values) {
            addCriterion("shopping_cart_unit_price not in", values, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceBetween(Double value1, Double value2) {
            addCriterion("shopping_cart_unit_price between", value1, value2, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("shopping_cart_unit_price not between", value1, value2, "shoppingCartUnitPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceIsNull() {
            addCriterion("shopping_cart_total_price is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceIsNotNull() {
            addCriterion("shopping_cart_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceEqualTo(Double value) {
            addCriterion("shopping_cart_total_price =", value, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceNotEqualTo(Double value) {
            addCriterion("shopping_cart_total_price <>", value, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceGreaterThan(Double value) {
            addCriterion("shopping_cart_total_price >", value, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("shopping_cart_total_price >=", value, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceLessThan(Double value) {
            addCriterion("shopping_cart_total_price <", value, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("shopping_cart_total_price <=", value, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceIn(List<Double> values) {
            addCriterion("shopping_cart_total_price in", values, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceNotIn(List<Double> values) {
            addCriterion("shopping_cart_total_price not in", values, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceBetween(Double value1, Double value2) {
            addCriterion("shopping_cart_total_price between", value1, value2, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("shopping_cart_total_price not between", value1, value2, "shoppingCartTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateIsNull() {
            addCriterion("shopping_cart_add_date is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateIsNotNull() {
            addCriterion("shopping_cart_add_date is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateEqualTo(Date value) {
            addCriterion("shopping_cart_add_date =", value, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateNotEqualTo(Date value) {
            addCriterion("shopping_cart_add_date <>", value, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateGreaterThan(Date value) {
            addCriterion("shopping_cart_add_date >", value, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("shopping_cart_add_date >=", value, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateLessThan(Date value) {
            addCriterion("shopping_cart_add_date <", value, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateLessThanOrEqualTo(Date value) {
            addCriterion("shopping_cart_add_date <=", value, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateIn(List<Date> values) {
            addCriterion("shopping_cart_add_date in", values, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateNotIn(List<Date> values) {
            addCriterion("shopping_cart_add_date not in", values, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateBetween(Date value1, Date value2) {
            addCriterion("shopping_cart_add_date between", value1, value2, "shoppingCartAddDate");
            return (Criteria) this;
        }

        public Criteria andShoppingCartAddDateNotBetween(Date value1, Date value2) {
            addCriterion("shopping_cart_add_date not between", value1, value2, "shoppingCartAddDate");
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