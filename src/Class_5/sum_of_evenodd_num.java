package Class_5;
public class sum_of_evenodd_num {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        for (int i = 1; i <= 10; i++) {
            if ( i % 2 == 0) {
                a += i;
            } else {
                b += i;
            }
        }
        System.out.println("Sum of even numbers: " + a);
        System.out.println("Sum of odd numbers: " + b);
            }
        }


