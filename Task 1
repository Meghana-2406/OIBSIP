import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int rounds;

        System.out.print("Enter number of rounds you want to play: ");
        rounds = sc.nextInt();

        for (int r = 1; r <= rounds; r++) {

            int number = rand.nextInt(100) + 1; // random number between 1–100
            int attempts = 0;
            int maxAttempts = 7; 

            System.out.println("\n--- Round " + r + " ---");
            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");

                    int points = (maxAttempts - attempts + 1) * 10; 
                    totalScore += points;

                    System.out.println("You earned " + points + " points.");
                    break;

                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                if (attempts == maxAttempts) {
                    System.out.println(" Out of attempts! The correct number was: " + number);
                }
            }
        }

        System.out.println("\n========================");
        System.out.println("GAME OVER");
        System.out.println("Total Score: " + totalScore);
        System.out.println("========================");

        sc.close();
    }
}
