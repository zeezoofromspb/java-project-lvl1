package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void playGame() {
        String taskMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int roundsCount = 3;
        String[] question = new String[roundsCount];
        String[] result = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            final int upperRandomRange = 300;
            int number = Engine.generateRandomInt(upperRandomRange);
            number = number == 0 ? 1 : number;

            boolean isPrime = true;

            for (var j = 2; j <= (number == 2 ? number : number / 2); j++) {
                //it is enough to check only first half of all possible numbers
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            question[i] = String.valueOf(number);
            result[i] = isPrime ? "yes" : "no";
        }
        Engine.openGame(taskMessage, question, result);
    }
}
