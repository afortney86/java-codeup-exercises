/**
 * Created by anthonyfortney on 11/14/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {
                // count from 1 to 100
        for (int i = 1; i <= 100; i++) {

                // A multiple of both?
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("fizzbuzz");

                // else a multiple of 3?
            else if ((i % 3) == 0) System.out.println("fizz");

                // else a multiple of 5?
            else if ((i % 5) == 0) System.out.println("buzz");

                // else just print it
            else System.out.println(i);
        }
    }
}