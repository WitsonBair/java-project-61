package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class BrainGCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void startGame() {
        String[][] data = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];
        for (String[] round : data) {
            int number1 = Utilis.getRandomNumber(MIN, MAX);
            int number2 = Utilis.getRandomNumber(MIN, MAX);
            String question = number1 + " " + number2;
            String correctAnswer = calcGCD(number1, number2);
            round[Engine.QUESTION_INDEX_IN_ARRAY] = question;
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, data);
    }

    public static String calcGCD(int a, int b) {
        return String.valueOf(b == 0 ? (Math.abs(a)) : calcGCD(b, a % b));
    }
}
