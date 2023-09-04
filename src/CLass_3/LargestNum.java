package CLass_3;

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("Number first is larger than Number second and Number third");
        } else if (b>a && b>c) {
            System.out.println("Number second is larger than Number first and Number third");
        }else{
            System.out.println("Number third is larger than Number first and Number second");
        }
    }
}