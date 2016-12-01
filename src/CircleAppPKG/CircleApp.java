package CircleAppPKG; /**
 * Created by anthonyfortney on 11/30/16.
 */

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String userContinue = "n";


        do{
            System.out.print("Please enter a radius! ");
            double radius = input.nextDouble();
            Circle circle = new Circle(radius);

            System.out.println("You entered: " + circle.radius);

            System.out.println("The Circumference of your circle is " + circle.getCircumference());

            System.out.println("The area of your circle is " + circle.getArea());

            System.out.print("Would you like to enter another circle? Y/N: ");
            userContinue = input.next();

        }while (userContinue.equalsIgnoreCase("Y"));
        System.out.println("Goodbye");
    }// end main method
}// end class
