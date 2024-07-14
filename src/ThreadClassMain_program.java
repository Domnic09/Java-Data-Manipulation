//creates thread
//public class ThreadClassMain_program extends Thread {
//    //threads allows the program by doing multiple things efficiently at the same time
//
//    //using multiple instances/actions/background to make the program work efficiently
//    //one keyword extending to run the method, runnable interface use extends
//
//    public static void main(String[] args){
//        ThreadClassMain_program thread = new ThreadClassMain_program();
//        thread.start(); //intiate this thread or instantiating
//        System.out.println("Outside of thread");
//    }
//    public void run (){
//        System.out.println("This program is running inside the thread.");
//    }
//
//}

//extending vs implementing threads both are used,
//the major differnce once extends, you cannot extend other class,
//by implementing runnnable interface possible to extend from the another class as well like as my class
//extend other classes implementation

//in-short you cannot extend another class but you can implement runnabe interfaces to other classes.

public class ThreadClassMain_program implements Runnable {
    //threads allows the program by doing multiple things efficiently at the same time

    //using multiple instances/actions/background to make the program work efficiently
    //one keyword extending to run the method, runnable interface use extends

    public static void main(String[] args){
        ThreadClassMain_program obj = new ThreadClassMain_program();
        //implement thread based on the object
        Thread thread = new Thread(obj); //mapping this object, the object instantiating as a main class

        thread.start(); //intiate this thread or instantiating
        System.out.println("Outside of thread");
    }
    public void run (){
        System.out.println("This program is running inside the thread.");
    }

}


