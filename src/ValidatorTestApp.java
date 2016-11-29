import javax.xml.validation.Validator;

/**
 * Created by anthonyfortney on 11/16/16.
 */
public class ValidatorTestApp {
    public static void main(String[] args) {
        OOValidator validator = new OOValidator();
        int min = 1;
        int max = 100;
        String intPrompt = "Enter an integer between " + min + " and " + max;
        String doublePromt = "Enter and double between " + min + " and " + max;
        int userInteger;
        double userDouble;

        userInteger = validator.getIntWithinRange(intPrompt, min, max);
        System.out.println("The user entered " + userInteger);

        userDouble = validator.getDoubleWithinRange(doublePromt, min, max);
        System.out.println("The user's double is " + userDouble);
    }
}
