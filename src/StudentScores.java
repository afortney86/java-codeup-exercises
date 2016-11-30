/**
 * Created by anthonyfortney on 11/28/16.
 *
 * Display a sorted list of student scores.
 *
 * The application accepts last name, first name, and score for one or more students and stores the results in an array.
 *
 * The application prints the student name and their score alphabetically by last name.
 *
 * The program should implement a class called Student that stores last name, first name, and score for each student. The class should implement the Comparable interface so that students can be sorted by name.
 *
 * The program should you an Array to store Student objects. It should sort the array prior to printing the student list.
 *
 * Validate user input so that the number of students can only be a positive integer, the last name and first name values cannot be empty Strings, and the score is an integer from 0 and 100.
 */



import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        OOValidator validator = new OOValidator();
        ArrayList<Student> students = new ArrayList();
        Scanner input = new Scanner(System.in);
        //Scanner scoreInput = new Scanner(System.in);

        String studentFirstName;
        String studentLastName;
        int studentScore;

        String addStudents;

        do {
//            System.out.print("What is the students first name? ");
//            studentFirstName = input.next();

            studentFirstName = validator.getRequiredString("Please enter the student's first name: ");

//            System.out.print("What is the students last name? ");
//            studentLastName = input.next();
            studentLastName = validator.getRequiredString("Please enter the student's last name: ");

//            System.out.print("What is the students score? ");
//            studentScore = scoreInput.nextInt();

            studentScore = validator.getIntWithinRange("Please enter the student's score: ", 0, 100);

            Student newStudent = new Student(studentFirstName, studentLastName, studentScore);
            students.add(newStudent);


            System.out.print("Would you like to add another student? Y/N: ");
            addStudents = input.next();


        } while (addStudents.equalsIgnoreCase("y"));


        students.sort((o1, o2) -> o1.compareTo(o2));

        for(Student student : students) {

            System.out.println(student.lastName + " " + student.firstName + " " + student.score);

        }

    }
}
