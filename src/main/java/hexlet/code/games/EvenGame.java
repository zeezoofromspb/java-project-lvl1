package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameType;

public class EvenGame implements GameType {
    private String question;
    private String result;

    public EvenGame(String pQuestion, String pResult) {
        this.question = pQuestion;
        this.result = pResult;
    }

    public String getResult() {
        return result;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getTaskMessage() {
        return "Answer 'yes' if number even, otherwise answer 'no'.";
    }

    public EvenGame playGame() {

        final int upperRandomRange = 99999;
        int number = Engine.generateRandomInt(upperRandomRange);

        String pQuestion = String.valueOf(number);
        String pResult = number % 2 == 0 ? "yes" : "no";


        return new EvenGame(pQuestion, pResult);
    }
}
