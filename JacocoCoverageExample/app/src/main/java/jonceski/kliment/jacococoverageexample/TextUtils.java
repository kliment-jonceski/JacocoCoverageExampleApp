package jonceski.kliment.jacococoverageexample;

public class TextUtils {

    /**
     * Validate give text with the rule :
     *  Minimum eight characters, at least one letter and one number.
     * @param text text that is checked.
     * @return true if password matches the criteria / False otherwise.
     */
    public static boolean isValidPassword(String text) {
        return text.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }
}
