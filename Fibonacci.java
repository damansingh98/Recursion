import java.lang.ref.SoftReference;

public class Fibonacci {
    public static int fibo(int number){
        if(number == 0){
            return 0;
        }
        if (number == 1){
        return 1;
        }
        else {
           return   fibo(number-1) + fibo(number-2);

        }

    }

    public static void main(String[] args) {
        System.out.println("Your Fibonacci sequence is " + fibo(5));
    }
}
