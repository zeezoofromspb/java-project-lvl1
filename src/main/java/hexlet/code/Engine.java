package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Random;

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



            if (game.getDesicion()) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + game.getAnswer() + "' is wrong answer ;(. Correct answer was '" + game.getResult() + "'."
                        + "\nLet's try again, "  + playerName + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }

    }
}
