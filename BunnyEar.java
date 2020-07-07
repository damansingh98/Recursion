public class BunnyEar {
    public static int EarCount(int bunnies){
        if(bunnies == 0){
            return 0;

        }else {
            return 2 + EarCount(bunnies-1);
        }

        }

    public static void main(String[] args) {
        System.out.println("Bunnies with number of ears: " + EarCount(2));
    }
    }

