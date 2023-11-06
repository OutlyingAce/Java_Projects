 package Class_7;

import java.util.Scanner;

public class PinCheck_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Pin:");
            int pin = sc.nextInt();
            if (pin == 1234){
                System.out.println("Correct Pin");
                break;
            }else{
                System.out.println("Incorrect Pin");
            }
        }
    }
}
