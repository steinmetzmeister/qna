package com.dnk.qna;

public class Question {
    public String text = "";
    public Answer answer = null;

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public boolean solve(Answer answer) {
        if (this.answer.equals(answer))
            return true;
        
        return false;
    }
}