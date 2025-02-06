import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        numberGuessing();
    }

    public static void numberGuessing() {
        Scanner scan = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1; //generate random number
        int trials = 0;
        int guess = 0;
        int guessCount = 0;
        String diffString = "";


        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");

        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances) \n2. Medium (5 chances) \n3. Hard (3 chances)");
        System.out.print("Enter your choice: ");
        int difficulty = scan.nextInt();

        while (true) {
            if (difficulty == 1) {
                trials = 10;
                diffString = "Easy";
            } else if (difficulty == 2) {
                trials = 5;
                diffString = "Medium";
            } else if (difficulty == 3) {
                trials = 3;
                diffString = "Hard";
            } else {
                System.out.println("\nYou choose the wrong difficulties. Please re-select.");
            }

            System.out.println("\nGreat! You have selected the " + diffString + " difficulties.");
            System.out.println("\nLet's start the game!");

            while(true) {
                System.out.println("\nEnter your guess: ");
                guess = scan.nextInt();
                guessCount++;

                if (guess == randomNumber) {
                    System.out.println("\nCongratulations! You guessed the correct number in " + guessCount + " attempts.");
                    break;
                } 
                
                if (guess < randomNumber) {
                    System.out.println("\nIncorrect! The number is greater than " + guess);
                    System.out.println("You have " + (trials - 1) + " attempted left.");
                    trials--;
                } else if (guess > randomNumber) {
                    System.out.println("\nIncorrect! The number is less than " + guess);
                    System.out.println("You have " + (trials - 1) + " attempted left.");
                    trials--;
                }

                if (guessCount == 5) {
                    System.out.println("\nYou Lose!! \nYou have reached your maximum trials.");
                    System.out.println("\nThe number was: " + randomNumber);
                    break;
                }
            }
            scan.close();

        }
    }
}