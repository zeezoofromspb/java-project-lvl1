package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {

    private String question;
    private String result;

    EvenGame(String question, String result) {
        this.question = question;
        this.result = result;
    }
    public String getResult() {
        return this.result;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getTaskMessage() {
        return "Answer 'yes' if number even, otherwise answer 'no'.";
    }

    public static EvenGame playEvenGame() {

        final int upperRandomRange = 99999;
        int number = Engine.generateRandomInt(upperRandomRange);

        String result = number % 2 == 0 ? "yes" : "no";
        String question = String.valueOf(number);

        return new EvenGame(question, result);
    }
}
