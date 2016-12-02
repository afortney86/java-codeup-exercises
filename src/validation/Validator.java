package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public interface Validator {
    // what are the minimum requirements
    // what we need for our methods
    // write down the methods/processes that are in common
    // getInt getDouble

    public boolean isValid(Object instance);
    public String errorMessage();

}
