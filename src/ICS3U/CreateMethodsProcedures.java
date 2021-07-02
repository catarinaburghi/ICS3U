package ICS3U;

import java.util.Scanner;

public class CreateMethodsProcedures {
    // 1st subroutine/method to add numbers and output the sum
    public static void addAndOut(int n1, int n2) {

        int sum = n1 + n2;
        System.out.println("The sum is: " + sum);
    }

    // 2nd subroutine/method to multiply numbers and output the product
    public static void multAndOut(int n1, int n2) {

        int product = n1 * n2;
        System.out.println("The product is: " + product);
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        // get numbers from user
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        // 1st subroutine/method called
        addAndOut(num1, num2);

        // 2nd subroutine/method called
        multAndOut(num1, num2);

    } // end of main method
}