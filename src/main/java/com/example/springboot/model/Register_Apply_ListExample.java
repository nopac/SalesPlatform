package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Register_Apply_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Register_Apply_ListExample() {
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

        public Criteria andRegisterlistIdIsNull() {
            addCriterion("registerlist_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdIsNotNull() {
            addCriterion("registerlist_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdEqualTo(Integer value) {
            addCriterion("registerlist_id =", value, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdNotEqualTo(Integer value) {
            addCriterion("registerlist_id <>", value, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdGreaterThan(Integer value) {
            addCriterion("registerlist_id >", value, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("registerlist_id >=", value, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdLessThan(Integer value) {
            addCriterion("registerlist_id <", value, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdLessThanOrEqualTo(Integer value) {
            addCriterion("registerlist_id <=", value, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdIn(List<Integer> values) {
            addCriterion("registerlist_id in", values, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdNotIn(List<Integer> values) {
            addCriterion("registerlist_id not in", values, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdBetween(Integer value1, Integer value2) {
            addCriterion("registerlist_id between", value1, value2, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterlistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("registerlist_id not between", value1, value2, "registerlistId");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNull() {
            addCriterion("register_type is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNotNull() {
            addCriterion("register_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeEqualTo(String value) {
            addCriterion("register_type =", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotEqualTo(String value) {
            addCriterion("register_type <>", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThan(String value) {
            addCriterion("register_type >", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("register_type >=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThan(String value) {
            addCriterion("register_type <", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThanOrEqualTo(String value) {
            addCriterion("register_type <=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLike(String value) {
            addCriterion("register_type like", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotLike(String value) {
            addCriterion("register_type not like", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIn(List<String> values) {
            addCriterion("register_type in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotIn(List<String> values) {
            addCriterion("register_type not in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeBetween(String value1, String value2) {
            addCriterion("register_type between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotBetween(String value1, String value2) {
            addCriterion("register_type not between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountIsNull() {
            addCriterion("register_account is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountIsNotNull() {
            addCriterion("register_account is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountEqualTo(String value) {
            addCriterion("register_account =", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNotEqualTo(String value) {
            addCriterion("register_account <>", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountGreaterThan(String value) {
            addCriterion("register_account >", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountGreaterThanOrEqualTo(String value) {
            addCriterion("register_account >=", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountLessThan(String value) {
            addCriterion("register_account <", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountLessThanOrEqualTo(String value) {
            addCriterion("register_account <=", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountLike(String value) {
            addCriterion("register_account like", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNotLike(String value) {
            addCriterion("register_account not like", value, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountIn(List<String> values) {
            addCriterion("register_account in", values, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNotIn(List<String> values) {
            addCriterion("register_account not in", values, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountBetween(String value1, String value2) {
            addCriterion("register_account between", value1, value2, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNotBetween(String value1, String value2) {
            addCriterion("register_account not between", value1, value2, "registerAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterNameIsNull() {
            addCriterion("register_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNameIsNotNull() {
            addCriterion("register_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNameEqualTo(String value) {
            addCriterion("register_name =", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameNotEqualTo(String value) {
            addCriterion("register_name <>", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameGreaterThan(String value) {
            addCriterion("register_name >", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameGreaterThanOrEqualTo(String value) {
            addCriterion("register_name >=", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameLessThan(String value) {
            addCriterion("register_name <", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameLessThanOrEqualTo(String value) {
            addCriterion("register_name <=", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameLike(String value) {
            addCriterion("register_name like", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameNotLike(String value) {
            addCriterion("register_name not like", value, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameIn(List<String> values) {
            addCriterion("register_name in", values, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameNotIn(List<String> values) {
            addCriterion("register_name not in", values, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameBetween(String value1, String value2) {
            addCriterion("register_name between", value1, value2, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterNameNotBetween(String value1, String value2) {
            addCriterion("register_name not between", value1, value2, "registerName");
            return (Criteria) this;
        }

        public Criteria andRegisterSexIsNull() {
            addCriterion("register_sex is null");
            return (Criteria) this;
        }

        public Criteria andRegisterSexIsNotNull() {
            addCriterion("register_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterSexEqualTo(String value) {
            addCriterion("register_sex =", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexNotEqualTo(String value) {
            addCriterion("register_sex <>", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexGreaterThan(String value) {
            addCriterion("register_sex >", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexGreaterThanOrEqualTo(String value) {
            addCriterion("register_sex >=", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexLessThan(String value) {
            addCriterion("register_sex <", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexLessThanOrEqualTo(String value) {
            addCriterion("register_sex <=", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexLike(String value) {
            addCriterion("register_sex like", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexNotLike(String value) {
            addCriterion("register_sex not like", value, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexIn(List<String> values) {
            addCriterion("register_sex in", values, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexNotIn(List<String> values) {
            addCriterion("register_sex not in", values, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexBetween(String value1, String value2) {
            addCriterion("register_sex between", value1, value2, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterSexNotBetween(String value1, String value2) {
            addCriterion("register_sex not between", value1, value2, "registerSex");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneIsNull() {
            addCriterion("register_phone is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneIsNotNull() {
            addCriterion("register_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneEqualTo(String value) {
            addCriterion("register_phone =", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneNotEqualTo(String value) {
            addCriterion("register_phone <>", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneGreaterThan(String value) {
            addCriterion("register_phone >", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("register_phone >=", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneLessThan(String value) {
            addCriterion("register_phone <", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneLessThanOrEqualTo(String value) {
            addCriterion("register_phone <=", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneLike(String value) {
            addCriterion("register_phone like", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneNotLike(String value) {
            addCriterion("register_phone not like", value, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneIn(List<String> values) {
            addCriterion("register_phone in", values, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneNotIn(List<String> values) {
            addCriterion("register_phone not in", values, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneBetween(String value1, String value2) {
            addCriterion("register_phone between", value1, value2, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterPhoneNotBetween(String value1, String value2) {
            addCriterion("register_phone not between", value1, value2, "registerPhone");
            return (Criteria) this;
        }

        public Criteria andRegisterMailIsNull() {
            addCriterion("register_mail is null");
            return (Criteria) this;
        }

        public Criteria andRegisterMailIsNotNull() {
            addCriterion("register_mail is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterMailEqualTo(String value) {
            addCriterion("register_mail =", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailNotEqualTo(String value) {
            addCriterion("register_mail <>", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailGreaterThan(String value) {
            addCriterion("register_mail >", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailGreaterThanOrEqualTo(String value) {
            addCriterion("register_mail >=", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailLessThan(String value) {
            addCriterion("register_mail <", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailLessThanOrEqualTo(String value) {
            addCriterion("register_mail <=", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailLike(String value) {
            addCriterion("register_mail like", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailNotLike(String value) {
            addCriterion("register_mail not like", value, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailIn(List<String> values) {
            addCriterion("register_mail in", values, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailNotIn(List<String> values) {
            addCriterion("register_mail not in", values, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailBetween(String value1, String value2) {
            addCriterion("register_mail between", value1, value2, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterMailNotBetween(String value1, String value2) {
            addCriterion("register_mail not between", value1, value2, "registerMail");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordIsNull() {
            addCriterion("register_password is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordIsNotNull() {
            addCriterion("register_password is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordEqualTo(String value) {
            addCriterion("register_password =", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordNotEqualTo(String value) {
            addCriterion("register_password <>", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordGreaterThan(String value) {
            addCriterion("register_password >", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("register_password >=", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordLessThan(String value) {
            addCriterion("register_password <", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordLessThanOrEqualTo(String value) {
            addCriterion("register_password <=", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordLike(String value) {
            addCriterion("register_password like", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordNotLike(String value) {
            addCriterion("register_password not like", value, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordIn(List<String> values) {
            addCriterion("register_password in", values, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordNotIn(List<String> values) {
            addCriterion("register_password not in", values, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordBetween(String value1, String value2) {
            addCriterion("register_password between", value1, value2, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterPasswordNotBetween(String value1, String value2) {
            addCriterion("register_password not between", value1, value2, "registerPassword");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIsNull() {
            addCriterion("register_city is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIsNotNull() {
            addCriterion("register_city is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCityEqualTo(String value) {
            addCriterion("register_city =", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotEqualTo(String value) {
            addCriterion("register_city <>", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityGreaterThan(String value) {
            addCriterion("register_city >", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityGreaterThanOrEqualTo(String value) {
            addCriterion("register_city >=", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLessThan(String value) {
            addCriterion("register_city <", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLessThanOrEqualTo(String value) {
            addCriterion("register_city <=", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityLike(String value) {
            addCriterion("register_city like", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotLike(String value) {
            addCriterion("register_city not like", value, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityIn(List<String> values) {
            addCriterion("register_city in", values, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotIn(List<String> values) {
            addCriterion("register_city not in", values, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityBetween(String value1, String value2) {
            addCriterion("register_city between", value1, value2, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCityNotBetween(String value1, String value2) {
            addCriterion("register_city not between", value1, value2, "registerCity");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountIsNull() {
            addCriterion("register_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountIsNotNull() {
            addCriterion("register_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountEqualTo(String value) {
            addCriterion("register_bank_account =", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountNotEqualTo(String value) {
            addCriterion("register_bank_account <>", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountGreaterThan(String value) {
            addCriterion("register_bank_account >", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("register_bank_account >=", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountLessThan(String value) {
            addCriterion("register_bank_account <", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountLessThanOrEqualTo(String value) {
            addCriterion("register_bank_account <=", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountLike(String value) {
            addCriterion("register_bank_account like", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountNotLike(String value) {
            addCriterion("register_bank_account not like", value, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountIn(List<String> values) {
            addCriterion("register_bank_account in", values, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountNotIn(List<String> values) {
            addCriterion("register_bank_account not in", values, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountBetween(String value1, String value2) {
            addCriterion("register_bank_account between", value1, value2, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterBankAccountNotBetween(String value1, String value2) {
            addCriterion("register_bank_account not between", value1, value2, "registerBankAccount");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardIsNull() {
            addCriterion("register_id_card is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardIsNotNull() {
            addCriterion("register_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardEqualTo(String value) {
            addCriterion("register_id_card =", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardNotEqualTo(String value) {
            addCriterion("register_id_card <>", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardGreaterThan(String value) {
            addCriterion("register_id_card >", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("register_id_card >=", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardLessThan(String value) {
            addCriterion("register_id_card <", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardLessThanOrEqualTo(String value) {
            addCriterion("register_id_card <=", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardLike(String value) {
            addCriterion("register_id_card like", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardNotLike(String value) {
            addCriterion("register_id_card not like", value, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardIn(List<String> values) {
            addCriterion("register_id_card in", values, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardNotIn(List<String> values) {
            addCriterion("register_id_card not in", values, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardBetween(String value1, String value2) {
            addCriterion("register_id_card between", value1, value2, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardNotBetween(String value1, String value2) {
            addCriterion("register_id_card not between", value1, value2, "registerIdCard");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseIsNull() {
            addCriterion("register_license is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseIsNotNull() {
            addCriterion("register_license is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseEqualTo(String value) {
            addCriterion("register_license =", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseNotEqualTo(String value) {
            addCriterion("register_license <>", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseGreaterThan(String value) {
            addCriterion("register_license >", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("register_license >=", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseLessThan(String value) {
            addCriterion("register_license <", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseLessThanOrEqualTo(String value) {
            addCriterion("register_license <=", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseLike(String value) {
            addCriterion("register_license like", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseNotLike(String value) {
            addCriterion("register_license not like", value, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseIn(List<String> values) {
            addCriterion("register_license in", values, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseNotIn(List<String> values) {
            addCriterion("register_license not in", values, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseBetween(String value1, String value2) {
            addCriterion("register_license between", value1, value2, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseNotBetween(String value1, String value2) {
            addCriterion("register_license not between", value1, value2, "registerLicense");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirIsNull() {
            addCriterion("register_license_dir is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirIsNotNull() {
            addCriterion("register_license_dir is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirEqualTo(String value) {
            addCriterion("register_license_dir =", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirNotEqualTo(String value) {
            addCriterion("register_license_dir <>", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirGreaterThan(String value) {
            addCriterion("register_license_dir >", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirGreaterThanOrEqualTo(String value) {
            addCriterion("register_license_dir >=", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirLessThan(String value) {
            addCriterion("register_license_dir <", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirLessThanOrEqualTo(String value) {
            addCriterion("register_license_dir <=", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirLike(String value) {
            addCriterion("register_license_dir like", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirNotLike(String value) {
            addCriterion("register_license_dir not like", value, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirIn(List<String> values) {
            addCriterion("register_license_dir in", values, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirNotIn(List<String> values) {
            addCriterion("register_license_dir not in", values, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirBetween(String value1, String value2) {
            addCriterion("register_license_dir between", value1, value2, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterLicenseDirNotBetween(String value1, String value2) {
            addCriterion("register_license_dir not between", value1, value2, "registerLicenseDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirIsNull() {
            addCriterion("register_id_card_dir is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirIsNotNull() {
            addCriterion("register_id_card_dir is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirEqualTo(String value) {
            addCriterion("register_id_card_dir =", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirNotEqualTo(String value) {
            addCriterion("register_id_card_dir <>", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirGreaterThan(String value) {
            addCriterion("register_id_card_dir >", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirGreaterThanOrEqualTo(String value) {
            addCriterion("register_id_card_dir >=", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirLessThan(String value) {
            addCriterion("register_id_card_dir <", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirLessThanOrEqualTo(String value) {
            addCriterion("register_id_card_dir <=", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirLike(String value) {
            addCriterion("register_id_card_dir like", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirNotLike(String value) {
            addCriterion("register_id_card_dir not like", value, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirIn(List<String> values) {
            addCriterion("register_id_card_dir in", values, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirNotIn(List<String> values) {
            addCriterion("register_id_card_dir not in", values, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirBetween(String value1, String value2) {
            addCriterion("register_id_card_dir between", value1, value2, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterIdCardDirNotBetween(String value1, String value2) {
            addCriterion("register_id_card_dir not between", value1, value2, "registerIdCardDir");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentIsNull() {
            addCriterion("register_statment is null");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentIsNotNull() {
            addCriterion("register_statment is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentEqualTo(String value) {
            addCriterion("register_statment =", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentNotEqualTo(String value) {
            addCriterion("register_statment <>", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentGreaterThan(String value) {
            addCriterion("register_statment >", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentGreaterThanOrEqualTo(String value) {
            addCriterion("register_statment >=", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentLessThan(String value) {
            addCriterion("register_statment <", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentLessThanOrEqualTo(String value) {
            addCriterion("register_statment <=", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentLike(String value) {
            addCriterion("register_statment like", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentNotLike(String value) {
            addCriterion("register_statment not like", value, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentIn(List<String> values) {
            addCriterion("register_statment in", values, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentNotIn(List<String> values) {
            addCriterion("register_statment not in", values, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentBetween(String value1, String value2) {
            addCriterion("register_statment between", value1, value2, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterStatmentNotBetween(String value1, String value2) {
            addCriterion("register_statment not between", value1, value2, "registerStatment");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateIsNull() {
            addCriterion("register_submit_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateIsNotNull() {
            addCriterion("register_submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateEqualTo(Date value) {
            addCriterion("register_submit_date =", value, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateNotEqualTo(Date value) {
            addCriterion("register_submit_date <>", value, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateGreaterThan(Date value) {
            addCriterion("register_submit_date >", value, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_submit_date >=", value, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateLessThan(Date value) {
            addCriterion("register_submit_date <", value, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("register_submit_date <=", value, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateIn(List<Date> values) {
            addCriterion("register_submit_date in", values, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateNotIn(List<Date> values) {
            addCriterion("register_submit_date not in", values, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateBetween(Date value1, Date value2) {
            addCriterion("register_submit_date between", value1, value2, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("register_submit_date not between", value1, value2, "registerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateIsNull() {
            addCriterion("register_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateIsNotNull() {
            addCriterion("register_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateEqualTo(Date value) {
            addCriterion("register_finish_date =", value, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateNotEqualTo(Date value) {
            addCriterion("register_finish_date <>", value, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateGreaterThan(Date value) {
            addCriterion("register_finish_date >", value, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_finish_date >=", value, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateLessThan(Date value) {
            addCriterion("register_finish_date <", value, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("register_finish_date <=", value, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateIn(List<Date> values) {
            addCriterion("register_finish_date in", values, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateNotIn(List<Date> values) {
            addCriterion("register_finish_date not in", values, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateBetween(Date value1, Date value2) {
            addCriterion("register_finish_date between", value1, value2, "registerFinishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("register_finish_date not between", value1, value2, "registerFinishDate");
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