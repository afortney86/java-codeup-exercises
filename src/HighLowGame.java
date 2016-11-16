//Game Development 101
//
//        Welcome to the world of game development!
//
//        You are going to build a g high-low guessing game.
//
//        The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.

/**
 * Created by anthonyfortney on 11/15/16.
 */

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    public static void main(String [] args)
    {
        //Create a random number generator
        Random random = new Random();
        //Use Scanner for getting input from the user
        Scanner userInput = new Scanner(System.in);
        //Use random number generator to generate a number between 1 and 100
        int number = random.nextInt(100);
        int guess = 0;



        //Loop until the user has guessed the number
        while (guess != number) {
            System.out.print("Enter your guess: ");

            //read users guess
            guess = userInput.nextInt();

            //Check if the guess is high , low, or correct.
            if (guess > number) {
                System.out.println("LOWER!");
            }else if (guess < number) {
                System.out.println("HIGHER!");
            } else {
                System.out.println("GOOD GUESS!");
            }

//            System.out.println("Would you like to play again? Y/N: ");
//            userInput.next();


        }




    }
}

/** Ryan's Solution
 *
 * import java.util.Scanner;
 import java.util.InputMismatchException;

 public class HighLowGame {
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 String userWantsToContinue;

 do {
 playHighLowGame();
 System.out.println("Do you want to play again? y/n");
 userWantsToContinue = sc.next();
 } while (userWantsToContinue.equalsIgnoreCase("y") || userWantsToContinue.equalsIgnoreCase("yes"));

 System.out.println("Thank you for playing, yay!");
 }

 private static void playHighLowGame() {
 int random;
 int userGuess;

 random = getRandomInt();

 do {
 userGuess = getUserGuess();

 System.out.println("The game guessed " + random);

 if (random > userGuess) {
 System.out.println("HIGHER");
 } else {
 System.out.println("LOWER");
 }

 } while(random != userGuess);

 System.out.println("Good guess!");
 }

 private static int getRandomInt() {
 return (int) Math.ceil(Math.random() * 100);
 }

 private static int getUserGuess() {
 int userInput;
 Scanner sc = new Scanner(System.in);
 System.out.print("Please guess a number between 1 and 100: ");

 try {
 userInput = sc.nextInt();
 if(userInput < 1 || userInput > 100) {
 throw new InputMismatchException();
 }
 } catch (InputMismatchException e) {
 System.out.println("Guess must be an integer");
 return getUserGuess();
 }

 return userInput;
 }
 }

 */