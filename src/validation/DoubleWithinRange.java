package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public class DoubleWithinRange implements Validator {

    double min;
    double max;

    public void doubleWithinRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isValid(Object instance) {
        if(instance instanceof Integer &&
                ((double) instance < max) &&
                ((double) instance > min)) {

            return true;
        } else {
            return false;
        }
        // check if instance is instanceof Integer
        // check if instance > min && instance < max
        // return true
    }

    @Override
    public String errorMessage() {
        return "Argument must be an integer type between " + min + " and " + max;
    }
}
