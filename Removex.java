public class Removex {
    public static String noX(String str){
       if(str.equals(""))
           return str;
       if(str.charAt(0) == 'x'){
       return noX(str.substring(1));

       }else {

           return str.charAt(0) + str.substring(1);
       }

    }

    public static void main(String[] args) {
        System.out.println("String with no \"x\" : " + noX("xx"));
    }
}
