package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class BrainCalc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static final int MIN = 0;
    public static final int MAX = 50;
    public static final String[] OPERATORS = {" + ", " - ", " * "};

    public static void startGame() {
        String[][] data = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];
        for (String[] round : data) {
            int number1 = Utilis.getRandomNumber(MIN, MAX);
            int number2 = Utilis.getRandomNumber(MIN, MAX);
            int index = Utilis.getRandomNumber(MIN, OPERATORS.length);

            String sign = OPERATORS[index];
            String question = number1 + sign + number2;
            String correctAnswer = makeCalc(number1, number2, sign);

            round[Engine.QUESTION_INDEX_IN_ARRAY] = question;
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, data);
    }

    public static String makeCalc(int number1, int number2, String sign) {
        switch (sign.trim()) {
            case "+":
                return String.valueOf(number1 + number2);

            case "-":
                return String.valueOf(number1 - number2);

            case "*":
                return String.valueOf(number1 * number2);

            default:
                return null;
        }
    }

}
