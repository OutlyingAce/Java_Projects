package Class_8;

import java.util.Scanner;

public class SearchInAString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Siddhant Regmi";

        System.out.print("Enter a word to check: ");
        String userWord = scanner.nextLine();

        if (text.contains(userWord)) {
            System.out.println("The word is present in the string.");
        } else {
            System.out.println("The word is not present in the string.");
        }

    }
}

