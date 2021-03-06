package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        Scanner sc = new Scanner(System.in);
        String choice =  sc.nextLine();

        switch (choice) {
            case "1" -> Cli.getName();
            case "2" -> EvenGame.playGame();
            case "3" -> CalculatorGame.playGame();
            case "4" -> GCDGame.playGame();
            case "5" -> ProgressionGame.playGame();
            case "6" -> PrimeGame.playGame();
            case "0" -> System.exit(0);
            default -> throw new IllegalArgumentException("Unknown choice state: " + choice + "!");
        }
    }
}
