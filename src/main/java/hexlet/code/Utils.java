package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String getName() {
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = Utils.getInput();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }
    public static int generateRandomNoZeroInt(int upperRange) {
        int randomNumber = generateRandomInt(upperRange);
        return randomNumber == 0 ? 1 : randomNumber;
    }
}
