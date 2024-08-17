package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverflow {
    private static StackOverflow instance;
//    private Map<String, List<String>>userToquestion;
    private Map<String,Question>questionBank; // question id to Question
    private Map<String, List<Answer>>answerMap; // questionId to answer
    private Map<String , List<Comment>>commentMap; //answer id to comment


    public static StackOverflow getInstance(){
        if(instance == null){
            instance = new StackOverflow();
        }
        return instance;
    }
    public StackOverflow(){
        questionBank = new ConcurrentHashMap<>();
        answerMap = new ConcurrentHashMap<>();
        commentMap = new ConcurrentHashMap<>();
    }

    public void postQuestion(Question question){
        synchronized (this){
            questionBank.put(question.getQuestionId(), question);
            System.out.println("question successfully post");
        }
    }
    public void answerQuestion(String questionId, Answer answer){
        synchronized (this){
            List<Answer> answerList;
            if( answerMap.get(questionId)== null || answerMap.get(questionId).size() == 0){
                answerList = new ArrayList<>();
            }
            else {
                answerList = answerMap.get(questionId);
            }

            answerList.add(answer);
            answerMap.put(questionId,answerList);
            System.out.println("answer post SuccessFull");
        }

    }

    public void commentAnswer(String answerId, Comment comment){
        synchronized (this){
            List<Comment> commentList ;
            if(commentMap.get(answerId) == null ||commentMap.get(answerId).size() == 0){
                commentList = new ArrayList<>();
            }
            else {
                commentList = commentMap.get(answerId);
            }
            commentList.add(comment);
            commentMap.put(answerId, commentList);
            System.out.println("comment on Answer");
        }
    }

    public void userVoteOnQuestion(String questionId){
        synchronized (this){
            if(questionBank.get(questionId) == null){
                System.out.println("Question not found");
                return;
            }
            Question question = questionBank.get(questionId);
            question.setTotalVote(question.getTotalVote() + 1);
            questionBank.put(questionId, question);
        }
    }

    public void userVoteOnAnswer(String answerId,String questionId){
        synchronized (this){
            if(answerMap.get(questionId).size() ==0){
                System.out.println("there is no answer for this question");
            }
            List<Answer> answerList = answerMap.get(questionId);
            for(Answer answer :answerList){
                if(answer.getAnswerId().equals(answerId)){
                    answer.setTotalVote(answer.getTotalVote() + 1);
                    break;
                }
            }
            answerMap.put(questionId, answerList);
        }
    }

    public List<Question> searchQuesionBasedOnTag(QuestionTag questionTag){
        synchronized (this){
            List<Question>questionList = new ArrayList<>();
            for (Map.Entry<String, Question>qu : questionBank.entrySet())
            {
                Question questions = questionBank.get(qu.getKey());
                if(questions.getQuestionTag().equals(questionTag)){
                    questionList.add(questions);
                }
            }
            return questionList;
        }
    }

}
