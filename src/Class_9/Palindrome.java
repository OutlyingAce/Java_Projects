package Class_9;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userWord = sc.nextLine();
        String reverse = "";
        for(int i = userWord.length()-1;i>=0; i--){
            reverse = reverse + userWord.charAt(i);

        }
        if(userWord.equals(reverse)){
            System.out.println(userWord + " is a palindrome");
        }else{
            System.out.println(userWord + " is not a palindrome");
        }


    }
}
