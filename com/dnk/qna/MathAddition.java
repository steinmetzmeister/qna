package com.dnk.qna;

import com.dnk.qna.Question;

public class MathAddition extends Question {
    public MathAddition(int low, int high) {
        int randInt = Rand.randInt(low, high);

        int first = randInt - Rand.randInt(low, randInt);
        int second = randInt - first;

        text = "" + first + " + " + second + " = ";
        answer = new Answer(String.valueOf(randInt));
    }
}