package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public class PositiveDouble implements Validator {

    @Override
    public boolean isValid(Object instance) {

        if (instance instanceof Double && ((double) instance >= 0)) {

            return true;

        } else return false;

    }

    @Override
    public String errorMessage() {

        return "Number must be a positive Integer.";

    }
}
