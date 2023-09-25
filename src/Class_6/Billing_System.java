package Class_6;

import java.util.Scanner;
public class Billing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int item = sc.nextInt();
        sc.nextLine();
        double totalCost = 0;

        for (int i = 1; i <= item; i++) {
            System.out.print("Enter name of item that you want " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter quantity of " + name + ": ");
            int quantity = sc.nextInt();
            System.out.print("Enter the price of " + name + ": ");
            double price = sc.nextDouble();

            double Total = quantity * price;
            totalCost += Total;

            sc.nextLine();
        }

        double vat = totalCost * 0.13;
        double discount = totalCost * 0.10;
        double finalTotalCost = totalCost + vat - discount;

        System.out.println("----- Bill -----");
        System.out.println("Total Cost: " + totalCost + "RS");
        System.out.println("VAT (13%): " + vat + "RS");
        System.out.println("Discount (10%):" + discount + "RS");
        System.out.println("Final Total Cost:" + finalTotalCost + "RS");

    }
}