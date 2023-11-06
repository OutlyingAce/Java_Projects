package Class_7;

import java.util.Scanner;

public class SI_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:");
        int principle = sc.nextInt();
        System.out.println("Enter Rate:");
        float rate = sc.nextFloat();
        System.out.println("Enter Time:");
        float time = sc.nextFloat();
        float SI = (principle * rate * time)/100;
        System.out.println(SI);
    }
}
