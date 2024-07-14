public class Concurrency_problems extends Thread {

    public static int amount = 0;

    public static void main(String[] args){
        Concurrency_problems thread = new Concurrency_problems();
        thread.start();
        //when starting, wait to thread running finish
        // the alive method to check, if the thread is accessible then shows waiting, when is avaible in memory stack.
        //use this while when using this method, continue to use multiple of threads 
        while(thread.isAlive()){
            //will go to the next step
            System.out.println("Waiting...");
        }
        //unless go to the next step
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    //the reading and writing of variable
    //how to avoid concurrency problems
    // is thread share then use isAlive method means control and wait , how to control and wait
    public void run(){
        amount++;
    }
}
