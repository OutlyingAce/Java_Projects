package Class_6;


import java.util.Scanner;

public class Result_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects you want to calcualate: ");
        int numSubjects = sc.nextInt();
        double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = sc.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Not Valid");
                return;
            }
            totalMarks += marks;
        }
        double percentage = (totalMarks / (numSubjects * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else {
            grade = "F";
        }
        System.out.println("Your total grade is: " + grade);
    }
}