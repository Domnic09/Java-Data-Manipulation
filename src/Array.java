import java.util.ArrayList;
import java.util.Collections; //sort method using java array

public class Array {

    /*public static int ArrayLists(){
        ArrayList<String> fruits = new ArrayList<String>();

        System.out.println(fruits.get(1));
        fruits.add("Orange");
        return fruits.size();
    }*/

    public static String addArray(String res){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add(res);
        //System.out.println(res1);
        return "Fruits: " + fruits;
    }

    public static void main(String[] args) {

       ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.set(2, "Grapes");

        //collection of items for applying sort()
        Collections.sort(fruits);
        System.out.println(fruits);

        //fruits.remove(1);
        //fruits.clear();
//        System.out.println(fruits);
//        System.out.println(fruits.size());
        /*
        System.out.println(addArray("Apple") );
        System.out.println(addArray("Orange") );*/

        //for loop
//        for(int i =0; i < fruits.size(); i++){
//            System.out.println(fruits.get(i));
//        }

        //for each

//        for(String i:fruits){
//            System.out.println(i);
//        }

        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(78);
        grades.add(88);
        grades.add(90);
        Collections.sort(grades);

        for(int i = 0; i<grades.size(); i++){
            System.out.println(grades.get(i));
        }


    }
}

