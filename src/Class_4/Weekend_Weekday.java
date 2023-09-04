package Class_4;

import java.util.Scanner;

public class Weekend_Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day: ");
        String  day = scanner.next();

    switch (day){
        case "Sunday", "Saturday":
            System.out.println("It is a weekend");
            break;

        case "Monday","Tuesday","Wednesday","Thursday","Friday":
            System.out.println("It is not a weekday");
            break;

        default:
            System.out.println("The input is INVALID");

    }
    }
}
