import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Student_names_scores {

//    public static String storeGetName(){
//        //HashMap<String, String> student = new HashMap<String, String>();
//        Map<String, Integer> student = new HashMap<>();
//        student.put("John Doe", 91);
//        student.put("John Eve", 89);
//        student.put("John Dale", 88);
//        student.put("John Luis", 86);
//    }

    public static String getName(String varName, String varScore){
        Map<String, Integer> student = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String varStud = scan.nextLine();
        System.out.println("Enter student score: ");
        Integer scoreStud = scan.nextInt();
        //varStud = student.put(varName, varScore);
        //return varStud;
         var sa = student.put(varStud, scoreStud);
        return varStud;
    }


    public static void main(String[] args){

        Map<String, Integer> student = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Option: ");
            System.out.println("1. Add student");
            System.out.println("2. Get student");
            System.out.println("3. get all");
            System.out.println("4. remove");
            System.out.println("5. exit");

            int option = scan.nextInt();
            scan.nextLine();

            if(option == 1){
                System.out.println("Enter name:");
                String name = scan.nextLine();
                System.out.println("Enter score:");
                Integer score = scan.nextInt();
                student.put(name, score);

            } else if (option == 2) {
                //check the key, value pair the key object
                System.out.println("Enter name:");
                String studName = scan.nextLine();
                Integer score = student.get(studName);
                if (score != null) {
                    System.out.println("Student name: " + studName);
                    System.out.println("Student score: " + score);
                } else {
                    System.out.println("Student not found!");
                }
            }else if (option == 3){
                System.out.println("All information");
                System.out.println(student);

            } else if (option == 4) {
                System.out.println("Remove student");
                System.out.println("Enter name:");
                String studName = scan.nextLine();
                Integer grade = student.remove(studName);
                System.out.println("Successfully removed: " + studName);

            } else{
                System.out.println("Quit");
                scan.close();
            }
        }


//        Map<String, Integer> student = new HashMap<>();
//        student.put("John Doe", 91);
//        student.put("John Eve", 89);
//        student.put("John Dale", 88);
//        student.put("John Luis", 86);

//        Map<String, Integer> student = new HashMap<>();
//
//        int con = 0;
//        try( Scanner scan = new Scanner(System.in);) {
//            while (true) {
//                System.out.println("Option:");
//                System.out.println("1. enter name");
//                System.out.println("2. get name");
//                int option = scan.nextInt();
//
//            if(option == 1){
//                System.out.println("Enter student name: ");
//                String varStud = scan.nextLine();
//                System.out.println("Enter student score: ");
//                Integer scoreStud = scan.nextInt();
//                //varStud = student.put(varName, varScore);
//                //return varStud;
//                student.put(varStud, scoreStud);
//            }else if(option == 2){
//                System.out.println("Enter the name:");
//                String varName = scan.nextLine();
//
////                    for(String key: student.keySet()){
////
////                    }
//                System.out.println("Name: " + student.get(varName) + " Score: " + student.get(varName));
//
//            }
//            }
//            for(String name : student.keySet()) {
//                System.out.println(name + " " + student.get(name));
//            }
//        }


    }
}

