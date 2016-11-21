/**
 * Created by anthonyfortney on 11/21/16.
 */

/**
 * A working Java profram is all scrambled up on the fridge,
 * Can you rearrange the code snippets to make a working program that produces the output below?
 * Add curly braces as needed.
 *
 * OUTPUT: a-b c-d
 */

public class HFJCodeMagnets {
    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }
                x = x - 1;
                System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
