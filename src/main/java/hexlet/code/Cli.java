package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        System.out.print("\nWelcome to the Brain Games!"
                + "\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = "";
        if (sc.hasNextLine()) {
            name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        }
        return name;
    }
}
