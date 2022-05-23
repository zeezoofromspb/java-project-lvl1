package hexlet.code.games;

import hexlet.code.Engine;

public class CalculatorGame {
    public static void playGame() {
        String taskMessage = "What is the result of the expression?";
        final int roundsCount = 3;
        String[] question = new String[roundsCount];
        String[] result = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            final int upperRandomRange = 33;
            int number1 = Engine.generateRandomInt(upperRandomRange);
            int number2 = Engine.generateRandomInt(upperRandomRange);

            final int upperMathOperatorIndexRange = 3;
            String[] mathOperators = {"+", "-", "*"};
            int mathOperatorIndex = Engine.generateRandomInt(upperMathOperatorIndexRange);
            var randomMathOperator = mathOperators[mathOperatorIndex];
            question[i] = number1 + " " + randomMathOperator + " " + number2;

            result[i] = switch (randomMathOperator) {
                case "+" -> Integer.toString(number1 + number2);
                case "-" -> Integer.toString(number1 - number2);
                case "*" -> Integer.toString(number1 * number2);
                default -> "";
            };
        }
        Engine.openGame(taskMessage, question, result);
    }
}
