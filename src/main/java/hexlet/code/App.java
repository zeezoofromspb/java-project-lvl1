package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        }

        switch (choice) {
            case (1):
                Cli.getName();
                break;
            default:
                break;
        }
    }
}
