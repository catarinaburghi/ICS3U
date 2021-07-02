package ICS3U;
import java.util.Scanner;
public class ValueInteger {
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);

        double m;
        double n;

        System.out.println("Please enter the value of m");
        m = keyedInput.nextDouble();

        if (m>0){
            System.out.println("n=1");
        } else if (m<0){
            System.out.println("n=-1");
        }
    }
}
