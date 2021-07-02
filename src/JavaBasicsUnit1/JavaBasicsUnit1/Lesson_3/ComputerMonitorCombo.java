package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;
import java.util.Scanner;
public class ComputerMonitorCombo {
    private static final double WATER = 1.5;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num1;
        double result;

        System.out.println("Please enter the number of Computer and Monitor combos you own: ");
        num1 = sc.nextDouble();

        result= num1*WATER;
        System.out.println("The amount of water used was: "+result+ " tons");


        
    }
}
