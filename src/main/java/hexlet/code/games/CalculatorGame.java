package hexlet.code.games;

import hexlet.code.GameType;
import hexlet.code.Engine;

public class CalculatorGame implements GameType {
    private String question;
    private String result;

    public CalculatorGame(String pQuestion, String pResult) {
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

    public CalculatorGame playGame() {

        final int upperRandomRange = 100;
        int number1 = Engine.generateRandomInt(upperRandomRange);
        int number2 = Engine.generateRandomInt(upperRandomRange);

        final int upperMathOperatorIndexRange = 3;
        String[] mathOperators = {"+", "-", "*"};
        int mathOperatorIndex = Engine.generateRandomInt(upperMathOperatorIndexRange);
        var randomMathOperator = mathOperators[mathOperatorIndex];
        String pQuestion = number1 + " " + randomMathOperator + " " + number2;

        int pResult = 0;
        switch (randomMathOperator) {
            case "+":
                pResult = number1 + number2;
                break;
            case "-" :
                pResult = number1 - number2;
                break;
            case "*" :
                pResult = number1 * number2;
                break;
            default:
                break;
        }

        return new CalculatorGame(pQuestion, Integer.toString(pResult));
    }
}
