public class Countabc {
    public static int countAbc(String str) {
    if (str.length() < 3){
        return 0; // base case
    }else {
        if(str.substring(0,3).contains("abc") || str.substring(0,3).contains("aba")){
            return 1 + countAbc(str.substring(1));  //

        }else {
            return countAbc(str.substring(1));
        }

    }

    }

    public static void main(String[] args) {
        System.out.println("Enter Alphabets: " + countAbc("abcabcabcxxabc"));
    }
}
