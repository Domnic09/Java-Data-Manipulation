public class Methods_decision {
    static void checkAge(int age) {
        //if else statement
        if (age < 18 && age > 18) {
            System.out.println("Access denied, age restricted!");
        }else{
            System.out.println("Access granted!");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}
