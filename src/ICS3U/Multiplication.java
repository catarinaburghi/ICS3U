package ICS3U;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userSuppliedVal = -1;
        int numbers = 1;

        while (!(userSuppliedVal >= 1 && userSuppliedVal <= 12)) {
            System.out.println("Enter a value between 1 and 12:");
            userSuppliedVal = sc.nextInt();
        }

        for (int i = numbers; i <= 12; i = i + 1) {
            System.out.println(String.format("%d times %d is %d", i, userSuppliedVal, i * userSuppliedVal));

        }
    }
}
