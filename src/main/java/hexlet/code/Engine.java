package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void openGame(String taskMessage, String[] question, String[] result) {
        String playerName = Cli.getName();
        System.out.println(taskMessage);
        final int roundsCount = question.length;
        for (var i = 0; i < roundsCount; i++) {
            System.out.print("Question: " + question[i]
                    + "\nYour answer: ");

            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            boolean isCorrectAnswer = result[i].equals(answer);

            if (isCorrectAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result[i] + "'."
                        + "\nLet's try again, "  + playerName + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
}
