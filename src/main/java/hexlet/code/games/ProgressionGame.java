package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    static final String TASK_MESSAGE = "What number is missing in the progression?";
    static final int UPPER_RANDOM_RANGE = 33;
    static final int GAME_CONTENT_VARIABLES_COUNT = 2; //0 - Questions, 1 - RightAnswers
    public static void playGame() {
        final int roundsCount = Engine.getRoundsCount();
        String[][] gameContent = new String[GAME_CONTENT_VARIABLES_COUNT][roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            int progressionStart = Utils.generateRandomInt(UPPER_RANDOM_RANGE);
            int progressionStep = Utils.generateRandomNoZeroInt(UPPER_RANDOM_RANGE);

            final int progressionLength = 10;
            String[] progression = generateProgression(progressionLength, progressionStart, progressionStep);

            int hiddenNumberIndex = Utils.generateRandomInt(progressionLength);
            String hiddenNumber = progression[hiddenNumberIndex];
            progression[hiddenNumberIndex] = "..";

            gameContent[0][i] = String.join(" ", progression);
            gameContent[1][i] = hiddenNumber;
        }

        Engine.openGame(TASK_MESSAGE, gameContent);
    }
    public static String[] generateProgression(int progressionLength, int progressionStart, int progressionStep) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(progressionStart + i * progressionStep);
        }
        return progression;
    }
}
