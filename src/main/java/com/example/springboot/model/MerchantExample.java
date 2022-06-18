package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantExample() {
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

        public Criteria andMerchantidIsNull() {
            addCriterion("merchantid is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("merchantid is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(Integer value) {
            addCriterion("merchantid =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(Integer value) {
            addCriterion("merchantid <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(Integer value) {
            addCriterion("merchantid >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchantid >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(Integer value) {
            addCriterion("merchantid <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(Integer value) {
            addCriterion("merchantid <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<Integer> values) {
            addCriterion("merchantid in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<Integer> values) {
            addCriterion("merchantid not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(Integer value1, Integer value2) {
            addCriterion("merchantid between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(Integer value1, Integer value2) {
            addCriterion("merchantid not between", value1, value2, "merchantid");
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

        public Criteria andMerchantPasswordIsNull() {
            addCriterion("merchant_password is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordIsNotNull() {
            addCriterion("merchant_password is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordEqualTo(String value) {
            addCriterion("merchant_password =", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotEqualTo(String value) {
            addCriterion("merchant_password <>", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordGreaterThan(String value) {
            addCriterion("merchant_password >", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_password >=", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordLessThan(String value) {
            addCriterion("merchant_password <", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordLessThanOrEqualTo(String value) {
            addCriterion("merchant_password <=", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordLike(String value) {
            addCriterion("merchant_password like", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotLike(String value) {
            addCriterion("merchant_password not like", value, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordIn(List<String> values) {
            addCriterion("merchant_password in", values, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotIn(List<String> values) {
            addCriterion("merchant_password not in", values, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordBetween(String value1, String value2) {
            addCriterion("merchant_password between", value1, value2, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPasswordNotBetween(String value1, String value2) {
            addCriterion("merchant_password not between", value1, value2, "merchantPassword");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneIsNull() {
            addCriterion("merchant_phone is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneIsNotNull() {
            addCriterion("merchant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneEqualTo(String value) {
            addCriterion("merchant_phone =", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotEqualTo(String value) {
            addCriterion("merchant_phone <>", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneGreaterThan(String value) {
            addCriterion("merchant_phone >", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_phone >=", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneLessThan(String value) {
            addCriterion("merchant_phone <", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneLessThanOrEqualTo(String value) {
            addCriterion("merchant_phone <=", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneLike(String value) {
            addCriterion("merchant_phone like", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotLike(String value) {
            addCriterion("merchant_phone not like", value, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneIn(List<String> values) {
            addCriterion("merchant_phone in", values, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotIn(List<String> values) {
            addCriterion("merchant_phone not in", values, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneBetween(String value1, String value2) {
            addCriterion("merchant_phone between", value1, value2, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantPhoneNotBetween(String value1, String value2) {
            addCriterion("merchant_phone not between", value1, value2, "merchantPhone");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantSexIsNull() {
            addCriterion("merchant_sex is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSexIsNotNull() {
            addCriterion("merchant_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSexEqualTo(String value) {
            addCriterion("merchant_sex =", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexNotEqualTo(String value) {
            addCriterion("merchant_sex <>", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexGreaterThan(String value) {
            addCriterion("merchant_sex >", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_sex >=", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexLessThan(String value) {
            addCriterion("merchant_sex <", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexLessThanOrEqualTo(String value) {
            addCriterion("merchant_sex <=", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexLike(String value) {
            addCriterion("merchant_sex like", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexNotLike(String value) {
            addCriterion("merchant_sex not like", value, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexIn(List<String> values) {
            addCriterion("merchant_sex in", values, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexNotIn(List<String> values) {
            addCriterion("merchant_sex not in", values, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexBetween(String value1, String value2) {
            addCriterion("merchant_sex between", value1, value2, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantSexNotBetween(String value1, String value2) {
            addCriterion("merchant_sex not between", value1, value2, "merchantSex");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardIsNull() {
            addCriterion("merchant_idcard is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardIsNotNull() {
            addCriterion("merchant_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardEqualTo(String value) {
            addCriterion("merchant_idcard =", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardNotEqualTo(String value) {
            addCriterion("merchant_idcard <>", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardGreaterThan(String value) {
            addCriterion("merchant_idcard >", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_idcard >=", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardLessThan(String value) {
            addCriterion("merchant_idcard <", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardLessThanOrEqualTo(String value) {
            addCriterion("merchant_idcard <=", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardLike(String value) {
            addCriterion("merchant_idcard like", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardNotLike(String value) {
            addCriterion("merchant_idcard not like", value, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardIn(List<String> values) {
            addCriterion("merchant_idcard in", values, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardNotIn(List<String> values) {
            addCriterion("merchant_idcard not in", values, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardBetween(String value1, String value2) {
            addCriterion("merchant_idcard between", value1, value2, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardNotBetween(String value1, String value2) {
            addCriterion("merchant_idcard not between", value1, value2, "merchantIdcard");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirIsNull() {
            addCriterion("merchant_idcard_dir is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirIsNotNull() {
            addCriterion("merchant_idcard_dir is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirEqualTo(String value) {
            addCriterion("merchant_idcard_dir =", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirNotEqualTo(String value) {
            addCriterion("merchant_idcard_dir <>", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirGreaterThan(String value) {
            addCriterion("merchant_idcard_dir >", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_idcard_dir >=", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirLessThan(String value) {
            addCriterion("merchant_idcard_dir <", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirLessThanOrEqualTo(String value) {
            addCriterion("merchant_idcard_dir <=", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirLike(String value) {
            addCriterion("merchant_idcard_dir like", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirNotLike(String value) {
            addCriterion("merchant_idcard_dir not like", value, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirIn(List<String> values) {
            addCriterion("merchant_idcard_dir in", values, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirNotIn(List<String> values) {
            addCriterion("merchant_idcard_dir not in", values, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirBetween(String value1, String value2) {
            addCriterion("merchant_idcard_dir between", value1, value2, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantIdcardDirNotBetween(String value1, String value2) {
            addCriterion("merchant_idcard_dir not between", value1, value2, "merchantIdcardDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirIsNull() {
            addCriterion("merchant_license_dir is null");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirIsNotNull() {
            addCriterion("merchant_license_dir is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirEqualTo(String value) {
            addCriterion("merchant_license_dir =", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirNotEqualTo(String value) {
            addCriterion("merchant_license_dir <>", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirGreaterThan(String value) {
            addCriterion("merchant_license_dir >", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_license_dir >=", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirLessThan(String value) {
            addCriterion("merchant_license_dir <", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirLessThanOrEqualTo(String value) {
            addCriterion("merchant_license_dir <=", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirLike(String value) {
            addCriterion("merchant_license_dir like", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirNotLike(String value) {
            addCriterion("merchant_license_dir not like", value, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirIn(List<String> values) {
            addCriterion("merchant_license_dir in", values, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirNotIn(List<String> values) {
            addCriterion("merchant_license_dir not in", values, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirBetween(String value1, String value2) {
            addCriterion("merchant_license_dir between", value1, value2, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseDirNotBetween(String value1, String value2) {
            addCriterion("merchant_license_dir not between", value1, value2, "merchantLicenseDir");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateIsNull() {
            addCriterion("merchant_register_date is null");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateIsNotNull() {
            addCriterion("merchant_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateEqualTo(Date value) {
            addCriterion("merchant_register_date =", value, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateNotEqualTo(Date value) {
            addCriterion("merchant_register_date <>", value, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateGreaterThan(Date value) {
            addCriterion("merchant_register_date >", value, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_register_date >=", value, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateLessThan(Date value) {
            addCriterion("merchant_register_date <", value, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("merchant_register_date <=", value, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateIn(List<Date> values) {
            addCriterion("merchant_register_date in", values, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateNotIn(List<Date> values) {
            addCriterion("merchant_register_date not in", values, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateBetween(Date value1, Date value2) {
            addCriterion("merchant_register_date between", value1, value2, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("merchant_register_date not between", value1, value2, "merchantRegisterDate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateIsNull() {
            addCriterion("merchant_service_price_rate is null");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateIsNotNull() {
            addCriterion("merchant_service_price_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateEqualTo(Double value) {
            addCriterion("merchant_service_price_rate =", value, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateNotEqualTo(Double value) {
            addCriterion("merchant_service_price_rate <>", value, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateGreaterThan(Double value) {
            addCriterion("merchant_service_price_rate >", value, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateGreaterThanOrEqualTo(Double value) {
            addCriterion("merchant_service_price_rate >=", value, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateLessThan(Double value) {
            addCriterion("merchant_service_price_rate <", value, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateLessThanOrEqualTo(Double value) {
            addCriterion("merchant_service_price_rate <=", value, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateIn(List<Double> values) {
            addCriterion("merchant_service_price_rate in", values, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateNotIn(List<Double> values) {
            addCriterion("merchant_service_price_rate not in", values, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateBetween(Double value1, Double value2) {
            addCriterion("merchant_service_price_rate between", value1, value2, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePriceRateNotBetween(Double value1, Double value2) {
            addCriterion("merchant_service_price_rate not between", value1, value2, "merchantServicePriceRate");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeIsNull() {
            addCriterion("merchant_satisfaction_degree is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeIsNotNull() {
            addCriterion("merchant_satisfaction_degree is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeEqualTo(Double value) {
            addCriterion("merchant_satisfaction_degree =", value, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeNotEqualTo(Double value) {
            addCriterion("merchant_satisfaction_degree <>", value, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeGreaterThan(Double value) {
            addCriterion("merchant_satisfaction_degree >", value, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("merchant_satisfaction_degree >=", value, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeLessThan(Double value) {
            addCriterion("merchant_satisfaction_degree <", value, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeLessThanOrEqualTo(Double value) {
            addCriterion("merchant_satisfaction_degree <=", value, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeIn(List<Double> values) {
            addCriterion("merchant_satisfaction_degree in", values, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeNotIn(List<Double> values) {
            addCriterion("merchant_satisfaction_degree not in", values, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeBetween(Double value1, Double value2) {
            addCriterion("merchant_satisfaction_degree between", value1, value2, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantSatisfactionDegreeNotBetween(Double value1, Double value2) {
            addCriterion("merchant_satisfaction_degree not between", value1, value2, "merchantSatisfactionDegree");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountIsNull() {
            addCriterion("merchant_total_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountIsNotNull() {
            addCriterion("merchant_total_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountEqualTo(Double value) {
            addCriterion("merchant_total_sale_amount =", value, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountNotEqualTo(Double value) {
            addCriterion("merchant_total_sale_amount <>", value, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountGreaterThan(Double value) {
            addCriterion("merchant_total_sale_amount >", value, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("merchant_total_sale_amount >=", value, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountLessThan(Double value) {
            addCriterion("merchant_total_sale_amount <", value, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountLessThanOrEqualTo(Double value) {
            addCriterion("merchant_total_sale_amount <=", value, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountIn(List<Double> values) {
            addCriterion("merchant_total_sale_amount in", values, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountNotIn(List<Double> values) {
            addCriterion("merchant_total_sale_amount not in", values, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountBetween(Double value1, Double value2) {
            addCriterion("merchant_total_sale_amount between", value1, value2, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalSaleAmountNotBetween(Double value1, Double value2) {
            addCriterion("merchant_total_sale_amount not between", value1, value2, "merchantTotalSaleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseIsNull() {
            addCriterion("merchant_license is null");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseIsNotNull() {
            addCriterion("merchant_license is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseEqualTo(String value) {
            addCriterion("merchant_license =", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseNotEqualTo(String value) {
            addCriterion("merchant_license <>", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseGreaterThan(String value) {
            addCriterion("merchant_license >", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_license >=", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseLessThan(String value) {
            addCriterion("merchant_license <", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseLessThanOrEqualTo(String value) {
            addCriterion("merchant_license <=", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseLike(String value) {
            addCriterion("merchant_license like", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseNotLike(String value) {
            addCriterion("merchant_license not like", value, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseIn(List<String> values) {
            addCriterion("merchant_license in", values, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseNotIn(List<String> values) {
            addCriterion("merchant_license not in", values, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseBetween(String value1, String value2) {
            addCriterion("merchant_license between", value1, value2, "merchantLicense");
            return (Criteria) this;
        }

        public Criteria andMerchantLicenseNotBetween(String value1, String value2) {
            addCriterion("merchant_license not between", value1, value2, "merchantLicense");
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