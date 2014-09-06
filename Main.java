import java.util.Scanner;

import com.dnk.qna.Question;
import com.dnk.qna.Answer;
import com.dnk.qna.MathAddition;
import com.dnk.qna.PrimaryColors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String v = "notq";
        while (v != "q") {
            Question q = (Question)new PrimaryColors();
            System.out.println(q.text);

            v = in.nextLine();

            if (q.solve(new Answer(v)))
                System.out.println("Correct!");
            else
                System.out.println("Wrong!");
        }
    }
}