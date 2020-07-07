public class StringClean {
    public static String stringClean(String str){
        if(str.length() < 2){
            return str;

        }else {
            if (str.charAt(0) == str.charAt(1)) {
                return stringClean(str.substring(1));

            } else {

                return str.charAt(0) + stringClean(str.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Answer: " + stringClean("yyzzza"));
    }
}
