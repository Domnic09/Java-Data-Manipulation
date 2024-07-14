import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_program {

    public static void main(String[] args){
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("PH");
        countries.add("US");
        countries.add("CA");
        countries.add("GB");

        Collections.sort(countries);
//        for(int i=0; i<countries.size(); i++){
//            System.out.println(countries.get(i));
//        }
//        System.out.println(countries);

        //adding an item at first
        countries.addFirst("New York");
        //adding last
        countries.addLast("Timeless");
        //remove first
        countries.removeFirst();
        //remove last
        countries.removeLast();
        System.out.println(countries);

        //get first
        System.out.println(countries.getFirst());
        //get last
        System.out.println(countries.getLast());

    }
}
