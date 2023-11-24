package Class_8;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "Admin";
        String correctPassword = "Administrator@";
        System.out.println("Enter the username:");
        String username = sc.next();
        System.out.println("Enter the password:");
        String password = sc.next();

        if (password.length()>=8 && password.indexOf('@') != -1){
            if(username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("You have been logged in");
            }else{
                System.out.println("Wrong Details");
            }
        }else{
            System.out.println("Wrong Details");
        }

    }
}
