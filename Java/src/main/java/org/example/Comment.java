package org.example;

import java.util.Date;

public class Comment {
    private String commentId;
    private String commnet;
    private Date commentDate;
    private String userId;

    public Comment(String commentId, String commnet, Date commentDate, String userId) {
        this.commentId = commentId;
        this.commnet = commnet;
        this.commentDate = commentDate;
        this.userId = userId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommnet() {
        return commnet;
    }

    public void setCommnet(String commnet) {
        this.commnet = commnet;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", commnet='" + commnet + '\'' +
                ", commentDate=" + commentDate +
                ", userId='" + userId + '\'' +
                '}';
    }
}
