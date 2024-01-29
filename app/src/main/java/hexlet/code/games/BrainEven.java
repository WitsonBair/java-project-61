package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class BrainEven {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void startGame() {
        String[][] data = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];
        for (String[] round : data) {
            int question = Utilis.getRandomNumber(MIN, MAX);
            String correctAnswer = isEven(question) ? "yes" : "no";
            round[Engine.QUESTION_INDEX_IN_ARRAY] = Integer.toString(question);
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, data);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
