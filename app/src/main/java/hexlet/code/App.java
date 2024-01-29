package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.BrainEven;
import hexlet.code.games.BrainGCD;
import hexlet.code.games.BrainCalc;
import hexlet.code.games.BrainProgression;
import hexlet.code.games.BrainPrime;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet\n"
                            + "2 - Even\n"
                            + "3 - Calc\n"
                            + "4 - GCD\n"
                            + "5 - Progression\n"
                            + "6 - Prime\n"
                            + "0 - Exit");
            System.out.print("Your choice: ");
            String choice = input.nextLine();
            System.out.println();

            switch (choice) {
                case "0":
                    System.out.println("Exit");
                    break;

                case "1":
                    Cli.helloUser();
                    break;

                case "2":
                    BrainEven.startGame();
                    break;

                case "3":
                    BrainCalc.startGame();
                    break;

                case "4":
                    BrainGCD.startGame();
                    break;

                case "5":
                    BrainProgression.startGame();
                    break;

                case "6":
                    BrainPrime.startGame();
                    break;

                default:
                    System.out.println("Wrong choice, buddy!");
                    break;
            }
        } finally {
            input.close();
        }
    }
}
