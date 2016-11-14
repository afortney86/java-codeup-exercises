/**
 * Created by anthonyfortney on 11/14/16.
 */
import java.util.Scanner;

public class RoomCalculator {
    public static void main(String[] args) {
        int width;
        int length;
        String userInput = "n";

        System.out.println("Welcome to the room calculator");

        do {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter width: ");
            width = sc.nextInt();
            System.out.print("Enter the length: ");
            length = sc.nextInt();

            System.out.println("The room has a perimeter of " + perimeter(width, length));
            System.out.println("The area is " + area(width, length));

            System.out.print("Do you want to calculate another room? ");
            userInput = sc.next();

        } while(userInput.equals("y"));

        System.out.println("Thank you for using the room calculator");
    }

    public static int perimeter(int width, int height) {
        return 2 * width + 2 * height;
    }

    public static int area(int width, int height) {
        return width * height;
    }
}