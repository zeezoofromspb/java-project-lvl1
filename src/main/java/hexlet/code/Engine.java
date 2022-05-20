package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void playGame() {
        String playerName = Cli.getName();

        for (var i = 0; i <= 2; i++) {

            var game = EvenGame.playEvenGame();

            if (i == 0) {
                System.out.println(game.getTaskMessage());
            }

            System.out.print("Question: " + game.getQuestion()
                    + "\nYour answer: ");

            String answer = "";
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                answer = sc.nextLine();
            }

            boolean decision = game.getResult().equals(answer);

            if (decision) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + game.getResult() + "'."
                        + "\nLet's try again, "  + playerName + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
}
