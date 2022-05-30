package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }
    public static int generateRandomNoZeroInt(int upperRange) {
        int randomNumber = generateRandomInt(upperRange);
        return randomNumber == 0 ? 1 : randomNumber;
    }
}
