import java.util.Random;
import java.util.stream.IntStream;

public class Random_number {

    public static int Gen(int a){
        Random rand = new Random();
//       if(a > 0){
//            System.out.println("Keeps executing");
//            return rand.nextInt(a) + Gen(a -1);
//           // return res + Gen(a - 1);
//        }else{
//            return 0;
//        }
        for(int i = 0; i <= a; i++){
            System.out.println("This is executing");
            int res = rand.nextInt(i);
            return res;
        }

        return a;
    }
    public static int GenGPT(int a) {
        Random rand = new Random();
        int min = (int) Math.pow(10, a - 1); // minimum value for a-digit number
        int max = (int) Math.pow(10, a) - 1; // maximum value for a-digit number

        int res = rand.nextInt(max - min + 1) + min;

        return res;
    }


    /*
    public static int Gen5(int a, int b, int c){
        Random rand = new Random();
        byte[] bytes=new byte[10];
        //generates random bytes and put them in an array
        rand.nextBytes(bytes);
        for(int i=0;i<bytes.length; i++){
           int j = bytes[i];
        }
        return 0;
    }*/

    public static void main(String[] args){
//        int res = Gen(5);
        System.out.println(Gen(5));

        //System.out.println(GenGPT(10));
    }
}
