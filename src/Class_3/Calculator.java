package Class_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        String operator;
        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter operator (+, -, /, ): ");
        operator = sc.next();
        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();
        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("The result is: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("The result is: " + result);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Num2 cannot be zero in division.");
            }
        } else if (operator.equals("")) {
            result = num1 * num2;
            System.out.println("The result is: " + result);
        } else {
            System.out.println("Invalid operator.");
        }
    }
}