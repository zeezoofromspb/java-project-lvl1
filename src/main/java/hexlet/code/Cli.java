package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}
