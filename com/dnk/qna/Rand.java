package com.dnk.qna;

import java.util.Random;

public class Rand {
    static Random rand = new Random();

    public static int randInt(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }
}