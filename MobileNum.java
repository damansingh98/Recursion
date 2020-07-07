public class MobileNum {
    public static int phoneNum(int numbers){
        if(numbers == 0){
            return 0;
        }else if(numbers % 2 == 0) {
            return 2 + phoneNum(numbers-1);

        }else {
            return 1 + phoneNum(numbers-1);
        }


    }

    public static void main(String[] args) {
        System.out.println("Number of speakers: " + phoneNum(4));
    }
}
