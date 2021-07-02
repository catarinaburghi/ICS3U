package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double num1;
        double num2;
        double result;

        System.out.println("Please enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Please enter the second number: ");
        num2 = sc.nextDouble();

        result=num1*num2;
        System.out.println("The result is: "+result);

    }
    
}
