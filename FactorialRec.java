public class FactorialRec {
    public static int factorial(int num){
        if(num == 0){
            return  1;

        }else {
            return num*factorial(num-1);
        }


    }

    public static void main(String[] args) {
        factorial(3);
    }

}
