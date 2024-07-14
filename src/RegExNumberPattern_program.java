import java.util.Scanner;
import java.util.regex.Matcher; // formatting data
import java.util.regex.Pattern; // pattern to compile

public class RegExNumberPattern_program {
    public static void main(String[] args) {
//    String[] strings={
//            "123456",
//            "3.55",
//            "30.2",
//            "asd",
//            "1232sds",
//            "-3230",
//            "+/233"
//        };

        //Accepting array
        Scanner scan = new Scanner(System.in);
        String[] strings = new String[3];

        //inputing array values
        System.out.println("Enter a string validation: ");
        for (int i=0; i < strings.length; i++){
            strings[i] = scan.nextLine();
        }

        //pattern creating, verification pattern, regular expression for numbers to validate
//        String pattern = "[-+]?\\d*\\.?\\d+"; //for number
        String pattern = "^[a-zA-Z_][a-zA-Z0-9_]*$"; //for string

        Pattern regex = Pattern.compile(pattern);

        //read for each item
        for(String i : strings){
            Matcher matcher = regex.matcher(i);
            if(matcher.matches()){
                System.out.println(i + " is valid number");
            }else{
                System.out.println(i + " invalid number");
            }
        }

    }
}
