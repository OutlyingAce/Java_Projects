package CLass_3;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("Siddhant") && password.equals("123abc123@")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Wrong Information");
        }

    }
}