package org.example;

import java.util.Date;

public class Question {
    private String questionId;
    private String questionTitle;
    private String description;
    private Date postDate;
    private Integer totalVote=0;
    private QuestionTag questionTag;
    private String userId;

    public Question(String questionId, String questionTitle, String description, Date postDate, Integer totalVote, QuestionTag questionTag, String userId) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.description = description;
        this.postDate = postDate;
        this.totalVote = totalVote;
        this.questionTag = questionTag;
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Integer getTotalVote() {
        return totalVote;
    }

    public void setTotalVote(Integer totalVote) {
        this.totalVote = totalVote;
    }

    public QuestionTag getQuestionTag() {
        return questionTag;
    }

    public void setQuestionTag(QuestionTag questionTag) {
        this.questionTag = questionTag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", questionTitle='" + questionTitle + '\'' +
                ", description='" + description + '\'' +
                ", postDate=" + postDate +
                ", totalVote=" + totalVote +
                ", questionTag=" + questionTag +
                ", userId='" + userId + '\'' +
                '}';
    }
}
