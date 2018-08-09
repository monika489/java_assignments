package incremental.java5.main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatcher {

    public static boolean isValidPattern(String text)
    {
        //starts with any capital letter
        //end with .
        String patternString = "^[A-Z].*[\\\\.]$"; // regular expressions

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
        return matches;
    }

    public static void main(String[] args) {

        String text = "This is the text to be search.";
        boolean matches= isValidPattern(text);
        System.out.println(matches);
    }
}
