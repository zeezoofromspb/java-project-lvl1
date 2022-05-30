package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");

        Scanner sc = new Scanner(System.in);
        String playerName =  sc.nextLine();

        System.out.println("Hello, " + playerName + "!");
    }
}
