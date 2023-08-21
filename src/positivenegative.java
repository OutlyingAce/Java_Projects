import java.util.Scanner;
public class positivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("It is +ve");
        } else if (a ==0) {
            System.out.println('0');

        } else{
            System.out.println("It is -ve");
        }
    }
}