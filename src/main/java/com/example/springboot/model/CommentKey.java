package com.example.springboot.model;

public class CommentKey {
    private Integer commentId;

    private String commentCustomer;

    private String commentMerchant;

    private Integer commentProduct;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentCustomer() {
        return commentCustomer;
    }

    public void setCommentCustomer(String commentCustomer) {
        this.commentCustomer = commentCustomer == null ? null : commentCustomer.trim();
    }

    public String getCommentMerchant() {
        return commentMerchant;
    }

    public void setCommentMerchant(String commentMerchant) {
        this.commentMerchant = commentMerchant == null ? null : commentMerchant.trim();
    }

    public Integer getCommentProduct() {
        return commentProduct;
    }

    public void setCommentProduct(Integer commentProduct) {
        this.commentProduct = commentProduct;
    }
}