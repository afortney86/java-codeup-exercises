package validation;

import java.util.Scanner;

public class ValidationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String message = "What type of data do you want to get? " +
                "\n 1) Integer 2) Integer within range " +
                "\n 3) Double 4) Double within range " +
                "\n 5) Non Empty String";

        System.out.println(message);
        choice = sc.nextInt();

        if(choice == 1) {
            getValidInt();
        } else if(choice == 2) {
            getIntWithinRange();
        } else if(choice == 3) {
            getDouble();
        } else if(choice == 4) {
            getDoubleWithinRange();
        } else if(choice == 5) {
            getNonEmptyString();
        }
    }

    public static void getValidInt() {
        Int validator = new Int();
        int number = 2;

//        if(validator.isValid(number)) {
//            System.out.println(number + " is a valid integer");
//        } else {
//            System.out.println(validator.errorMessage());
//        }

        String someString = "Bob";

        if(validator.isValid(someString)) {
            System.out.println(number + " is a valid integer");
        } else {
            System.out.println(validator.errorMessage());
        }
    }

    public static void getIntWithinRange() {

    }

    public static void getDouble() {
        Double validator = new Double();
        double number = 2.0;

        if(validator.isValid(number)) {
            System.out.println(number + " is a valid integer");
        } else {
            System.out.println(validator.errorMessage());
        }
    }

    public static void getDoubleWithinRange() {

    }

    public static void getNonEmptyString() {
        NonEmptyString validator = new NonEmptyString();
        String string = "";

        if(validator.isValid(string)) {
            System.out.println(string);
        } else {
            System.out.println(validator.errorMessage());
        }


    }
}
