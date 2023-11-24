package Class_9;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= input.nextInt();
        int lastdigit=0;
        int sum=0;
        while (num>0){
            lastdigit=num%10;
            sum=sum+lastdigit;
            num=num/10;
        }
        System.out.println("sum= "+sum);

    }
}
