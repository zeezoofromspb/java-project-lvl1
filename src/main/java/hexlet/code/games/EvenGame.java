package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    static final String TASK_MESSAGE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int UPPER_RANDOM_RANGE = 100;
    static final int GAME_CONTENT_VARIABLES_COUNT = 2; //0 - Questions, 1 - RightAnswers
    public static void playGame() {
        String[][] gameContent = new String[Engine.ROUNDS_COUNT][GAME_CONTENT_VARIABLES_COUNT];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomNumber = Utils.generateRandomInt(UPPER_RANDOM_RANGE);

            gameContent[i][0] = String.valueOf(randomNumber);
            gameContent[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        Engine.openGame(TASK_MESSAGE, gameContent);
    }
}
