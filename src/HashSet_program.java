import java.util.HashSet;

public class HashSet_program {

    //collection of item where every one is unique

    public static void main(String[] args){
        //creating hashSet object
        HashSet<String> sports = new HashSet<>();

        sports.add("volleyball");
        sports.add("football");
        sports.add("badminton");

        //Remove item
        sports.remove("volleyballs");
        System.out.println(sports);
        //check existince
        System.out.println(sports.contains("volleyballs"));
        //check size
        System.out.println(sports.size());

        //loop
        for(String i : sports){
            System.out.println(i);
        }
    }

}
