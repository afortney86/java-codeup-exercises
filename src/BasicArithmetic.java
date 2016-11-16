/**
 * Created by anthonyfortney on 11/14/16.
 */
public class BasicArithmetic {
    public static void main(String[] args) {

        System.out.println(addition(1, 1));

        System.out.println(subtraction(3, 1));

        System.out.println(multiply(2, 1));

        System.out.println(divide(2, 2));

        System.out.println(mod(2, 1));

    }

    private static int addition(int num1, int num2) {
        return num1 + num2;
    }

    private static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        return num1 / num2;
    }

    private static int mod(int num1, int num2) {
        return num1 % num2;
    }
}