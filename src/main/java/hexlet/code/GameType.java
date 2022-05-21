package hexlet.code;

public interface GameType {
    String getTaskMessage();
    String getQuestion();
    String getResult();
    GameType playGame();
}
