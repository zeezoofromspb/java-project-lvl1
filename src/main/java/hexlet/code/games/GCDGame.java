package hexlet.code.games;

import hexlet.code.GameType;
import hexlet.code.Engine;

public class GCDGame implements GameType {
    private String question;
    private String result;

    public GCDGame(String pQuestion, String pResult) {
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
        return "Find the greatest common divisor of given numbers.";
    }


    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

    public GCDGame playGame() {

        final int upperRandomRange = 100;
        int number1 = Engine.generateRandomInt(upperRandomRange);
        int number2 = Engine.generateRandomInt(upperRandomRange);
        number1 = number1 == 0 ? 1 : number1;
        number2 = number2 == 0 ? 1 : number2;

        String pQuestion = number1 + " " + number2;
        var pResult = gcd(number1, number2);

        return new GCDGame(pQuestion, Integer.toString(pResult));
    }
}
