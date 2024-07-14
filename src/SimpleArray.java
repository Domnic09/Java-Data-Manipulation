import java.util.Scanner;

public class SimpleArray {

    public static String[] simple(){
        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];
//        array[0] = "Hello";
//        array[1] = "World";
        System.out.printf("Enter an array: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();
        }

        for(String arrays : array ){
            System.out.println("These are the arrays: " + arrays);
        }
        return array;
     }

    public static void main(String[] args){
        simple();
    }
}
