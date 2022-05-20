package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class EvenGame {

    private String result;
    private String answer;
    private boolean decision;

    EvenGame(String result, String answer, boolean decision) {
        this.result = result;
        this.answer = answer;
        this.decision = decision;
    }
    public String getResult() {
        return this.result;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean getDesicion() {
        return this.decision;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public String getTaskMessage() {
        return "Answer 'yes' if number even, otherwise answer 'no'.";
    }

    public static EvenGame playEvenGame() {
        EvenGame evenGame = new EvenGame("", "", false);
        String answer = "";

        final int upperRandomRange = 99999;
        int number = Engine.generateRandomInt(upperRandomRange);

        System.out.print("Question: " + number
                + "\nYour answer: ");
        String result = number % 2 == 0 ? "yes" : "no";

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            answer = sc.nextLine();
        }

        boolean decision = result.equals(answer);

        evenGame.setResult(result);
        evenGame.answer = answer;
        evenGame.decision = decision;

        return evenGame;
    }
}
