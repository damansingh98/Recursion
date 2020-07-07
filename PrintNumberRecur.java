public class PrintNumberRecur {
        static int number = 1;
    public static void recursive(int n){
        if(n ==0){
           return;
        }else {
            System.out.println(n);
            recursive(n-1);

        }
    }

    public static void main(String[] args) {
        recursive(10);
    }

}
