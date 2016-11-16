/**
 * Created by anthonyfortney on 11/15/16.
 */

//        Write a program that will recognize invalid inputs when the user requests information about students in a class.
//
//        Provide information about students in a class
//        Prompt the user to ask about a particular student
//        Give proper responses according to user-submitted information
//        Ask if user would like to learn about another student
//        Account for invalid user input with exceptions
//        Try to incorporate IndexOutOfBoundsException and IllegalArgumentException
//        Make it easy for the user - tell them what information is available
//        Use parallel arrays to hold the student data.

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionsAndErrorHandling {
    public static void main(String[] args) {
        String studentName;
        int age;
        String reason;
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        studentName = askStudentForHerName(input);
        age = askStudentForHerAge(input);
        reason = askStutendForAReason(input);

        System.out.println("Student name is " + studentName);
        System.out.println("Student age is " + age);
        System.out.println("Student wants to learn to code because " + reason);

        input.close();
    }

    public static int askStudentForHerAge(Scanner input) {
        try {
            System.out.println("What's your age?");
            int age = input.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age must be a positive integer number");
            }
            return age;
        } catch (InputMismatchException e) {
            input.next();
            System.out.println("Invalid age. Age must be an integer number");
            return askStudentForHerAge(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStudentForHerAge(input);
        }
    }

    public static String askStudentForHerName(Scanner input) {
        try {
            System.out.println("What's your name?");
            String studentName = input.next();
            if (studentName.trim().isEmpty()) {
                throw new IllegalArgumentException("Your name must not be empty");
            }
            return studentName;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStudentForHerName(input);
        }
    }

    public static String askStutendForAReason(Scanner input) {
        try {
            System.out.println("Why do you want to learn to program?");
            String reason = input.next();
            if (reason.trim().isEmpty()) {
                throw new IllegalArgumentException("Your reason to code should not be empty");
            }
            return reason;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStutendForAReason(input);
        }
    }
}
