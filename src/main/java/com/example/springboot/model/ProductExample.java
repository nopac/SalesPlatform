package com.example.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Integer value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Integer value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Integer value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Integer value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Integer> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Integer> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Integer value1, Integer value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceIsNull() {
            addCriterion("product_discount_price is null");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceIsNotNull() {
            addCriterion("product_discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceEqualTo(Double value) {
            addCriterion("product_discount_price =", value, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceNotEqualTo(Double value) {
            addCriterion("product_discount_price <>", value, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceGreaterThan(Double value) {
            addCriterion("product_discount_price >", value, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_discount_price >=", value, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceLessThan(Double value) {
            addCriterion("product_discount_price <", value, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_discount_price <=", value, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceIn(List<Double> values) {
            addCriterion("product_discount_price in", values, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceNotIn(List<Double> values) {
            addCriterion("product_discount_price not in", values, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceBetween(Double value1, Double value2) {
            addCriterion("product_discount_price between", value1, value2, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductDiscountPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_discount_price not between", value1, value2, "productDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNull() {
            addCriterion("product_category is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNotNull() {
            addCriterion("product_category is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryEqualTo(String value) {
            addCriterion("product_category =", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotEqualTo(String value) {
            addCriterion("product_category <>", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThan(String value) {
            addCriterion("product_category >", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("product_category >=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThan(String value) {
            addCriterion("product_category <", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThanOrEqualTo(String value) {
            addCriterion("product_category <=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLike(String value) {
            addCriterion("product_category like", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotLike(String value) {
            addCriterion("product_category not like", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIn(List<String> values) {
            addCriterion("product_category in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotIn(List<String> values) {
            addCriterion("product_category not in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryBetween(String value1, String value2) {
            addCriterion("product_category between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotBetween(String value1, String value2) {
            addCriterion("product_category not between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNull() {
            addCriterion("product_size is null");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNotNull() {
            addCriterion("product_size is not null");
            return (Criteria) this;
        }

        public Criteria andProductSizeEqualTo(String value) {
            addCriterion("product_size =", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotEqualTo(String value) {
            addCriterion("product_size <>", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThan(String value) {
            addCriterion("product_size >", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThanOrEqualTo(String value) {
            addCriterion("product_size >=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThan(String value) {
            addCriterion("product_size <", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThanOrEqualTo(String value) {
            addCriterion("product_size <=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLike(String value) {
            addCriterion("product_size like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotLike(String value) {
            addCriterion("product_size not like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeIn(List<String> values) {
            addCriterion("product_size in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotIn(List<String> values) {
            addCriterion("product_size not in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeBetween(String value1, String value2) {
            addCriterion("product_size between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotBetween(String value1, String value2) {
            addCriterion("product_size not between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirIsNull() {
            addCriterion("product_picture_dir is null");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirIsNotNull() {
            addCriterion("product_picture_dir is not null");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirEqualTo(String value) {
            addCriterion("product_picture_dir =", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirNotEqualTo(String value) {
            addCriterion("product_picture_dir <>", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirGreaterThan(String value) {
            addCriterion("product_picture_dir >", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirGreaterThanOrEqualTo(String value) {
            addCriterion("product_picture_dir >=", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirLessThan(String value) {
            addCriterion("product_picture_dir <", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirLessThanOrEqualTo(String value) {
            addCriterion("product_picture_dir <=", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirLike(String value) {
            addCriterion("product_picture_dir like", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirNotLike(String value) {
            addCriterion("product_picture_dir not like", value, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirIn(List<String> values) {
            addCriterion("product_picture_dir in", values, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirNotIn(List<String> values) {
            addCriterion("product_picture_dir not in", values, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirBetween(String value1, String value2) {
            addCriterion("product_picture_dir between", value1, value2, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductPictureDirNotBetween(String value1, String value2) {
            addCriterion("product_picture_dir not between", value1, value2, "productPictureDir");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableIsNull() {
            addCriterion("product_negotiable is null");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableIsNotNull() {
            addCriterion("product_negotiable is not null");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableEqualTo(String value) {
            addCriterion("product_negotiable =", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableNotEqualTo(String value) {
            addCriterion("product_negotiable <>", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableGreaterThan(String value) {
            addCriterion("product_negotiable >", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableGreaterThanOrEqualTo(String value) {
            addCriterion("product_negotiable >=", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableLessThan(String value) {
            addCriterion("product_negotiable <", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableLessThanOrEqualTo(String value) {
            addCriterion("product_negotiable <=", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableLike(String value) {
            addCriterion("product_negotiable like", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableNotLike(String value) {
            addCriterion("product_negotiable not like", value, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableIn(List<String> values) {
            addCriterion("product_negotiable in", values, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableNotIn(List<String> values) {
            addCriterion("product_negotiable not in", values, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableBetween(String value1, String value2) {
            addCriterion("product_negotiable between", value1, value2, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductNegotiableNotBetween(String value1, String value2) {
            addCriterion("product_negotiable not between", value1, value2, "productNegotiable");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeIsNull() {
            addCriterion("product_condition_degree is null");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeIsNotNull() {
            addCriterion("product_condition_degree is not null");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeEqualTo(Double value) {
            addCriterion("product_condition_degree =", value, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeNotEqualTo(Double value) {
            addCriterion("product_condition_degree <>", value, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeGreaterThan(Double value) {
            addCriterion("product_condition_degree >", value, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeGreaterThanOrEqualTo(Double value) {
            addCriterion("product_condition_degree >=", value, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeLessThan(Double value) {
            addCriterion("product_condition_degree <", value, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeLessThanOrEqualTo(Double value) {
            addCriterion("product_condition_degree <=", value, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeIn(List<Double> values) {
            addCriterion("product_condition_degree in", values, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeNotIn(List<Double> values) {
            addCriterion("product_condition_degree not in", values, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeBetween(Double value1, Double value2) {
            addCriterion("product_condition_degree between", value1, value2, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductConditionDegreeNotBetween(Double value1, Double value2) {
            addCriterion("product_condition_degree not between", value1, value2, "productConditionDegree");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleIsNull() {
            addCriterion("product_on_sale is null");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleIsNotNull() {
            addCriterion("product_on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleEqualTo(String value) {
            addCriterion("product_on_sale =", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleNotEqualTo(String value) {
            addCriterion("product_on_sale <>", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleGreaterThan(String value) {
            addCriterion("product_on_sale >", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleGreaterThanOrEqualTo(String value) {
            addCriterion("product_on_sale >=", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleLessThan(String value) {
            addCriterion("product_on_sale <", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleLessThanOrEqualTo(String value) {
            addCriterion("product_on_sale <=", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleLike(String value) {
            addCriterion("product_on_sale like", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleNotLike(String value) {
            addCriterion("product_on_sale not like", value, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleIn(List<String> values) {
            addCriterion("product_on_sale in", values, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleNotIn(List<String> values) {
            addCriterion("product_on_sale not in", values, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleBetween(String value1, String value2) {
            addCriterion("product_on_sale between", value1, value2, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductOnSaleNotBetween(String value1, String value2) {
            addCriterion("product_on_sale not between", value1, value2, "productOnSale");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("product_description is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("product_description is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("product_description =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("product_description <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("product_description >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("product_description >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("product_description <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("product_description <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("product_description like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("product_description not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("product_description in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("product_description not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("product_description between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("product_description not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductAddDateIsNull() {
            addCriterion("product_add_date is null");
            return (Criteria) this;
        }

        public Criteria andProductAddDateIsNotNull() {
            addCriterion("product_add_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductAddDateEqualTo(Date value) {
            addCriterion("product_add_date =", value, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateNotEqualTo(Date value) {
            addCriterion("product_add_date <>", value, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateGreaterThan(Date value) {
            addCriterion("product_add_date >", value, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("product_add_date >=", value, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateLessThan(Date value) {
            addCriterion("product_add_date <", value, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateLessThanOrEqualTo(Date value) {
            addCriterion("product_add_date <=", value, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateIn(List<Date> values) {
            addCriterion("product_add_date in", values, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateNotIn(List<Date> values) {
            addCriterion("product_add_date not in", values, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateBetween(Date value1, Date value2) {
            addCriterion("product_add_date between", value1, value2, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductAddDateNotBetween(Date value1, Date value2) {
            addCriterion("product_add_date not between", value1, value2, "productAddDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateIsNull() {
            addCriterion("product_delete_date is null");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateIsNotNull() {
            addCriterion("product_delete_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateEqualTo(Date value) {
            addCriterion("product_delete_date =", value, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateNotEqualTo(Date value) {
            addCriterion("product_delete_date <>", value, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateGreaterThan(Date value) {
            addCriterion("product_delete_date >", value, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("product_delete_date >=", value, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateLessThan(Date value) {
            addCriterion("product_delete_date <", value, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateLessThanOrEqualTo(Date value) {
            addCriterion("product_delete_date <=", value, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateIn(List<Date> values) {
            addCriterion("product_delete_date in", values, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateNotIn(List<Date> values) {
            addCriterion("product_delete_date not in", values, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateBetween(Date value1, Date value2) {
            addCriterion("product_delete_date between", value1, value2, "productDeleteDate");
            return (Criteria) this;
        }

        public Criteria andProductDeleteDateNotBetween(Date value1, Date value2) {
            addCriterion("product_delete_date not between", value1, value2, "productDeleteDate");
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