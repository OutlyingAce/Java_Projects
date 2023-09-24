package Class_3;

import java.util.Scanner;
public class NumberToDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        if (num<0 || num>7){
            System.out.println("Invalid input");
        }
        else if (num==1){
            System.out.println("Today is Sunday");
        } else if (num==2) {
            System.out.println("Today is Monday");
        } else if (num==3) {
            System.out.println("Today is Tuesday");
        } else if (num==4) {
            System.out.println("Today is Wednesday");
        } else if (num==5) {
            System.out.println("Today is Thursday");
        } else if (num==6) {
            System.out.println("Today is Friday");

        } else if (num==7) {
            System.out.println("Today is Saturday");

        }
    }}