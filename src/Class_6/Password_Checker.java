package Class_6;

import java.util.Scanner;

public class Password_Checker {
        public static void main(String[] args) {
            int maximumtries = 5;
            int tries = 0;

            String password = "Siddhant123abc";
            Scanner sc = new Scanner(System.in);
            while(tries<maximumtries){

                System.out.println("Enter password: ");
                String correctpassword = sc.next();

                if(correctpassword.equals(password)){
                    System.out.println("Correct password");
                    break;
                }else{
                    System.out.println("Incorrect password. Try Again");
                    tries++;
                }if(tries==maximumtries){
                    System.out.println("You have entered incorrect password 5 times. Try again later!");
                }

            }


        }
    }
