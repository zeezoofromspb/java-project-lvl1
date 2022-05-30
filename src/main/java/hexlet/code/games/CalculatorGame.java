package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalculatorGame {
    static final String TASK_MESSAGE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int UPPER_RANDOM_RANGE = 100;
    static final int GAME_CONTENT_VARIABLES_COUNT = 2; //0 - Questions, 1 - RightAnswers
    static final String[] MATH_OPERATORS = new String[]{"+", "-", "*"};

    public static void playGame() {

        String[][] gameContent = new String[GAME_CONTENT_VARIABLES_COUNT][Engine.ROUNDS_COUNT];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int randomNumber1 = Utils.generateRandomInt(UPPER_RANDOM_RANGE);
            int randomNumber2 = Utils.generateRandomInt(UPPER_RANDOM_RANGE);

            final int mathOperatorIndexUpperRange = 3;
            int mathOperatorIndex = Utils.generateRandomInt(mathOperatorIndexUpperRange);
            var randomMathOperator = MATH_OPERATORS[mathOperatorIndex];

            gameContent[0][i] = randomNumber1 + " " + randomMathOperator + " " + randomNumber2;

            gameContent[1][i] = switch (randomMathOperator) {
                case "+" -> Integer.toString(randomNumber1 + randomNumber2);
                case "-" -> Integer.toString(randomNumber1 - randomNumber2);
                case "*" -> Integer.toString(randomNumber1 * randomNumber2);
                default -> throw new IllegalArgumentException("Error: invalid math operator. How did you made it?");
            };
        }
        Engine.openGame(TASK_MESSAGE, gameContent);
    }
}
