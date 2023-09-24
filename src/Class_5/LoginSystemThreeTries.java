package Class_5;
import java.util.Scanner;

public class LoginSystemThreeTries {
    public static void main(String[] args) {
        int maximumtries = 3;
        int tries = 0;
        String name = "Siddhant";
        String password = "Siddhant123abc";
        Scanner sc = new Scanner(System.in);
        while(tries<maximumtries){
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter password: ");
            String correctpassword = sc.next();

            if(username.equals(name) && correctpassword.equals(password)){
                System.out.println("Logged in");
                break;
            }else{
                System.out.println("Login failed");
                tries++;
            }if(tries==maximumtries){
                System.out.println("Login Failed! Try again later.");
            }

        }


    }
}