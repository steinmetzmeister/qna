package com.dnk.qna;

import com.dnk.qna.Question;

public class PrimaryColors extends Question {
    class Color {
        public String name;
        public int r,g,b;

        public Color(String name, int r, int g, int b) {
            this.name = name;
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    Color[] colors = {
        new Color("red", 255, 0, 0),
        new Color("green", 0, 255, 0),
        new Color("blue", 0, 0, 255)
    };

    int c;

    public PrimaryColors() {
        c = Rand.randInt(0, colors.length - 1);

        text = "What color is " +
            colors[c].r + "," +
            colors[c].g + "," +
            colors[c].b + "?";

        answer = new Answer(colors[c].name);
    }

    public int[] getRGB() {
        int[] rgb = { colors[c].r, colors[c].g, colors[c].b };
        return rgb;
    }
}