package Class_2;

import java.util.Scanner;
public class ResultScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark of first subject: ");
        double mark = sc.nextDouble();
        System.out.println("Enter mark of second subject: ");
        double mark1 = sc.nextDouble();
        System.out.println("Enter mark of third subject: ");
        double mark2 = sc.nextDouble();
        double percentage = ((mark1+mark2+mark)/300)*100;
        if(percentage>=90){
            System.out.println("A+");
        } else if (percentage>=80) {
            System.out.println("A");
        } else if (percentage>=70) {
            System.out.println("B+");
        } else if (percentage>=60) {
            System.out.println("B");
        }
        {
        }
        {

        }
    }
}