package com.example.springboot.model;

import java.util.Date;

public class Comment extends CommentKey {
    private Date commentDate;

    private String commentTextInfo;

    private String commentPicInfo;

    private String commentAddInfo;

    private double commentServeAtitude;

    private double commentResponseSpeed;

    private double commentAsDescription;

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentTextInfo() {
        return commentTextInfo;
    }

    public void setCommentTextInfo(String commentTextInfo) {
        this.commentTextInfo = commentTextInfo == null ? null : commentTextInfo.trim();
    }

    public String getCommentPicInfo() {
        return commentPicInfo;
    }

    public void setCommentPicInfo(String commentPicInfo) {
        this.commentPicInfo = commentPicInfo == null ? null : commentPicInfo.trim();
    }

    public String getCommentAddInfo() {
        return commentAddInfo;
    }

    public void setCommentAddInfo(String commentAddInfo) {
        this.commentAddInfo = commentAddInfo == null ? null : commentAddInfo.trim();
    }

    public double getCommentServeAtitude() {
        return commentServeAtitude;
    }

    public void setCommentServeAtitude(double commentServeAtitude) {
        this.commentServeAtitude = commentServeAtitude;
    }

    public double getCommentResponseSpeed() {
        return commentResponseSpeed;
    }

    public void setCommentResponseSpeed(double commentResponseSpeed) {
        this.commentResponseSpeed = commentResponseSpeed;
    }

    public double getCommentAsDescription() {
        return commentAsDescription;
    }

    public void setCommentAsDescription(double commentAsDescription) {
        this.commentAsDescription = commentAsDescription;
    }
}