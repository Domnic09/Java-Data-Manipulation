interface StrFun{
    String run(String str);
}

public class LamdaMethod_program {


    //the format given as parameter is based in the !! and ?? provided
    public static void askQuery(String str, StrFun format){
        String result = format.run(str);
        System.out.println(result);
    }


    public static void main(String[] args){
        //use exclaim to reference
        StrFun exclaim = (s)->s+"!!";
        StrFun query = (s)->s+"??";

        askQuery("Hello", exclaim);
        askQuery("Hello", query);
    }



}

