package hexlet.code.games;

import hexlet.code.GameType;
import hexlet.code.Engine;

public class ProgressionGame implements GameType {
    private String question;
    private String result;

    public ProgressionGame(String pQuestion, String pResult) {
        this.question = pQuestion;
        this.result = pResult;
    }

    public String getResult() {
        return result;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getTaskMessage() {
        return "What is the result of the expression?";
    }

    public ProgressionGame playGame() {

        final int upperRandomRange = 20;
        int number1 = Engine.generateRandomInt(upperRandomRange);
        int number2 = Engine.generateRandomInt(upperRandomRange);
        number2 = number2 == 0 ? 1 : number2;

        final int progressionLength = 10;
        String[] progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(number1 + i * number2);
        }

        int hiddenNumberIndex = Engine.generateRandomInt(progressionLength);
        String hiddenNumber = progression[hiddenNumberIndex];
        progression[hiddenNumberIndex] = "..";

        String pQuestion = String.join(" ", progression);
        String pResult = hiddenNumber;

        return new ProgressionGame(pQuestion, pResult);
    }
}
