package ICS3U;
import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double number;
        double number2;
        double number3;

        System.out.println("Please enter the first number: ");
        number = keyedInput.nextDouble();
        System.out.println("Please enter the second number: ");
        number2 = keyedInput.nextDouble();
        System.out.println("Please enter the third number: ");
        number3 = keyedInput.nextDouble();

        if (number>number2){
            System.out.println("The greatest is "+number);
        } else if (number2>number3){
            System.out.println("The greatest is "+number2);
        }else if (number3>number){
            System.out.println("The greatest is "+number3);
        }else if (number3>number2){
            System.out.println("The greatest is "+number3);
        } else if (number2>number){
            System.out.println("The greatest is "+number2);
        } else if (number>number3){
            System.out.println("The greatest is "+number);
        }
    }
}
