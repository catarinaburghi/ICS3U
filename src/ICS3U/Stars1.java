package ICS3U;

import java.util.Scanner;

public interface Stars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Please enter how many stars you would like on a row: ");
        x = sc.nextInt();
        String name = "*****";
        for (int i = x; i < Math.min(name.length(), 100); i++) {
            System.out.print(name.charAt(1)); 
            System.out.print(name.charAt(2)); 
            System.out.print(name.charAt(3)); 
        }
        

    }
}
