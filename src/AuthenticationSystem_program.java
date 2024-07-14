import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//handles the username and password to reuse the code
class User{
    public String username;
    public String password;

    //class constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }


    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

}

public class AuthenticationSystem_program {

    //creating register method

    private LinkedList<User>userlist;

    //this constructor when program executes, it will invoke user list and will reset/load
    //in every new iteration

    public AuthenticationSystem_program(){

        userlist = new LinkedList<>();
    }

    public boolean checkUser(String username, String password){
        User user = new User(username, password);
        for(User i: userlist){
            if(user.getUsername().equals(i.getUsername()) || user.getPassword().equals(i.getPassword())){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public void checkAll(){
        for(int i = 0; i< userlist.size(); i++){
            System.out.println("Users : " + userlist.get(i).getUsername());
        }
    }

    public void removeUser(String username){

        for(User i : userlist){
            if(i.getUsername().equals(username)){
                userlist.remove(i);
                System.out.println("The " + username + " has been removed.");
            }
        }

        System.out.println("Users : " + userlist.size());

    }

    public void register(String username, String password){
        User user = new User(username, password);

        if(checkUser(username, password)){
            System.out.println("User is already registered");
        }else{
            userlist.add(user);
            System.out.println("User successfully registered");
        }
    }

    public boolean login(String username, String password){
        for(User user : userlist){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){

                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args){
        AuthenticationSystem_program authsys = new AuthenticationSystem_program();
        Scanner sc = new Scanner(System.in);


        boolean loggedIn = true;
        while(loggedIn){
            System.out.println("Choose an option: ");
            System.out.println("1. Register a new user");
            System.out.println("2. Log in");
            System.out.println("3. Check all users");
            System.out.println("4. Remove user");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    System.out.println("Enter a name: ");
                    String regUsername = sc.nextLine();
                    System.out.println("Enter a password: ");
                    String regPassword = sc.nextLine();
                    authsys.register(regUsername, regPassword);
                    break;
                case 2:
                    System.out.println("Enter a name: ");
                    String logUsername = sc.nextLine();
                    System.out.println("Enter a password: ");
                    String logPassword = sc.nextLine();

                    if(authsys.login(logUsername, logPassword)){
                        loggedIn = true;
                        System.out.println("Logged in successfully");
                    }else{
                        System.out.println("Logged in failed");
                    }
                    break;
                case 3:
                    System.out.println("Checking all...");
                    authsys.checkAll();
                    break;
                case 4:
                    System.out.println("Which user?...");
                    authsys.checkAll();
                    System.out.println("Enter a name: ");
                    String user = sc.nextLine();
                    authsys.removeUser(user);
                    break;
                case 5:
                    System.out.println("Exiting program");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        sc.close();

    }
}
