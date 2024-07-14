public class Welcome {
    static void greetings(String name, int num){
        String greet = "Hello : " + name;
        int today = num * 2;
        // return greet + today;
        System.out.println(name + " " + today);
    }
    static void wish(){
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {


        greetings("Dom", 22);
        greetings("Dan", 22);
        greetings("Dale", 22);
        wish();


    }
}
