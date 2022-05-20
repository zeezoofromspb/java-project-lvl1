package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenTemp {
    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void getEven() {
        String name = Cli.getName();
        System.out.println("Answer 'yes' if number even, otherwise answer 'no'.");
        String answer = "";

        for (var i = 0; i <= 2; i++) {
            final int upperRandomRange = 99999;
            int number = generateRandomInt(upperRandomRange);

            System.out.print("Question: " + number
                    + "\nYour answer: ");
            String evenness = number % 2 == 0 ? "yes" : "no";

            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                answer = sc.nextLine();
            }

            if (evenness.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + evenness + "'."
                    + "\nLet's try again, " + name + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }

    }
}
