package ICS3U;

import java.util.Scanner;

public class ForLoops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x;
        Double z;

        for (int i = 1; i <= 200; i = i + 1) {
            System.out.println(i);

        }
        for (int j = 51; j <= 150; j = j + 1) {
            System.out.println(j);
        }
        for (int k = 1; k <= 200; k = k + 3) {
            System.out.println(k);
        }
        for (int b = 200; b >= 1; b = b - 1) {
            System.out.println(b);
        }
        System.out.println("Please enter a number:");
        x = sc.nextDouble();
        for (int c = 1; c <= x; c = c + 1) {
            System.out.println(c);
        }
        System.out.println("Please enter another number less than 200:");
        z = sc.nextDouble();
        for (Double d = z; d <= 200; d = d + 1) {
            System.out.println(d);
        }
    }

}
