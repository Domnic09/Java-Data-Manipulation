import java.util.regex.Matcher; //to match pattern
import java.util.regex.Pattern; // to pattern and identify

public class RegExPattern_program {



    public static void main(String[] args){
        //insensitive default keyword method from the package pattern
        Pattern pat = Pattern.compile("JavaCoding", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher("Learn JavaCoding is Fun");
        boolean matchFound = mat.find();

        if(matchFound){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }

    }
}
