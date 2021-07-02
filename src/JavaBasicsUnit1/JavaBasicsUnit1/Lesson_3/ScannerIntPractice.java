package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class ScannerIntPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.println("Please enter the first integer: ");
        num1 = sc.nextInt();

        System.out.println("Please enter the second integer: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

    }
}