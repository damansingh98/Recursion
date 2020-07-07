public class PowerBase {
    public static int power(int base, int num){
        if(num == 1){
            return base;
        }else {
          return base*power(base, num-1);
           
        }

    }

    public static void main(String[] args) {
        System.out.println("Exponential operation of your number is: " + power(3,3));
    }
}
