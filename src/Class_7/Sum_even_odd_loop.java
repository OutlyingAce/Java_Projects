package Class_7;

public class Sum_even_odd_loop {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        for (int i = 1;i <= 10;i++){
            if(i%2==0){
                even = even + i;
            }else{
                odd = odd + i;
            }
        }

    }
}
