/**
 * Created by anthonyfortney on 11/16/16.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class OOValidator {

    public int getInt(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        try {
            return input.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Error! Invalid integer value. Try again");
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max){
        int userInt = getInt(prompt);
        try {
            if (userInt < min || userInt > max){
                throw new InputMismatchException();
            }
            return userInt;
        }catch (InputMismatchException e) {
            System.out.println("Error! Value must be between " + min + " and " + max + ". Try again!");
            return  getIntWithinRange(prompt, min, max);
        }
    }

    public double getDouble(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        try{
            return input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid double value. Try again!");
            return getDouble(prompt);
        }
    }
    public double getDoubleWithinRange(String prompt, double min, double max) {
        double userDouble = getDouble(prompt);
        try{
            if (userDouble < min || userDouble > max) {
                throw new InputMismatchException();
            }
            return userDouble;
        }catch (InputMismatchException e){
            System.out.println("Error! Value is out of range. Try again!");
            return getDoubleWithinRange(prompt, min, max);
        }
    }


}
