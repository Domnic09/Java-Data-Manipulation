public class Method_overloading {
    static int addMethod(int a, int b) {
        return a + b;
    }
    static double addMethod(double x, double y){
        return x + y;
    }
    static int addMethod(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args){

        //method overloading works as long as the data types are different between the same method

        int var1 = addMethod(3,4);
        double var2 = addMethod(1,2);
        int var3 = addMethod(1,2,3);
        System.out.println(var1 + " and " + var2 + " and " + var3);
    }
}
