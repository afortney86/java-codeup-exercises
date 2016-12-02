package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public class NonEmptyString implements Validator {


    @Override
    public boolean isValid(Object instance) {

        if (instance instanceof String){
            ((String) instance).trim().equalsIgnoreCase("");
            return false;

        } else {

            return true;
        }
    }

    @Override
    public String errorMessage() {
        return "String cannot be empty.";
    }
}
