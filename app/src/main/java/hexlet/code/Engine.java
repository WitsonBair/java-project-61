package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTION_INDEX_IN_ARRAY = 0;
    public static final int CORRECT_ANSWER_INDEX_IN_ARRAY = 1;
    public static final int NUMBER_OF_ROUNDS_IN_GAME = 3;
    public static final int NUMBER_OF_ELEMENTS_FOR_GAME_ARRAY = 2;

    public static void runGame(String description, String[][] gameData) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String userName = input.nextLine();
            System.out.println("Hello, " + userName + "!");
            System.out.println(description);

            for (int i = 0; i < NUMBER_OF_ROUNDS_IN_GAME; i++) {
                String correctAnswer = gameData[i][CORRECT_ANSWER_INDEX_IN_ARRAY];
                System.out.println("Question: " + gameData[i][QUESTION_INDEX_IN_ARRAY]);
                System.out.print("Your answer: ");
                String userAnswer = input.nextLine();
                if (!userAnswer.equals(correctAnswer)) {
                    System.out.println("'" + userAnswer
                            + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
                System.out.println("Correct!");
            }
            System.out.println("Congratulations, " + userName + "!");
        } finally {
            input.close();
        }
    }
}
