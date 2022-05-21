package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        if (sc.hasNextLine()) {
            choice = sc.nextLine();
        }

        switch (choice) {
            case "1":
                Cli.getName();
                break;
            case "2":
                Engine.openGame(new EvenGame("", ""));
                break;
            case "3":
                Engine.openGame(new CalculatorGame("", ""));
                break;
            case "4":
                Engine.openGame(new GCDGame("", ""));
                break;
            default:
                break;
        }
    }
}
