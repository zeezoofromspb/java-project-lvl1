package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void playGame() {
        String taskMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int roundsCount = 3;
        String[] question = new String[roundsCount];
        String[] result = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            final int upperRandomRange = 100;
            int number = Engine.generateRandomInt(upperRandomRange);

            question[i] = String.valueOf(number);
            result[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.openGame(taskMessage, question, result);
    }
}
