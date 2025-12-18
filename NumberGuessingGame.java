import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1. Computer picks random number 1-10
        int numberToGuess = random.nextInt(10) + 1;
        int attempts = 3;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 10.");
        System.out.println("You have 3 attempts to guess it.");

        boolean won = false;

        // 2. User gets 3 tries
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();

            // 3. Tell if too high or too low
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed it right.");
                won = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        // 4. Show result
        if (!won) {
            System.out.println("Sorry, you lost. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}