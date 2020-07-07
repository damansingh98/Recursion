import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Count8 {
    public  static int count8(int number){
        if(number <= 9) {
            if (number == 8) {
                return 1;
            }
            else {
                return 0;
            }
        }else{
            if(number % 10 == 8){
                    return 1 + count8(number/10);
                }
                else {
                    return 0 + count8(number/10);
                }

            }

        }

    public static void main(String[] args) {
        System.out.println("8 digit number in: " + count8(818182));
    }
    }




