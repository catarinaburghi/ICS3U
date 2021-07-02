package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class ScannerDoublePractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();

        double result = num1 / num2;
        System.out.println("The result is:" + result);

    }
}
