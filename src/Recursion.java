public class Recursion {
    //in short calling its own function inside until the condition satified
    //making a function call itself, making big chunks into small to solve it
    public static int sum(int k){
        //this way is like a loop when you invoke the function itself
        if(k>0){
            //this way is appropriate to dissect the complexity of the problem
            System.out.println("Keeps executing");
            return k + sum(k-1);

        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        int myVar = sum(10);
        System.out.println(myVar);
    }
}
