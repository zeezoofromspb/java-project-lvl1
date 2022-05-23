package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    public static void playGame() {
        String taskMessage = "What number is missing in the progression?";
        final int roundsCount = 3;
        String[] question = new String[roundsCount];
        String[] result = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            final int upperRandomRange = 20;
            int progressionBase = Engine.generateRandomInt(upperRandomRange);
            int progressionAdd = Engine.generateRandomInt(upperRandomRange);
            progressionAdd = progressionAdd == 0 ? 1 : progressionAdd;

            final int progressionLength = 10;
            String[] progression = new String[progressionLength];

            for (var j = 0; j < progressionLength; j++) {
                progression[j] = Integer.toString(progressionBase + j * progressionAdd);
            }

            int hiddenNumberIndex = Engine.generateRandomInt(progressionLength);
            String hiddenNumber = progression[hiddenNumberIndex];
            progression[hiddenNumberIndex] = "..";

            question[i] = String.join(" ", progression);
            result[i] = hiddenNumber;
        }

        Engine.openGame(taskMessage, question, result);
    }
}
