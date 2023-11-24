package Class_9;

import java.util.Scanner;

public class NoOfVowlesAndConsonent {
    public static void main(String[] args) {
        String word;
        int vowel = 0, consonant = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        word = sc.nextLine();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
