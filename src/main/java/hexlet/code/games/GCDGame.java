package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    public static void playGame() {
        String taskMessage = "Find the greatest common divisor of given numbers.";
        final int roundsCount = 3;
        String[] question = new String[roundsCount];
        String[] result = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            final int upperRandomRange = 100;
            int number1 = Engine.generateRandomInt(upperRandomRange);
            int number2 = Engine.generateRandomInt(upperRandomRange);
            number1 = number1 == 0 ? 1 : number1;
            number2 = number2 == 0 ? 1 : number2;

            question[i] = number1 + " " + number2;
            result[i] = Integer.toString(gcd(number1, number2));
        }
        Engine.openGame(taskMessage, question, result);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
