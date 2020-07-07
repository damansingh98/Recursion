public class DigitCounter {
    public static int countNumber(int N){
        if(N <= 9){
            if(N == 5){
                return 1;
            }
            else {
                return 0;
            }
        }else {
            if (N % 10 == 5) {
                return 1 + countNumber(N /10);
            } else {
                return 0 + countNumber(N /10);

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("There are: " + countNumber(155) + "  digits in the number.");

    }
}
