import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[]args){


                Scanner sc = new Scanner(System.in);
                Random random = new Random();
                int score = 0;
                boolean playAgain = true;

                while (playAgain) {
                    int generatedNumber = random.nextInt(100) + 1;
                    int attempts = 0;
                    boolean guessedCorrectly = false;

                    System.out.println("\nWelcome to the Guessing Game!");

                    // guessing loop
                    while (!guessedCorrectly) {
                        System.out.print("-->Enter your guess (between 1 and 100) : ");
                        int userGuess = sc.nextInt();
                        attempts++;

                        if (userGuess < generatedNumber) {
                            System.out.println("Your guess is too low.");
                        } else if (userGuess > generatedNumber) {
                            System.out.println("Your guess is too high.");
                        } else {
                            System.out.println("\n## Congratulations! You guessed the correct number!");
                            System.out.println("The generated number was " + generatedNumber);
                            System.out.println("It took you " + attempts + " attempts.");
                            score += 100 - attempts;  
                            guessedCorrectly = true;
                        }
                    }

                  // Asking user if it wants to play again
                    System.out.print("Would you like to play again? (yes/no): ");
                    String playAgainInput = sc.next();
                    if (playAgainInput.equalsIgnoreCase("no")) {
                        playAgain = false;
                    }
                }

                // Final score display
                System.out.println("Thanks for playing! Your total score is: " + score);
                sc.close();
            }
        }



