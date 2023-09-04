package Class_2;

import java.util.Objects;
import java.util.Scanner;
public class billing_system {
    public static void main(String[] args) {
        String pant_1 = "Boxer";
        int price_1 = 120;
        String pant_2 = "Jeans";
        int price_2 = 150;
        String pant_3 = "Oversized";
        int price_3 = 200;
        String pant;

        System.out.println("Enter the pant you want: ");
        Scanner sc = new Scanner(System.in); //scans the input
        pant = sc.next();

        if (Objects.equals(pant, pant_1)) {
            System.out.println("The pant you ordered is  " + pant_1 + " and its price is " + price_1);
        } else if (Objects.equals(pant, pant_2)) {
            System.out.println("The pant you ordered is  " + pant_2 + " and its price is " + price_2);
        } else if (Objects.equals(pant, pant_3)) {
            System.out.println("The pant you ordered is  " + pant_3 + " and its price is " + price_3);
        }
        else{
            System.out.println("The pant is not here");
        }
    }
}
