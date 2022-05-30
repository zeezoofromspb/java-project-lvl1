package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void openGame(String taskMessage, String[][] gameContent) {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");

        Scanner sc = new Scanner(System.in);
        String playerName =  sc.nextLine();

        System.out.println("Hello, " + playerName + "!");
        System.out.println(taskMessage);

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            System.out.print("Question: " + gameContent[0][i]
                    + "\nYour answer: ");

            sc = new Scanner(System.in);
            String answer =  sc.nextLine();

            boolean isCorrectAnswer = gameContent[1][i].equals(answer);

            if (isCorrectAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'" + answer + "' is wrong answer ;(. Correct answer was '" + gameContent[1][i] + "'."
                        + "\nLet's try again, "  + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
