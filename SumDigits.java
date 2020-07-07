public class SumDigits {
    public static int  sumDigits(int n){
        if(n <= 9){
            return n;
        }else {
               return sumDigits(n/10) + sumDigits(n%10);

           }
        }



    public static void main(String[] args) {
        System.out.println("Sum of the following digits: " + sumDigits(126) );
    }
}
