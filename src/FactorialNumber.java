/**
 * Created by anthonyfortney on 11/14/16.
 */

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        String userInput = "n";

        System.out.println("Welcome to the factorial calculator!");

        Scanner input = new Scanner(System.in);
        do {
            //Gives prompt
            System.out.print("Enter a number bewteen 1 and 25 ");

            //Enter the times you want to run
            int number = input.nextInt();

            //Declares new int
            long factor = 1;

            //Runs loop and multiplies factor each time run
            for (int i = 1; i <= number; i++) {
                factor = factor * i;
            }

            //Prints out final number
            System.out.println(factor);

            //Prompts for another number
            System.out.println("Would you like to enter another number?");
            userInput = input.next();
        }while (userInput.equals("y"));
    }

}
