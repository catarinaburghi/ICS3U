package ICS3U;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double mark;

        System.out.println("Please enter your course mark: ");
        mark = keyedInput.nextDouble();

        if (mark >= 80) {
            System.out.println("You received an A");
        } else if (mark >= 70) {
            System.out.println("You received a B");
        } else if (mark >= 60) {
            System.out.println("Your received a C");
        } else if (mark >= 50) {
            System.out.println("You received a D");
        } else {
            System.out.println("Sorry, you failed.");
        }
    }
}
