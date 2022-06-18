package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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

        public Criteria andCustomerPasswordIsNull() {
            addCriterion("customer_password is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNotNull() {
            addCriterion("customer_password is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordEqualTo(String value) {
            addCriterion("customer_password =", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotEqualTo(String value) {
            addCriterion("customer_password <>", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThan(String value) {
            addCriterion("customer_password >", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("customer_password >=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThan(String value) {
            addCriterion("customer_password <", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThanOrEqualTo(String value) {
            addCriterion("customer_password <=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLike(String value) {
            addCriterion("customer_password like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotLike(String value) {
            addCriterion("customer_password not like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIn(List<String> values) {
            addCriterion("customer_password in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotIn(List<String> values) {
            addCriterion("customer_password not in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordBetween(String value1, String value2) {
            addCriterion("customer_password between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotBetween(String value1, String value2) {
            addCriterion("customer_password not between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(String value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(String value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(String value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(String value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(String value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(String value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLike(String value) {
            addCriterion("customer_sex like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotLike(String value) {
            addCriterion("customer_sex not like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<String> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<String> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(String value1, String value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(String value1, String value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerMailIsNull() {
            addCriterion("customer_mail is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMailIsNotNull() {
            addCriterion("customer_mail is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMailEqualTo(String value) {
            addCriterion("customer_mail =", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailNotEqualTo(String value) {
            addCriterion("customer_mail <>", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailGreaterThan(String value) {
            addCriterion("customer_mail >", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_mail >=", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailLessThan(String value) {
            addCriterion("customer_mail <", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailLessThanOrEqualTo(String value) {
            addCriterion("customer_mail <=", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailLike(String value) {
            addCriterion("customer_mail like", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailNotLike(String value) {
            addCriterion("customer_mail not like", value, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailIn(List<String> values) {
            addCriterion("customer_mail in", values, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailNotIn(List<String> values) {
            addCriterion("customer_mail not in", values, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailBetween(String value1, String value2) {
            addCriterion("customer_mail between", value1, value2, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerMailNotBetween(String value1, String value2) {
            addCriterion("customer_mail not between", value1, value2, "customerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNull() {
            addCriterion("customer_city is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNotNull() {
            addCriterion("customer_city is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityEqualTo(String value) {
            addCriterion("customer_city =", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotEqualTo(String value) {
            addCriterion("customer_city <>", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThan(String value) {
            addCriterion("customer_city >", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThanOrEqualTo(String value) {
            addCriterion("customer_city >=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThan(String value) {
            addCriterion("customer_city <", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThanOrEqualTo(String value) {
            addCriterion("customer_city <=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLike(String value) {
            addCriterion("customer_city like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotLike(String value) {
            addCriterion("customer_city not like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIn(List<String> values) {
            addCriterion("customer_city in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotIn(List<String> values) {
            addCriterion("customer_city not in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityBetween(String value1, String value2) {
            addCriterion("customer_city between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotBetween(String value1, String value2) {
            addCriterion("customer_city not between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIsNull() {
            addCriterion("customer_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIsNotNull() {
            addCriterion("customer_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountEqualTo(String value) {
            addCriterion("customer_bank_account =", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotEqualTo(String value) {
            addCriterion("customer_bank_account <>", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountGreaterThan(String value) {
            addCriterion("customer_bank_account >", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_bank_account >=", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLessThan(String value) {
            addCriterion("customer_bank_account <", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLessThanOrEqualTo(String value) {
            addCriterion("customer_bank_account <=", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLike(String value) {
            addCriterion("customer_bank_account like", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotLike(String value) {
            addCriterion("customer_bank_account not like", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIn(List<String> values) {
            addCriterion("customer_bank_account in", values, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotIn(List<String> values) {
            addCriterion("customer_bank_account not in", values, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountBetween(String value1, String value2) {
            addCriterion("customer_bank_account between", value1, value2, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotBetween(String value1, String value2) {
            addCriterion("customer_bank_account not between", value1, value2, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateIsNull() {
            addCriterion("customer_register_date is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateIsNotNull() {
            addCriterion("customer_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateEqualTo(Date value) {
            addCriterion("customer_register_date =", value, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateNotEqualTo(Date value) {
            addCriterion("customer_register_date <>", value, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateGreaterThan(Date value) {
            addCriterion("customer_register_date >", value, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_register_date >=", value, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateLessThan(Date value) {
            addCriterion("customer_register_date <", value, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("customer_register_date <=", value, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateIn(List<Date> values) {
            addCriterion("customer_register_date in", values, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateNotIn(List<Date> values) {
            addCriterion("customer_register_date not in", values, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateBetween(Date value1, Date value2) {
            addCriterion("customer_register_date between", value1, value2, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("customer_register_date not between", value1, value2, "customerRegisterDate");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeIsNull() {
            addCriterion("customer_degree is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeIsNotNull() {
            addCriterion("customer_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeEqualTo(Double value) {
            addCriterion("customer_degree =", value, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeNotEqualTo(Double value) {
            addCriterion("customer_degree <>", value, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeGreaterThan(Double value) {
            addCriterion("customer_degree >", value, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("customer_degree >=", value, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeLessThan(Double value) {
            addCriterion("customer_degree <", value, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeLessThanOrEqualTo(Double value) {
            addCriterion("customer_degree <=", value, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeIn(List<Double> values) {
            addCriterion("customer_degree in", values, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeNotIn(List<Double> values) {
            addCriterion("customer_degree not in", values, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeBetween(Double value1, Double value2) {
            addCriterion("customer_degree between", value1, value2, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerDegreeNotBetween(Double value1, Double value2) {
            addCriterion("customer_degree not between", value1, value2, "customerDegree");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceIsNull() {
            addCriterion("customer_wallet_balance is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceIsNotNull() {
            addCriterion("customer_wallet_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceEqualTo(Double value) {
            addCriterion("customer_wallet_balance =", value, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceNotEqualTo(Double value) {
            addCriterion("customer_wallet_balance <>", value, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceGreaterThan(Double value) {
            addCriterion("customer_wallet_balance >", value, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("customer_wallet_balance >=", value, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceLessThan(Double value) {
            addCriterion("customer_wallet_balance <", value, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceLessThanOrEqualTo(Double value) {
            addCriterion("customer_wallet_balance <=", value, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceIn(List<Double> values) {
            addCriterion("customer_wallet_balance in", values, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceNotIn(List<Double> values) {
            addCriterion("customer_wallet_balance not in", values, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceBetween(Double value1, Double value2) {
            addCriterion("customer_wallet_balance between", value1, value2, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletBalanceNotBetween(Double value1, Double value2) {
            addCriterion("customer_wallet_balance not between", value1, value2, "customerWalletBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralIsNull() {
            addCriterion("customer_wallet_integral is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralIsNotNull() {
            addCriterion("customer_wallet_integral is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralEqualTo(Integer value) {
            addCriterion("customer_wallet_integral =", value, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralNotEqualTo(Integer value) {
            addCriterion("customer_wallet_integral <>", value, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralGreaterThan(Integer value) {
            addCriterion("customer_wallet_integral >", value, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_wallet_integral >=", value, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralLessThan(Integer value) {
            addCriterion("customer_wallet_integral <", value, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("customer_wallet_integral <=", value, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralIn(List<Integer> values) {
            addCriterion("customer_wallet_integral in", values, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralNotIn(List<Integer> values) {
            addCriterion("customer_wallet_integral not in", values, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralBetween(Integer value1, Integer value2) {
            addCriterion("customer_wallet_integral between", value1, value2, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerWalletIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_wallet_integral not between", value1, value2, "customerWalletIntegral");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicIsNull() {
            addCriterion("customer_head_pic is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicIsNotNull() {
            addCriterion("customer_head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicEqualTo(String value) {
            addCriterion("customer_head_pic =", value, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicNotEqualTo(String value) {
            addCriterion("customer_head_pic <>", value, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicGreaterThan(String value) {
            addCriterion("customer_head_pic >", value, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("customer_head_pic >=", value, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicLessThan(String value) {
            addCriterion("customer_head_pic <", value, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicLessThanOrEqualTo(String value) {
            addCriterion("customer_head_pic <=", value, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicIn(List<String> values) {
            addCriterion("customer_head_pic in", values, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicNotIn(List<String> values) {
            addCriterion("customer_head_pic not in", values, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicBetween(String value1, String value2) {
            addCriterion("customer_head_pic between", value1, value2, "customerHeadPic");
            return (Criteria) this;
        }

        public Criteria andCustomerHeadPicNotBetween(String value1, String value2) {
            addCriterion("customer_head_pic not between", value1, value2, "customerHeadPic");
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