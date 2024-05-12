import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        /*
         * Steps to follow :
         * Intro messages
         * Number of game trials
         * User input of a number
         */

        // Intro messages
        System.out.println(
                "Welcome to the Number Guessing Game! I'm thinking of a number between 0 and 100. Try to guess it in as few attempts as possible!");

        // Number of trials of game
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Please enter number of game trials you want to play (Number entered should be less than 5): ");
        // Checking whether number of trials of game is less than 5 or not
        int trials = sc.nextInt();
        if (!(trials < 5)) {
            System.out.println("Number of game trials to be played by the user is invalid. Sorry, you can't play !!!");
        } else {
            // Starting the number guessing game

            Random random = new Random();
            int ran = random.nextInt(101); // inclusive of 0 and 100 both
            System.out.println("Random  Number : " + ran);
            for (int i = 0; i < trials; i++) {

                System.out.println("Guess the number about which I'm thinking");
                System.out.println("Enter you guessed number : ");
                int guess = sc.nextInt();

                // Checking the conditions of the game and providing results
                if (guess > ran) {
                    System.out.println("OOPS!!!, This is a higher guess");

                } else if (guess < ran) {
                    System.out.println("OOPS!!!, This is a lower guess");
                } else {
                    System.out.println("Bravo!!!, You got it");
                    System.out.println("Game Over !");
                    break;
                }

                if (i < trials) {
                    System.out.println("You've " + (trials - i - 1) + " attempts left");
                }

                if (i == trials - 1) {
                    System.out.println("Game Over");
                }
            }
        }
        sc.close();
    }
}
