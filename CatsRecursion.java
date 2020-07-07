public class CatsRecursion {
    public static int Cats(int number){
        if(number == 0){
            return 0;
        }else {
            return  2 + Cats(number-1);
        }

    }

    public static void main(String[] args) {
        Cats(5);
    }
}
