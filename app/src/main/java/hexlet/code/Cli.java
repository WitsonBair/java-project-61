package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void helloUser() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            String user = input.next();
            System.out.println("Hello, " + user + "!");
        } finally {
            input.close();
        }
    }
}
