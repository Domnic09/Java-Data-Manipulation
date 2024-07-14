import java.io.File; //import the file class library
import java.io.FileNotFoundException;
import java.io.IOException; // for handling exceptions
import java.io.FileWriter; // for writing files
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileHandling_program {
    public static void main(String[] args){
        //new file object creation
        //file path "C:\Users\domin\OneDrive\Desktop\Practice\file.txt"
        try{
        File myObj = new File("myfile.txt");
        if(myObj.createNewFile()){
            System.out.println("File created: " + myObj.getName());
        }else{
            System.out.println("File already exists.");
        }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//--------------------------------------------------------------------------------
//        try{
//            Scanner scan = new Scanner(System.in);
//            //writing a file
//            FileWriter fileWrite = new FileWriter("myfile.txt");
//            if(fileWrite != null){
//                //set content
//                fileWrite.write("This file is a demo for Java reference for deployment");
//                System.out.println("Successfully wrote to the file");
//            }
////            else if (fileWrite == null){
////                System.out.println("Already modified the file");
////                System.out.println("Do you wish to proceed? press 1");
////                int choice = scan.nextInt();
////                if(choice == 1){
////                    System.out.printf("Enter a file content here: ");
////                    String content = scan.nextLine();
////                    fileWrite.write(content);
////                }else{
////                    System.out.println("cancelled!");
////                }
////            }
//            fileWrite.close();
//        }catch (IOException e){
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//-------------------------------------------------------------------------
//        Reading the line by line of the file
//        try{
//            File myObj = new File("myFile.txt");
//            //once found the file
//            Scanner myReader = new Scanner(myObj);
//            //check the every line of the file text
//            while(myReader.hasNextLine()){
//                //once read completed
//                String data = myReader.nextLine();
//                //print the data inside
//                System.out.println(data);
//            }
//            myReader.close();
//
//        }catch(FileNotFoundException e){
//            System.out.println("Error Raised");
//            e.printStackTrace();
//            System.out.println("File not found");
//        }
//--------------------------------------------------------------------------------
//        Getting file information

//        File myObj = new File("myFile.txt");
//        if(myObj.exists()){
//            System.out.println("File name: " + myObj.getName());
//            System.out.println("Absolute path: " + myObj.getAbsolutePath());
//            System.out.println("Writeable: " + myObj.canWrite());
//            System.out.println("Readable: " + myObj.canRead());
//            System.out.println("File length in bytes: " + myObj.length());
//        }else{
//            System.out.println("File not found");
//        }
//---------------------------------------------------------------------
//        Deleting file
//
//        File myObj = new File("myFile.txt");
//        if(myObj.delete()){
//            System.out.println("File deleted successfully" + myObj.getName());
//        }else{
//            System.out.println("File not found or set correct path");
//        }
//-------------------------------------------------------------------------
//        Deleting directory
//        File myObj = new File("C:\\Users\\domin\\IdeaProjects\\udemyJava1\\TestDelete");
//        if(myObj.delete()){
//            System.out.println("Directory deleted successfully " + myObj.getName());
//        }else{
//            System.out.println("File not found or set correct path");
//        }
    }
}
