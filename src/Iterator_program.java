import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;


public class Iterator_program {


    public static void main(String[] args){
        //loop through collection group of data
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");



        //getting an iterator
        Iterator<String> item = fruits.iterator();

        //print the first item from the list of items
        //System.out.println(item.next());

        // loop through of iterator
//        while (item.hasNext()){
//            System.out.println("Iterating..");
//            System.out.println(item.next());
//        }


        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(91);
        num.add(92);
        num.add(93);
        num.add(94);

        Iterator<Integer> numbers = num.iterator();

        while(numbers.hasNext()){
            Integer i = numbers.next();
            if(i<85){
                numbers.remove();
            }
        }

        //loop through iterator
        System.out.println(num);
    }
}
