package com.dnk.qna;

public class Answer {
    public String value;

    public Answer(String value) {
        this.value = value;
    }

    public boolean equals(Answer answer) {
        if (answer.value.equals(value))
            return true;

        return false;
    }
}