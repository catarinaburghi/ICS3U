/*Catarina F. Burghi
*April 21st 2021
*This program displays a menu and asks the user to pick between 6 options
*When the user picks their choice the program then asks them to input numbers and calls a sub routine to solve
*the chosen problem then it displays the menu again.
*/

package ICS3U;

import java.util.Scanner;

// making my subroutines
public class FirstSubRoutineProgram {
    public static void MissingAngles(int n1, int n2) {

        int angle = 180 - (n1 + n2);
        System.out.println("The Missing Angle is " + angle);
    }

    public static void AverageOfNumbers(int n1, int n2) {

        int average = n1 + n2;
        System.out.println("The Average is " + average / 2);
    }

    public static void FindingAreaOfSquare(int n1) {

        int product = n1 * n1;
        System.out.println("The Area of a Square is " + product);

    }

    public static void FindingAreaOfATriangle(int n1, int n2) {

        double product = n1 * n2;
        System.out.println("The Area of a Triangle is " + product / 2);
    }

    public static void FindingAreaOfACircle(int n1) {

        int radius = n1 * n1;
        double Pi = 3.14;
        double area = radius * Pi;
        System.out.println("The Area of a Circle is " + area);

    }

    public static void main(String[] args) {
        // declaring the scanner
        Scanner sc = new Scanner(System.in);
        // declaring my variables
        int n1, n2, x;
        // do-while loop
        do {
            // menu
            System.out.println("---");
            System.out.println("Please choose a operation");
            System.out.println("1- Finding a Missing Angle");
            System.out.println("2-Finding the Average of 2 numbers");
            System.out.println("3-Finding the Area of a Square");
            System.out.println("4-Finding the Area of a Triangle");
            System.out.println("5-Finding the Area of a Circle");
            System.out.println("6-GoodBye");
            x = sc.nextInt();
            // if and else statements
            if (x == 1) {
                System.out.println("Please enter the first angle:");
                n1 = sc.nextInt();
                System.out.println("Please enter the second angle:");
                n2 = sc.nextInt();

                MissingAngles(n1, n2);
            } else if (x == 2) {

                System.out.println("Please enter the first number:");
                n1 = sc.nextInt();
                System.out.println("Please enter the second number:");
                n2 = sc.nextInt();

                AverageOfNumbers(n1, n2);
            } else if (x == 3) {
                System.out.println("Please enter the messurement of one side:");
                n1 = sc.nextInt();

                FindingAreaOfSquare(n1);
            } else if (x == 4) {
                System.out.println("Please enter the Base messurement:");
                n1 = sc.nextInt();

                System.out.println("Please enter the Height messurement:");
                n2 = sc.nextInt();

                FindingAreaOfATriangle(n1, n2);
            } else if (x == 5) {
                System.out.println("Please enter the radius:");
                n1 = sc.nextInt();

                FindingAreaOfACircle(n1);
            }
        } while (x != 6);
    }

}