package hexlet.code.games;

import hexlet.code.GameType;
import hexlet.code.Engine;

public class PrimeGame implements GameType {
    private String question;
    private String result;

    public PrimeGame(String pQuestion, String pResult) {
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
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public PrimeGame playGame() {

        final int upperRandomRange = 300;

        int number = Engine.generateRandomInt(upperRandomRange);
        number = number == 0 ? 1 : number;
        boolean isPrime = true;

        for (var i = 2; i <= (number == 2 ? number : number / 2); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        String pQuestion = String.valueOf(number);
        String pResult = isPrime ? "yes" : "no";

        return new PrimeGame(pQuestion, pResult);
    }
}
