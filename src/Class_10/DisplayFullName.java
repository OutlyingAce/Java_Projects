package Class_10;

import java.util.Scanner;

public class DisplayFullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname;
        firstname = sc.next();
        System.out.println("Enter your last name: ");
        String lastname;
        lastname = sc.next();
        System.out.println(firstname+" "+lastname+" is your full name.");
    }
}
