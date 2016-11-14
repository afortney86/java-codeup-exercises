/**
 * Created by anthonyfortney on 11/14/16.
 */
public class ControlStatementsAndLoops {
    public static void main(String[] args) {
//          Slide Examples

//       //while Loop
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        //Do, While
//        do {
//            System.out.println("Hey!");
//        } while (false);
//
//        //For Loop
//        System.out.println("Before the for");
//        for(int t = 0; t < 10; t++)
//        {
//            System.out.println("t is " + t);
//        }
//        System.out.println("After the for");

        //My work
        //Count to 15 in increments of 5

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        //Count to 100 in increments of 2
        System.out.println();

        int t = 0;
        do {
            System.out.println(t);
            t += 2;
        } while (t <= 100);

        //Count from 100 to -10 in increments of 5
        System.out.println();


        int x = 100;
        do {
            System.out.println(x);
            x -= 5;
        } while (x >= -10);

        //Squares
        System.out.println();

        long f = 2;
        do {
            System.out.println(f);
            f *= f;
        } while (f < 1000000);

        System.out.println();


        // For Loop

        //Count from 100 to -10 in increments of 5
        for (int a = 100; a >= -10; a -= 5) {
            System.out.println(a);
        }

        //Squares
        System.out.println();

        for (long v = 2; v < 1000000; v *= v) {
            System.out.println(v);
        }

    }
}
