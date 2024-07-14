import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression_program {
    //Lambda - similar to methods, not need a name
//    (parameters1, parameters2)->{Block of code} // expressions,

    //Lambda using array-list
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(22);
        num.add(32);
        num.add(42);
        num.add(52);

        //read the statement using the lambda expression
        //using the parameter of n, then use the arraw function
//        num.forEach((n)->{
//            System.out.println(n);
//        });

//-----------------------------------------------------------------
        //Consumer interface
        //lamda expression = "(n)->{System.out.println(n);};"

        Consumer<Integer> myMethod = (n)->{
            System.out.println(n);
        };
        num.forEach(myMethod);
//-------------------------------------------------------------------



    }




}
