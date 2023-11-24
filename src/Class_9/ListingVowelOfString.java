package Class_9;

import java.util.Scanner;

public class ListingVowelOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Siddhant";
        for (int i = 0; i < name.length(); i++) {
            char vowel = name.charAt(i);
            if (!(vowel != 'a' && vowel != 'e' && vowel != 'i' && vowel != 'o' && vowel != 'u')){
                System.out.println("The vowels are: " +vowel);
            }
        }
    }
}