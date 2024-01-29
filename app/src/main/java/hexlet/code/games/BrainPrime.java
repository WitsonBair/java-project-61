package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class BrainPrime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void startGame() {
        String[][] data = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];
        for (String[] round : data) {
            int question = Utilis.getRandomNumber(MIN, MAX);
            String correctAnswer = isPrimeNumber(question) ? "yes" : "no";
            round[Engine.QUESTION_INDEX_IN_ARRAY] = Integer.toString(question);
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, data);
    }

    public static boolean isPrimeNumber(int number) {
        double squareRoot = Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
