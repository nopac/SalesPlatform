package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentCustomerIsNull() {
            addCriterion("comment_customer is null");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerIsNotNull() {
            addCriterion("comment_customer is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerEqualTo(String value) {
            addCriterion("comment_customer =", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerNotEqualTo(String value) {
            addCriterion("comment_customer <>", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerGreaterThan(String value) {
            addCriterion("comment_customer >", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("comment_customer >=", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerLessThan(String value) {
            addCriterion("comment_customer <", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerLessThanOrEqualTo(String value) {
            addCriterion("comment_customer <=", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerLike(String value) {
            addCriterion("comment_customer like", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerNotLike(String value) {
            addCriterion("comment_customer not like", value, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerIn(List<String> values) {
            addCriterion("comment_customer in", values, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerNotIn(List<String> values) {
            addCriterion("comment_customer not in", values, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerBetween(String value1, String value2) {
            addCriterion("comment_customer between", value1, value2, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentCustomerNotBetween(String value1, String value2) {
            addCriterion("comment_customer not between", value1, value2, "commentCustomer");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantIsNull() {
            addCriterion("comment_merchant is null");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantIsNotNull() {
            addCriterion("comment_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantEqualTo(String value) {
            addCriterion("comment_merchant =", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantNotEqualTo(String value) {
            addCriterion("comment_merchant <>", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantGreaterThan(String value) {
            addCriterion("comment_merchant >", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("comment_merchant >=", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantLessThan(String value) {
            addCriterion("comment_merchant <", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantLessThanOrEqualTo(String value) {
            addCriterion("comment_merchant <=", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantLike(String value) {
            addCriterion("comment_merchant like", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantNotLike(String value) {
            addCriterion("comment_merchant not like", value, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantIn(List<String> values) {
            addCriterion("comment_merchant in", values, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantNotIn(List<String> values) {
            addCriterion("comment_merchant not in", values, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantBetween(String value1, String value2) {
            addCriterion("comment_merchant between", value1, value2, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentMerchantNotBetween(String value1, String value2) {
            addCriterion("comment_merchant not between", value1, value2, "commentMerchant");
            return (Criteria) this;
        }

        public Criteria andCommentProductIsNull() {
            addCriterion("comment_product is null");
            return (Criteria) this;
        }

        public Criteria andCommentProductIsNotNull() {
            addCriterion("comment_product is not null");
            return (Criteria) this;
        }

        public Criteria andCommentProductEqualTo(Integer value) {
            addCriterion("comment_product =", value, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductNotEqualTo(Integer value) {
            addCriterion("comment_product <>", value, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductGreaterThan(Integer value) {
            addCriterion("comment_product >", value, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_product >=", value, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductLessThan(Integer value) {
            addCriterion("comment_product <", value, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductLessThanOrEqualTo(Integer value) {
            addCriterion("comment_product <=", value, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductIn(List<Integer> values) {
            addCriterion("comment_product in", values, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductNotIn(List<Integer> values) {
            addCriterion("comment_product not in", values, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductBetween(Integer value1, Integer value2) {
            addCriterion("comment_product between", value1, value2, "commentProduct");
            return (Criteria) this;
        }

        public Criteria andCommentProductNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_product not between", value1, value2, "commentProduct");
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

        public Criteria andCommentAddInfoIsNull() {
            addCriterion("comment_add_info is null");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoIsNotNull() {
            addCriterion("comment_add_info is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoEqualTo(String value) {
            addCriterion("comment_add_info =", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoNotEqualTo(String value) {
            addCriterion("comment_add_info <>", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoGreaterThan(String value) {
            addCriterion("comment_add_info >", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comment_add_info >=", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoLessThan(String value) {
            addCriterion("comment_add_info <", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoLessThanOrEqualTo(String value) {
            addCriterion("comment_add_info <=", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoLike(String value) {
            addCriterion("comment_add_info like", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoNotLike(String value) {
            addCriterion("comment_add_info not like", value, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoIn(List<String> values) {
            addCriterion("comment_add_info in", values, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoNotIn(List<String> values) {
            addCriterion("comment_add_info not in", values, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoBetween(String value1, String value2) {
            addCriterion("comment_add_info between", value1, value2, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentAddInfoNotBetween(String value1, String value2) {
            addCriterion("comment_add_info not between", value1, value2, "commentAddInfo");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeIsNull() {
            addCriterion("comment_serve_atitude is null");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeIsNotNull() {
            addCriterion("comment_serve_atitude is not null");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeEqualTo(Integer value) {
            addCriterion("comment_serve_atitude =", value, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeNotEqualTo(Integer value) {
            addCriterion("comment_serve_atitude <>", value, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeGreaterThan(Integer value) {
            addCriterion("comment_serve_atitude >", value, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_serve_atitude >=", value, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeLessThan(Integer value) {
            addCriterion("comment_serve_atitude <", value, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_serve_atitude <=", value, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeIn(List<Integer> values) {
            addCriterion("comment_serve_atitude in", values, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeNotIn(List<Integer> values) {
            addCriterion("comment_serve_atitude not in", values, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeBetween(Integer value1, Integer value2) {
            addCriterion("comment_serve_atitude between", value1, value2, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentServeAtitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_serve_atitude not between", value1, value2, "commentServeAtitude");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedIsNull() {
            addCriterion("comment_response_speed is null");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedIsNotNull() {
            addCriterion("comment_response_speed is not null");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedEqualTo(Integer value) {
            addCriterion("comment_response_speed =", value, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedNotEqualTo(Integer value) {
            addCriterion("comment_response_speed <>", value, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedGreaterThan(Integer value) {
            addCriterion("comment_response_speed >", value, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_response_speed >=", value, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedLessThan(Integer value) {
            addCriterion("comment_response_speed <", value, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("comment_response_speed <=", value, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedIn(List<Integer> values) {
            addCriterion("comment_response_speed in", values, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedNotIn(List<Integer> values) {
            addCriterion("comment_response_speed not in", values, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedBetween(Integer value1, Integer value2) {
            addCriterion("comment_response_speed between", value1, value2, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentResponseSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_response_speed not between", value1, value2, "commentResponseSpeed");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionIsNull() {
            addCriterion("comment_as_description is null");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionIsNotNull() {
            addCriterion("comment_as_description is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionEqualTo(Integer value) {
            addCriterion("comment_as_description =", value, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionNotEqualTo(Integer value) {
            addCriterion("comment_as_description <>", value, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionGreaterThan(Integer value) {
            addCriterion("comment_as_description >", value, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_as_description >=", value, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionLessThan(Integer value) {
            addCriterion("comment_as_description <", value, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionLessThanOrEqualTo(Integer value) {
            addCriterion("comment_as_description <=", value, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionIn(List<Integer> values) {
            addCriterion("comment_as_description in", values, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionNotIn(List<Integer> values) {
            addCriterion("comment_as_description not in", values, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionBetween(Integer value1, Integer value2) {
            addCriterion("comment_as_description between", value1, value2, "commentAsDescription");
            return (Criteria) this;
        }

        public Criteria andCommentAsDescriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_as_description not between", value1, value2, "commentAsDescription");
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