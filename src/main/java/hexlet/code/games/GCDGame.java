package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    static final String TASK_MESSAGE = "Find the greatest common divisor of given numbers.";
    static final int UPPER_RANDOM_RANGE = 33;
    static final int GAME_CONTENT_VARIABLES_COUNT = 2; //0 - Questions, 1 - RightAnswers
    public static void playGame() {
        final int roundsCount = Engine.getRoundsCount();
        String[][] gameContent = new String[GAME_CONTENT_VARIABLES_COUNT][roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            int randomNumber1 = Utils.generateRandomInt(UPPER_RANDOM_RANGE);
            int randomNumber2 = Utils.generateRandomInt(UPPER_RANDOM_RANGE);
            randomNumber1 = randomNumber1 == 0 ? 1 : randomNumber1;
            randomNumber2 = randomNumber2 == 0 ? 1 : randomNumber2;

            gameContent[0][i] = randomNumber1 + " " + randomNumber2;
            gameContent[1][i] = Integer.toString(gcd(randomNumber1, randomNumber2));
        }
        Engine.openGame(TASK_MESSAGE, gameContent);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
