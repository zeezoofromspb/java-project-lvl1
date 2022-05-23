package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void playGame() {
        String taskMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int roundsCount = 3;
        String[] question = new String[roundsCount];
        String[] result = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            final int upperRandomRange = 33;
            int number = Engine.generateRandomInt(upperRandomRange);
            number = number == 0 ? 1 : number;

            boolean isPrime = true;
            int sqrtOfNumber = (int) Math.sqrt(number);

            if (number == 1) {
                isPrime = false;
            } else {
                int j = 2;
                while (isPrime & j <= sqrtOfNumber) {
                    isPrime = number % j != 0;
                    j++;
                }
            }

            question[i] = String.valueOf(number);
            result[i] = isPrime ? "yes" : "no";
        }
        Engine.openGame(taskMessage, question, result);
    }
}
