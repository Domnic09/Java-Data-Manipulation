public class Return_program {
    //return
    static int myAdd(int a, int b) {
        if(a < 10) {
            return a + b;
        }else{
            return a%b / 2;

        }
    }
    public static void main(String[] args) {
        int c = myAdd(9,20);
        System.out.println(c);
    }
}
