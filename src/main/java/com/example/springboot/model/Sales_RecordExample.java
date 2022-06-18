package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales_RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sales_RecordExample() {
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

        public Criteria andSalesOrderIsNull() {
            addCriterion("sales_order is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIsNotNull() {
            addCriterion("sales_order is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderEqualTo(Integer value) {
            addCriterion("sales_order =", value, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNotEqualTo(Integer value) {
            addCriterion("sales_order <>", value, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderGreaterThan(Integer value) {
            addCriterion("sales_order >", value, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_order >=", value, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderLessThan(Integer value) {
            addCriterion("sales_order <", value, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sales_order <=", value, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIn(List<Integer> values) {
            addCriterion("sales_order in", values, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNotIn(List<Integer> values) {
            addCriterion("sales_order not in", values, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderBetween(Integer value1, Integer value2) {
            addCriterion("sales_order between", value1, value2, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_order not between", value1, value2, "salesOrder");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantIsNull() {
            addCriterion("sales_record_merchant is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantIsNotNull() {
            addCriterion("sales_record_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantEqualTo(String value) {
            addCriterion("sales_record_merchant =", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantNotEqualTo(String value) {
            addCriterion("sales_record_merchant <>", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantGreaterThan(String value) {
            addCriterion("sales_record_merchant >", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("sales_record_merchant >=", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantLessThan(String value) {
            addCriterion("sales_record_merchant <", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantLessThanOrEqualTo(String value) {
            addCriterion("sales_record_merchant <=", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantLike(String value) {
            addCriterion("sales_record_merchant like", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantNotLike(String value) {
            addCriterion("sales_record_merchant not like", value, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantIn(List<String> values) {
            addCriterion("sales_record_merchant in", values, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantNotIn(List<String> values) {
            addCriterion("sales_record_merchant not in", values, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantBetween(String value1, String value2) {
            addCriterion("sales_record_merchant between", value1, value2, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMerchantNotBetween(String value1, String value2) {
            addCriterion("sales_record_merchant not between", value1, value2, "salesRecordMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductIsNull() {
            addCriterion("sales_record_product is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductIsNotNull() {
            addCriterion("sales_record_product is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductEqualTo(Integer value) {
            addCriterion("sales_record_product =", value, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductNotEqualTo(Integer value) {
            addCriterion("sales_record_product <>", value, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductGreaterThan(Integer value) {
            addCriterion("sales_record_product >", value, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_record_product >=", value, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductLessThan(Integer value) {
            addCriterion("sales_record_product <", value, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductLessThanOrEqualTo(Integer value) {
            addCriterion("sales_record_product <=", value, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductIn(List<Integer> values) {
            addCriterion("sales_record_product in", values, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductNotIn(List<Integer> values) {
            addCriterion("sales_record_product not in", values, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductBetween(Integer value1, Integer value2) {
            addCriterion("sales_record_product between", value1, value2, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordProductNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_record_product not between", value1, value2, "salesRecordProduct");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerIsNull() {
            addCriterion("sales_record_customer is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerIsNotNull() {
            addCriterion("sales_record_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerEqualTo(String value) {
            addCriterion("sales_record_customer =", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerNotEqualTo(String value) {
            addCriterion("sales_record_customer <>", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerGreaterThan(String value) {
            addCriterion("sales_record_customer >", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("sales_record_customer >=", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerLessThan(String value) {
            addCriterion("sales_record_customer <", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerLessThanOrEqualTo(String value) {
            addCriterion("sales_record_customer <=", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerLike(String value) {
            addCriterion("sales_record_customer like", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerNotLike(String value) {
            addCriterion("sales_record_customer not like", value, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerIn(List<String> values) {
            addCriterion("sales_record_customer in", values, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerNotIn(List<String> values) {
            addCriterion("sales_record_customer not in", values, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerBetween(String value1, String value2) {
            addCriterion("sales_record_customer between", value1, value2, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordCustomerNotBetween(String value1, String value2) {
            addCriterion("sales_record_customer not between", value1, value2, "salesRecordCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountIsNull() {
            addCriterion("sales_record_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountIsNotNull() {
            addCriterion("sales_record_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountEqualTo(Integer value) {
            addCriterion("sales_record_sale_count =", value, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountNotEqualTo(Integer value) {
            addCriterion("sales_record_sale_count <>", value, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountGreaterThan(Integer value) {
            addCriterion("sales_record_sale_count >", value, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_record_sale_count >=", value, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountLessThan(Integer value) {
            addCriterion("sales_record_sale_count <", value, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sales_record_sale_count <=", value, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountIn(List<Integer> values) {
            addCriterion("sales_record_sale_count in", values, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountNotIn(List<Integer> values) {
            addCriterion("sales_record_sale_count not in", values, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sales_record_sale_count between", value1, value2, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_record_sale_count not between", value1, value2, "salesRecordSaleCount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountIsNull() {
            addCriterion("sales_record_money_amount is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountIsNotNull() {
            addCriterion("sales_record_money_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountEqualTo(Double value) {
            addCriterion("sales_record_money_amount =", value, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountNotEqualTo(Double value) {
            addCriterion("sales_record_money_amount <>", value, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountGreaterThan(Double value) {
            addCriterion("sales_record_money_amount >", value, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_record_money_amount >=", value, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountLessThan(Double value) {
            addCriterion("sales_record_money_amount <", value, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountLessThanOrEqualTo(Double value) {
            addCriterion("sales_record_money_amount <=", value, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountIn(List<Double> values) {
            addCriterion("sales_record_money_amount in", values, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountNotIn(List<Double> values) {
            addCriterion("sales_record_money_amount not in", values, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountBetween(Double value1, Double value2) {
            addCriterion("sales_record_money_amount between", value1, value2, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordMoneyAmountNotBetween(Double value1, Double value2) {
            addCriterion("sales_record_money_amount not between", value1, value2, "salesRecordMoneyAmount");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeIsNull() {
            addCriterion("sales_record_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeIsNotNull() {
            addCriterion("sales_record_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeEqualTo(Double value) {
            addCriterion("sales_record_service_charge =", value, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeNotEqualTo(Double value) {
            addCriterion("sales_record_service_charge <>", value, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeGreaterThan(Double value) {
            addCriterion("sales_record_service_charge >", value, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_record_service_charge >=", value, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeLessThan(Double value) {
            addCriterion("sales_record_service_charge <", value, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeLessThanOrEqualTo(Double value) {
            addCriterion("sales_record_service_charge <=", value, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeIn(List<Double> values) {
            addCriterion("sales_record_service_charge in", values, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeNotIn(List<Double> values) {
            addCriterion("sales_record_service_charge not in", values, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeBetween(Double value1, Double value2) {
            addCriterion("sales_record_service_charge between", value1, value2, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordServiceChargeNotBetween(Double value1, Double value2) {
            addCriterion("sales_record_service_charge not between", value1, value2, "salesRecordServiceCharge");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateIsNull() {
            addCriterion("sales_record_start_date is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateIsNotNull() {
            addCriterion("sales_record_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateEqualTo(Date value) {
            addCriterion("sales_record_start_date =", value, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateNotEqualTo(Date value) {
            addCriterion("sales_record_start_date <>", value, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateGreaterThan(Date value) {
            addCriterion("sales_record_start_date >", value, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_record_start_date >=", value, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateLessThan(Date value) {
            addCriterion("sales_record_start_date <", value, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateLessThanOrEqualTo(Date value) {
            addCriterion("sales_record_start_date <=", value, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateIn(List<Date> values) {
            addCriterion("sales_record_start_date in", values, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateNotIn(List<Date> values) {
            addCriterion("sales_record_start_date not in", values, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateBetween(Date value1, Date value2) {
            addCriterion("sales_record_start_date between", value1, value2, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordStartDateNotBetween(Date value1, Date value2) {
            addCriterion("sales_record_start_date not between", value1, value2, "salesRecordStartDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateIsNull() {
            addCriterion("sales_record_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateIsNotNull() {
            addCriterion("sales_record_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateEqualTo(Date value) {
            addCriterion("sales_record_pay_date =", value, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateNotEqualTo(Date value) {
            addCriterion("sales_record_pay_date <>", value, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateGreaterThan(Date value) {
            addCriterion("sales_record_pay_date >", value, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_record_pay_date >=", value, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateLessThan(Date value) {
            addCriterion("sales_record_pay_date <", value, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateLessThanOrEqualTo(Date value) {
            addCriterion("sales_record_pay_date <=", value, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateIn(List<Date> values) {
            addCriterion("sales_record_pay_date in", values, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateNotIn(List<Date> values) {
            addCriterion("sales_record_pay_date not in", values, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateBetween(Date value1, Date value2) {
            addCriterion("sales_record_pay_date between", value1, value2, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordPayDateNotBetween(Date value1, Date value2) {
            addCriterion("sales_record_pay_date not between", value1, value2, "salesRecordPayDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateIsNull() {
            addCriterion("sales_record_receive_date is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateIsNotNull() {
            addCriterion("sales_record_receive_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateEqualTo(Date value) {
            addCriterion("sales_record_receive_date =", value, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateNotEqualTo(Date value) {
            addCriterion("sales_record_receive_date <>", value, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateGreaterThan(Date value) {
            addCriterion("sales_record_receive_date >", value, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_record_receive_date >=", value, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateLessThan(Date value) {
            addCriterion("sales_record_receive_date <", value, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("sales_record_receive_date <=", value, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateIn(List<Date> values) {
            addCriterion("sales_record_receive_date in", values, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateNotIn(List<Date> values) {
            addCriterion("sales_record_receive_date not in", values, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateBetween(Date value1, Date value2) {
            addCriterion("sales_record_receive_date between", value1, value2, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("sales_record_receive_date not between", value1, value2, "salesRecordReceiveDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateIsNull() {
            addCriterion("sales_record_confirm_date is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateIsNotNull() {
            addCriterion("sales_record_confirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateEqualTo(Date value) {
            addCriterion("sales_record_confirm_date =", value, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateNotEqualTo(Date value) {
            addCriterion("sales_record_confirm_date <>", value, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateGreaterThan(Date value) {
            addCriterion("sales_record_confirm_date >", value, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_record_confirm_date >=", value, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateLessThan(Date value) {
            addCriterion("sales_record_confirm_date <", value, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("sales_record_confirm_date <=", value, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateIn(List<Date> values) {
            addCriterion("sales_record_confirm_date in", values, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateNotIn(List<Date> values) {
            addCriterion("sales_record_confirm_date not in", values, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateBetween(Date value1, Date value2) {
            addCriterion("sales_record_confirm_date between", value1, value2, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRecordConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("sales_record_confirm_date not between", value1, value2, "salesRecordConfirmDate");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantIsNull() {
            addCriterion("sales_rating_by_merchant is null");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantIsNotNull() {
            addCriterion("sales_rating_by_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantEqualTo(Double value) {
            addCriterion("sales_rating_by_merchant =", value, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantNotEqualTo(Double value) {
            addCriterion("sales_rating_by_merchant <>", value, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantGreaterThan(Double value) {
            addCriterion("sales_rating_by_merchant >", value, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_rating_by_merchant >=", value, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantLessThan(Double value) {
            addCriterion("sales_rating_by_merchant <", value, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantLessThanOrEqualTo(Double value) {
            addCriterion("sales_rating_by_merchant <=", value, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantIn(List<Double> values) {
            addCriterion("sales_rating_by_merchant in", values, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantNotIn(List<Double> values) {
            addCriterion("sales_rating_by_merchant not in", values, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantBetween(Double value1, Double value2) {
            addCriterion("sales_rating_by_merchant between", value1, value2, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByMerchantNotBetween(Double value1, Double value2) {
            addCriterion("sales_rating_by_merchant not between", value1, value2, "salesRatingByMerchant");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerIsNull() {
            addCriterion("sales_rating_by_customer is null");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerIsNotNull() {
            addCriterion("sales_rating_by_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerEqualTo(Double value) {
            addCriterion("sales_rating_by_customer =", value, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerNotEqualTo(Double value) {
            addCriterion("sales_rating_by_customer <>", value, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerGreaterThan(Double value) {
            addCriterion("sales_rating_by_customer >", value, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_rating_by_customer >=", value, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerLessThan(Double value) {
            addCriterion("sales_rating_by_customer <", value, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerLessThanOrEqualTo(Double value) {
            addCriterion("sales_rating_by_customer <=", value, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerIn(List<Double> values) {
            addCriterion("sales_rating_by_customer in", values, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerNotIn(List<Double> values) {
            addCriterion("sales_rating_by_customer not in", values, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerBetween(Double value1, Double value2) {
            addCriterion("sales_rating_by_customer between", value1, value2, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRatingByCustomerNotBetween(Double value1, Double value2) {
            addCriterion("sales_rating_by_customer not between", value1, value2, "salesRatingByCustomer");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnIsNull() {
            addCriterion("sales_record_is_return is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnIsNotNull() {
            addCriterion("sales_record_is_return is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnEqualTo(String value) {
            addCriterion("sales_record_is_return =", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnNotEqualTo(String value) {
            addCriterion("sales_record_is_return <>", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnGreaterThan(String value) {
            addCriterion("sales_record_is_return >", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnGreaterThanOrEqualTo(String value) {
            addCriterion("sales_record_is_return >=", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnLessThan(String value) {
            addCriterion("sales_record_is_return <", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnLessThanOrEqualTo(String value) {
            addCriterion("sales_record_is_return <=", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnLike(String value) {
            addCriterion("sales_record_is_return like", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnNotLike(String value) {
            addCriterion("sales_record_is_return not like", value, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnIn(List<String> values) {
            addCriterion("sales_record_is_return in", values, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnNotIn(List<String> values) {
            addCriterion("sales_record_is_return not in", values, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnBetween(String value1, String value2) {
            addCriterion("sales_record_is_return between", value1, value2, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIsReturnNotBetween(String value1, String value2) {
            addCriterion("sales_record_is_return not between", value1, value2, "salesRecordIsReturn");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeIsNull() {
            addCriterion("serve_attitude is null");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeIsNotNull() {
            addCriterion("serve_attitude is not null");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeEqualTo(Double value) {
            addCriterion("serve_attitude =", value, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeNotEqualTo(Double value) {
            addCriterion("serve_attitude <>", value, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeGreaterThan(Double value) {
            addCriterion("serve_attitude >", value, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("serve_attitude >=", value, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeLessThan(Double value) {
            addCriterion("serve_attitude <", value, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeLessThanOrEqualTo(Double value) {
            addCriterion("serve_attitude <=", value, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeIn(List<Double> values) {
            addCriterion("serve_attitude in", values, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeNotIn(List<Double> values) {
            addCriterion("serve_attitude not in", values, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeBetween(Double value1, Double value2) {
            addCriterion("serve_attitude between", value1, value2, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andServeAttitudeNotBetween(Double value1, Double value2) {
            addCriterion("serve_attitude not between", value1, value2, "serveAttitude");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedIsNull() {
            addCriterion("response_speed is null");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedIsNotNull() {
            addCriterion("response_speed is not null");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedEqualTo(Double value) {
            addCriterion("response_speed =", value, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedNotEqualTo(Double value) {
            addCriterion("response_speed <>", value, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedGreaterThan(Double value) {
            addCriterion("response_speed >", value, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("response_speed >=", value, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedLessThan(Double value) {
            addCriterion("response_speed <", value, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedLessThanOrEqualTo(Double value) {
            addCriterion("response_speed <=", value, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedIn(List<Double> values) {
            addCriterion("response_speed in", values, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedNotIn(List<Double> values) {
            addCriterion("response_speed not in", values, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedBetween(Double value1, Double value2) {
            addCriterion("response_speed between", value1, value2, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedNotBetween(Double value1, Double value2) {
            addCriterion("response_speed not between", value1, value2, "responseSpeed");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionIsNull() {
            addCriterion("as_description is null");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionIsNotNull() {
            addCriterion("as_description is not null");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionEqualTo(Double value) {
            addCriterion("as_description =", value, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionNotEqualTo(Double value) {
            addCriterion("as_description <>", value, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionGreaterThan(Double value) {
            addCriterion("as_description >", value, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionGreaterThanOrEqualTo(Double value) {
            addCriterion("as_description >=", value, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionLessThan(Double value) {
            addCriterion("as_description <", value, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionLessThanOrEqualTo(Double value) {
            addCriterion("as_description <=", value, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionIn(List<Double> values) {
            addCriterion("as_description in", values, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionNotIn(List<Double> values) {
            addCriterion("as_description not in", values, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionBetween(Double value1, Double value2) {
            addCriterion("as_description between", value1, value2, "asDescription");
            return (Criteria) this;
        }

        public Criteria andAsDescriptionNotBetween(Double value1, Double value2) {
            addCriterion("as_description not between", value1, value2, "asDescription");
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

        public Criteria andCommentTextInfoIsNull() {
            addCriterion("comment_text_info is null");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoIsNotNull() {
            addCriterion("comment_text_info is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoEqualTo(String value) {
            addCriterion("comment_text_info =", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoNotEqualTo(String value) {
            addCriterion("comment_text_info <>", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoGreaterThan(String value) {
            addCriterion("comment_text_info >", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comment_text_info >=", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoLessThan(String value) {
            addCriterion("comment_text_info <", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoLessThanOrEqualTo(String value) {
            addCriterion("comment_text_info <=", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoLike(String value) {
            addCriterion("comment_text_info like", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoNotLike(String value) {
            addCriterion("comment_text_info not like", value, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoIn(List<String> values) {
            addCriterion("comment_text_info in", values, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoNotIn(List<String> values) {
            addCriterion("comment_text_info not in", values, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoBetween(String value1, String value2) {
            addCriterion("comment_text_info between", value1, value2, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentTextInfoNotBetween(String value1, String value2) {
            addCriterion("comment_text_info not between", value1, value2, "commentTextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoIsNull() {
            addCriterion("comment_pic_info is null");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoIsNotNull() {
            addCriterion("comment_pic_info is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoEqualTo(String value) {
            addCriterion("comment_pic_info =", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoNotEqualTo(String value) {
            addCriterion("comment_pic_info <>", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoGreaterThan(String value) {
            addCriterion("comment_pic_info >", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comment_pic_info >=", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoLessThan(String value) {
            addCriterion("comment_pic_info <", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoLessThanOrEqualTo(String value) {
            addCriterion("comment_pic_info <=", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoLike(String value) {
            addCriterion("comment_pic_info like", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoNotLike(String value) {
            addCriterion("comment_pic_info not like", value, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoIn(List<String> values) {
            addCriterion("comment_pic_info in", values, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoNotIn(List<String> values) {
            addCriterion("comment_pic_info not in", values, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoBetween(String value1, String value2) {
            addCriterion("comment_pic_info between", value1, value2, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentPicInfoNotBetween(String value1, String value2) {
            addCriterion("comment_pic_info not between", value1, value2, "commentPicInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoIsNull() {
            addCriterion("comment_addtext_info is null");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoIsNotNull() {
            addCriterion("comment_addtext_info is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoEqualTo(String value) {
            addCriterion("comment_addtext_info =", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoNotEqualTo(String value) {
            addCriterion("comment_addtext_info <>", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoGreaterThan(String value) {
            addCriterion("comment_addtext_info >", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comment_addtext_info >=", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoLessThan(String value) {
            addCriterion("comment_addtext_info <", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoLessThanOrEqualTo(String value) {
            addCriterion("comment_addtext_info <=", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoLike(String value) {
            addCriterion("comment_addtext_info like", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoNotLike(String value) {
            addCriterion("comment_addtext_info not like", value, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoIn(List<String> values) {
            addCriterion("comment_addtext_info in", values, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoNotIn(List<String> values) {
            addCriterion("comment_addtext_info not in", values, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoBetween(String value1, String value2) {
            addCriterion("comment_addtext_info between", value1, value2, "commentAddtextInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddtextInfoNotBetween(String value1, String value2) {
            addCriterion("comment_addtext_info not between", value1, value2, "commentAddtextInfo");
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