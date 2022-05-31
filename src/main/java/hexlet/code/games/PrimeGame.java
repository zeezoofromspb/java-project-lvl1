package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    static final String TASK_MESSAGE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int UPPER_RANDOM_RANGE = 33;
    static final int GAME_CONTENT_VARIABLES_COUNT = 2; //0 - Questions, 1 - RightAnswers
    public static void playGame() {
        String[][] gameContent = new String[GAME_CONTENT_VARIABLES_COUNT][Engine.ROUNDS_COUNT];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNumber = Utils.generateRandomInt(UPPER_RANDOM_RANGE);

            gameContent[0][i] = String.valueOf(randomNumber);
            gameContent[1][i] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.openGame(TASK_MESSAGE, gameContent);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int sqrtOfNumber = (int) Math.sqrt(number);
        for (var i = 2; i <= sqrtOfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
