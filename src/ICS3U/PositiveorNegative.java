package ICS3U;
import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);

        double number;

        System.out.println("Please enter a number: ");
        number = keyedInput.nextDouble();

        if (number>0) {
            System.out.println("Number is Positive");
        } else if (number<0){
            System.out.println("Number is Negative");
        }

    }
    
}
