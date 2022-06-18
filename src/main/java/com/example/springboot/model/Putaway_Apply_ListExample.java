package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Putaway_Apply_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Putaway_Apply_ListExample() {
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

        public Criteria andPutawayIdIsNull() {
            addCriterion("putaway_id is null");
            return (Criteria) this;
        }

        public Criteria andPutawayIdIsNotNull() {
            addCriterion("putaway_id is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayIdEqualTo(Integer value) {
            addCriterion("putaway_id =", value, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdNotEqualTo(Integer value) {
            addCriterion("putaway_id <>", value, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdGreaterThan(Integer value) {
            addCriterion("putaway_id >", value, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("putaway_id >=", value, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdLessThan(Integer value) {
            addCriterion("putaway_id <", value, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdLessThanOrEqualTo(Integer value) {
            addCriterion("putaway_id <=", value, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdIn(List<Integer> values) {
            addCriterion("putaway_id in", values, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdNotIn(List<Integer> values) {
            addCriterion("putaway_id not in", values, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdBetween(Integer value1, Integer value2) {
            addCriterion("putaway_id between", value1, value2, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("putaway_id not between", value1, value2, "putawayId");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantIsNull() {
            addCriterion("putaway_merchant is null");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantIsNotNull() {
            addCriterion("putaway_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantEqualTo(String value) {
            addCriterion("putaway_merchant =", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantNotEqualTo(String value) {
            addCriterion("putaway_merchant <>", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantGreaterThan(String value) {
            addCriterion("putaway_merchant >", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_merchant >=", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantLessThan(String value) {
            addCriterion("putaway_merchant <", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantLessThanOrEqualTo(String value) {
            addCriterion("putaway_merchant <=", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantLike(String value) {
            addCriterion("putaway_merchant like", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantNotLike(String value) {
            addCriterion("putaway_merchant not like", value, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantIn(List<String> values) {
            addCriterion("putaway_merchant in", values, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantNotIn(List<String> values) {
            addCriterion("putaway_merchant not in", values, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantBetween(String value1, String value2) {
            addCriterion("putaway_merchant between", value1, value2, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayMerchantNotBetween(String value1, String value2) {
            addCriterion("putaway_merchant not between", value1, value2, "putawayMerchant");
            return (Criteria) this;
        }

        public Criteria andPutawayNameIsNull() {
            addCriterion("putaway_name is null");
            return (Criteria) this;
        }

        public Criteria andPutawayNameIsNotNull() {
            addCriterion("putaway_name is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayNameEqualTo(String value) {
            addCriterion("putaway_name =", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameNotEqualTo(String value) {
            addCriterion("putaway_name <>", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameGreaterThan(String value) {
            addCriterion("putaway_name >", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_name >=", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameLessThan(String value) {
            addCriterion("putaway_name <", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameLessThanOrEqualTo(String value) {
            addCriterion("putaway_name <=", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameLike(String value) {
            addCriterion("putaway_name like", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameNotLike(String value) {
            addCriterion("putaway_name not like", value, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameIn(List<String> values) {
            addCriterion("putaway_name in", values, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameNotIn(List<String> values) {
            addCriterion("putaway_name not in", values, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameBetween(String value1, String value2) {
            addCriterion("putaway_name between", value1, value2, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayNameNotBetween(String value1, String value2) {
            addCriterion("putaway_name not between", value1, value2, "putawayName");
            return (Criteria) this;
        }

        public Criteria andPutawayCountIsNull() {
            addCriterion("putaway_count is null");
            return (Criteria) this;
        }

        public Criteria andPutawayCountIsNotNull() {
            addCriterion("putaway_count is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayCountEqualTo(Integer value) {
            addCriterion("putaway_count =", value, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountNotEqualTo(Integer value) {
            addCriterion("putaway_count <>", value, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountGreaterThan(Integer value) {
            addCriterion("putaway_count >", value, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("putaway_count >=", value, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountLessThan(Integer value) {
            addCriterion("putaway_count <", value, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountLessThanOrEqualTo(Integer value) {
            addCriterion("putaway_count <=", value, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountIn(List<Integer> values) {
            addCriterion("putaway_count in", values, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountNotIn(List<Integer> values) {
            addCriterion("putaway_count not in", values, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountBetween(Integer value1, Integer value2) {
            addCriterion("putaway_count between", value1, value2, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("putaway_count not between", value1, value2, "putawayCount");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceIsNull() {
            addCriterion("putaway_price is null");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceIsNotNull() {
            addCriterion("putaway_price is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceEqualTo(Double value) {
            addCriterion("putaway_price =", value, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceNotEqualTo(Double value) {
            addCriterion("putaway_price <>", value, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceGreaterThan(Double value) {
            addCriterion("putaway_price >", value, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("putaway_price >=", value, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceLessThan(Double value) {
            addCriterion("putaway_price <", value, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceLessThanOrEqualTo(Double value) {
            addCriterion("putaway_price <=", value, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceIn(List<Double> values) {
            addCriterion("putaway_price in", values, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceNotIn(List<Double> values) {
            addCriterion("putaway_price not in", values, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceBetween(Double value1, Double value2) {
            addCriterion("putaway_price between", value1, value2, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayPriceNotBetween(Double value1, Double value2) {
            addCriterion("putaway_price not between", value1, value2, "putawayPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceIsNull() {
            addCriterion("putaway_discount_price is null");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceIsNotNull() {
            addCriterion("putaway_discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceEqualTo(Double value) {
            addCriterion("putaway_discount_price =", value, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceNotEqualTo(Double value) {
            addCriterion("putaway_discount_price <>", value, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceGreaterThan(Double value) {
            addCriterion("putaway_discount_price >", value, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("putaway_discount_price >=", value, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceLessThan(Double value) {
            addCriterion("putaway_discount_price <", value, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceLessThanOrEqualTo(Double value) {
            addCriterion("putaway_discount_price <=", value, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceIn(List<Double> values) {
            addCriterion("putaway_discount_price in", values, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceNotIn(List<Double> values) {
            addCriterion("putaway_discount_price not in", values, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceBetween(Double value1, Double value2) {
            addCriterion("putaway_discount_price between", value1, value2, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayDiscountPriceNotBetween(Double value1, Double value2) {
            addCriterion("putaway_discount_price not between", value1, value2, "putawayDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryIsNull() {
            addCriterion("putaway_catagory is null");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryIsNotNull() {
            addCriterion("putaway_catagory is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryEqualTo(String value) {
            addCriterion("putaway_catagory =", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryNotEqualTo(String value) {
            addCriterion("putaway_catagory <>", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryGreaterThan(String value) {
            addCriterion("putaway_catagory >", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_catagory >=", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryLessThan(String value) {
            addCriterion("putaway_catagory <", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryLessThanOrEqualTo(String value) {
            addCriterion("putaway_catagory <=", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryLike(String value) {
            addCriterion("putaway_catagory like", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryNotLike(String value) {
            addCriterion("putaway_catagory not like", value, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryIn(List<String> values) {
            addCriterion("putaway_catagory in", values, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryNotIn(List<String> values) {
            addCriterion("putaway_catagory not in", values, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryBetween(String value1, String value2) {
            addCriterion("putaway_catagory between", value1, value2, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawayCatagoryNotBetween(String value1, String value2) {
            addCriterion("putaway_catagory not between", value1, value2, "putawayCatagory");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeIsNull() {
            addCriterion("putaway_size is null");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeIsNotNull() {
            addCriterion("putaway_size is not null");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeEqualTo(String value) {
            addCriterion("putaway_size =", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeNotEqualTo(String value) {
            addCriterion("putaway_size <>", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeGreaterThan(String value) {
            addCriterion("putaway_size >", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_size >=", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeLessThan(String value) {
            addCriterion("putaway_size <", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeLessThanOrEqualTo(String value) {
            addCriterion("putaway_size <=", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeLike(String value) {
            addCriterion("putaway_size like", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeNotLike(String value) {
            addCriterion("putaway_size not like", value, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeIn(List<String> values) {
            addCriterion("putaway_size in", values, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeNotIn(List<String> values) {
            addCriterion("putaway_size not in", values, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeBetween(String value1, String value2) {
            addCriterion("putaway_size between", value1, value2, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawaySizeNotBetween(String value1, String value2) {
            addCriterion("putaway_size not between", value1, value2, "putawaySize");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirIsNull() {
            addCriterion("putaway_picture_dir is null");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirIsNotNull() {
            addCriterion("putaway_picture_dir is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirEqualTo(String value) {
            addCriterion("putaway_picture_dir =", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirNotEqualTo(String value) {
            addCriterion("putaway_picture_dir <>", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirGreaterThan(String value) {
            addCriterion("putaway_picture_dir >", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_picture_dir >=", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirLessThan(String value) {
            addCriterion("putaway_picture_dir <", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirLessThanOrEqualTo(String value) {
            addCriterion("putaway_picture_dir <=", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirLike(String value) {
            addCriterion("putaway_picture_dir like", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirNotLike(String value) {
            addCriterion("putaway_picture_dir not like", value, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirIn(List<String> values) {
            addCriterion("putaway_picture_dir in", values, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirNotIn(List<String> values) {
            addCriterion("putaway_picture_dir not in", values, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirBetween(String value1, String value2) {
            addCriterion("putaway_picture_dir between", value1, value2, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayPictureDirNotBetween(String value1, String value2) {
            addCriterion("putaway_picture_dir not between", value1, value2, "putawayPictureDir");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableIsNull() {
            addCriterion("putaway_negotiable is null");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableIsNotNull() {
            addCriterion("putaway_negotiable is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableEqualTo(String value) {
            addCriterion("putaway_negotiable =", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableNotEqualTo(String value) {
            addCriterion("putaway_negotiable <>", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableGreaterThan(String value) {
            addCriterion("putaway_negotiable >", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_negotiable >=", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableLessThan(String value) {
            addCriterion("putaway_negotiable <", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableLessThanOrEqualTo(String value) {
            addCriterion("putaway_negotiable <=", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableLike(String value) {
            addCriterion("putaway_negotiable like", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableNotLike(String value) {
            addCriterion("putaway_negotiable not like", value, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableIn(List<String> values) {
            addCriterion("putaway_negotiable in", values, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableNotIn(List<String> values) {
            addCriterion("putaway_negotiable not in", values, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableBetween(String value1, String value2) {
            addCriterion("putaway_negotiable between", value1, value2, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayNegotiableNotBetween(String value1, String value2) {
            addCriterion("putaway_negotiable not between", value1, value2, "putawayNegotiable");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeIsNull() {
            addCriterion("putaway_condition_degree is null");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeIsNotNull() {
            addCriterion("putaway_condition_degree is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeEqualTo(Double value) {
            addCriterion("putaway_condition_degree =", value, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeNotEqualTo(Double value) {
            addCriterion("putaway_condition_degree <>", value, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeGreaterThan(Double value) {
            addCriterion("putaway_condition_degree >", value, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("putaway_condition_degree >=", value, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeLessThan(Double value) {
            addCriterion("putaway_condition_degree <", value, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeLessThanOrEqualTo(Double value) {
            addCriterion("putaway_condition_degree <=", value, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeIn(List<Double> values) {
            addCriterion("putaway_condition_degree in", values, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeNotIn(List<Double> values) {
            addCriterion("putaway_condition_degree not in", values, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeBetween(Double value1, Double value2) {
            addCriterion("putaway_condition_degree between", value1, value2, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayConditionDegreeNotBetween(Double value1, Double value2) {
            addCriterion("putaway_condition_degree not between", value1, value2, "putawayConditionDegree");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionIsNull() {
            addCriterion("putaway_description is null");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionIsNotNull() {
            addCriterion("putaway_description is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionEqualTo(String value) {
            addCriterion("putaway_description =", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionNotEqualTo(String value) {
            addCriterion("putaway_description <>", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionGreaterThan(String value) {
            addCriterion("putaway_description >", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_description >=", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionLessThan(String value) {
            addCriterion("putaway_description <", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionLessThanOrEqualTo(String value) {
            addCriterion("putaway_description <=", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionLike(String value) {
            addCriterion("putaway_description like", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionNotLike(String value) {
            addCriterion("putaway_description not like", value, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionIn(List<String> values) {
            addCriterion("putaway_description in", values, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionNotIn(List<String> values) {
            addCriterion("putaway_description not in", values, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionBetween(String value1, String value2) {
            addCriterion("putaway_description between", value1, value2, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayDescriptionNotBetween(String value1, String value2) {
            addCriterion("putaway_description not between", value1, value2, "putawayDescription");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentIsNull() {
            addCriterion("putaway_statment is null");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentIsNotNull() {
            addCriterion("putaway_statment is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentEqualTo(String value) {
            addCriterion("putaway_statment =", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentNotEqualTo(String value) {
            addCriterion("putaway_statment <>", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentGreaterThan(String value) {
            addCriterion("putaway_statment >", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentGreaterThanOrEqualTo(String value) {
            addCriterion("putaway_statment >=", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentLessThan(String value) {
            addCriterion("putaway_statment <", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentLessThanOrEqualTo(String value) {
            addCriterion("putaway_statment <=", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentLike(String value) {
            addCriterion("putaway_statment like", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentNotLike(String value) {
            addCriterion("putaway_statment not like", value, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentIn(List<String> values) {
            addCriterion("putaway_statment in", values, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentNotIn(List<String> values) {
            addCriterion("putaway_statment not in", values, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentBetween(String value1, String value2) {
            addCriterion("putaway_statment between", value1, value2, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawayStatmentNotBetween(String value1, String value2) {
            addCriterion("putaway_statment not between", value1, value2, "putawayStatment");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateIsNull() {
            addCriterion("putaway_submit_date is null");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateIsNotNull() {
            addCriterion("putaway_submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateEqualTo(Date value) {
            addCriterion("putaway_submit_date =", value, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateNotEqualTo(Date value) {
            addCriterion("putaway_submit_date <>", value, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateGreaterThan(Date value) {
            addCriterion("putaway_submit_date >", value, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("putaway_submit_date >=", value, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateLessThan(Date value) {
            addCriterion("putaway_submit_date <", value, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("putaway_submit_date <=", value, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateIn(List<Date> values) {
            addCriterion("putaway_submit_date in", values, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateNotIn(List<Date> values) {
            addCriterion("putaway_submit_date not in", values, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateBetween(Date value1, Date value2) {
            addCriterion("putaway_submit_date between", value1, value2, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawaySubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("putaway_submit_date not between", value1, value2, "putawaySubmitDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateIsNull() {
            addCriterion("putaway_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateIsNotNull() {
            addCriterion("putaway_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateEqualTo(Date value) {
            addCriterion("putaway_finish_date =", value, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateNotEqualTo(Date value) {
            addCriterion("putaway_finish_date <>", value, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateGreaterThan(Date value) {
            addCriterion("putaway_finish_date >", value, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("putaway_finish_date >=", value, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateLessThan(Date value) {
            addCriterion("putaway_finish_date <", value, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("putaway_finish_date <=", value, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateIn(List<Date> values) {
            addCriterion("putaway_finish_date in", values, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateNotIn(List<Date> values) {
            addCriterion("putaway_finish_date not in", values, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateBetween(Date value1, Date value2) {
            addCriterion("putaway_finish_date between", value1, value2, "putawayFinishDate");
            return (Criteria) this;
        }

        public Criteria andPutawayFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("putaway_finish_date not between", value1, value2, "putawayFinishDate");
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