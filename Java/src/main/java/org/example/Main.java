package org.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StackOverflow stackOverflow = StackOverflow.getInstance();
        User user1 = new User("userId1","ram","ram@gmail.com");
        User user2 = new User("userId2","hari","hari@gmail.com");
        Question question1 = new Question("questionId1","java","what is java",
                new Date(),0,QuestionTag.JAVA, user1.getUserId());
        Question question2 = new Question("questionId2","python","what is python",
                new Date(),0,QuestionTag.PYTHON, user2.getUserId());
        Answer answer1 = new Answer("answerId1","my answer",new Date(), user1.getUserId(), 0);
        Comment comment1 = new Comment("commentId1","myComment",new Date(), user2.getUserId());
        stackOverflow.postQuestion(question1);
        stackOverflow.postQuestion(question2);
        stackOverflow.answerQuestion(question1.getQuestionId(),answer1);
        stackOverflow.commentAnswer(answer1.getAnswerId(),comment1);
        stackOverflow.userVoteOnQuestion(question1.getQuestionId());
        stackOverflow.userVoteOnQuestion(question1.getQuestionId());
        stackOverflow.userVoteOnAnswer(answer1.getAnswerId() , question1.getQuestionId());
        List<Question> questions = stackOverflow.searchQuesionBasedOnTag(QuestionTag.JAVA);
        for(Question question : questions){
            System.out.println(question);
        }




    }
}