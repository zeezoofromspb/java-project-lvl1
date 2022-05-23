package hexlet.code;

import java.util.Scanner;


public class Cli {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getName() {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = getInput();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
