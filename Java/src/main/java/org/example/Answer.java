package org.example;

import java.util.Date;

public class Answer {
    private String answerId;
    private String answer;
    private Date answerDate;
    private String userId;
    private Integer totalVote=0;

    public Answer(String answerId, String answer, Date answerDate, String userId, Integer totalVote) {
        this.answerId = answerId;
        this.answer = answer;
        this.answerDate = answerDate;
        this.userId = userId;
        this.totalVote = totalVote;
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getTotalVote() {
        return totalVote;
    }

    public void setTotalVote(Integer totalVote) {
        this.totalVote = totalVote;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId='" + answerId + '\'' +
                ", answer='" + answer + '\'' +
                ", answerDate=" + answerDate +
                ", userId='" + userId + '\'' +
                ", totalVote=" + totalVote +
                '}';
    }
}
