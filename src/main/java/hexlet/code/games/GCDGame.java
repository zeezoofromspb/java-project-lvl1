package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    static final String TASK_MESSAGE = "Find the greatest common divisor of given numbers.";
    static final int UPPER_RANDOM_RANGE = 33;
    static final int GAME_CONTENT_VARIABLES_COUNT = 2; //0 - Questions, 1 - RightAnswers
    public static void playGame() {
        String[][] gameContent = new String[GAME_CONTENT_VARIABLES_COUNT][Engine.ROUNDS_COUNT];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNumber1 = Utils.generateRandomNoZeroInt(UPPER_RANDOM_RANGE);
            int randomNumber2 = Utils.generateRandomNoZeroInt(UPPER_RANDOM_RANGE);

            gameContent[0][i] = randomNumber1 + " " + randomNumber2;
            gameContent[1][i] = Integer.toString(gcd(randomNumber1, randomNumber2));
        }
        Engine.openGame(TASK_MESSAGE, gameContent);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
