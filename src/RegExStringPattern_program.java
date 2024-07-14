import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExStringPattern_program {
    public static boolean validateString(String input) {
        // your code implementation starts here
        String pattern = "^[a-zA-Z_][a-zA-Z_]*$";
        //  String patterNum = "[-+]?\\d*\\.?\\d+";
        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(input);
        if(matcher.matches()){
            // System.out.println(input + " is valid");
            return true;
        }else{
            // System.out.println(input + " is not valid");
            return false;
        }

        //  return false;
    }

    public static void main(String[] args){
        System.out.println(validateString("Hello"));
        System.out.println(validateString("12sd3"));
    }
}
