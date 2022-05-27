package hexlet.code;

public class Engine {
    private static final int ROUNDSCOUNT = 3;

    public static int getRoundsCount() {
        return ROUNDSCOUNT;
    }
    public static void openGame(String taskMessage, String[][] gameContent) {
        String playerName = Utils.getName();
        System.out.println(taskMessage);
        for (var i = 0; i < ROUNDSCOUNT; i++) {
            System.out.print("Question: " + gameContent[0][i]
                    + "\nYour answer: ");

            String answer = Utils.getInput();

            boolean isCorrectAnswer = gameContent[1][i].equals(answer);

            if (isCorrectAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'" + answer + "' is wrong answer ;(. Correct answer was '" + gameContent[1][i] + "'."
                        + "\nLet's try again, "  + playerName + "!");
                break;
            }

            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
