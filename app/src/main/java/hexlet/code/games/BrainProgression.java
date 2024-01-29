package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class BrainProgression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int MIN_PROGRESSION_LENGTH = 10;
    public static final int MAX_PROGRESSION_LENGTH = 20;
    public static final int MIN_STEP = 1;
    public static final int MAX_STEP = 10;

    public static void startGame() {
        String[][] data = new String[Engine.NUMBER_OF_ROUNDS_IN_GAME][Engine.NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY];
        for (String[] round : data) {
            int progressionLength = Utilis.getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int index = Utilis.getRandomNumber(MIN, progressionLength);
            int progressionStartNumber = Utilis.getRandomNumber(MIN, MAX);
            int step = Utilis.getRandomNumber(MIN_STEP, MAX_STEP);
            String[] progressionArray = makeProgressionArray(progressionLength, progressionStartNumber, step);
            String correctAnswer = String.valueOf(progressionArray[index]);
            progressionArray[index] = "..";
            String question = String.join(" ", progressionArray);
            round[Engine.QUESTION_INDEX_IN_ARRAY] = question;
            round[Engine.CORRECT_ANSWER_INDEX_IN_ARRAY] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, data);
    }

    public static String[] makeProgressionArray(int progressionLength, int progressionStartNumber, int step) {
        String[] progressionArray = new String[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progressionArray[i] = String.valueOf(progressionStartNumber + i * step);
        }
        return progressionArray;
    }
}
