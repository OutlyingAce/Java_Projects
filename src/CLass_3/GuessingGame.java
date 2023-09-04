package CLass_3;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int Number = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        boolean GuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a random number from 1 to 100..");

        while (!GuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < Number) {
                System.out.println("Try a higher number.");
            } else if (guess > Number) {
                System.out.println("Try a lower number.");
            } else {
                GuessedCorrectly = true;
                System.out.println("Congratulations! You have guessed the number.");
            }
        }

        scanner.close();
    }
}