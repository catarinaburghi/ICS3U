package ICS3U;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        // declaring the array
        int[] numbers = new int[5];

        // initializing array values
      /*  numbers[0] = 5;
        numbers[1] = 0;
        numbers[2] = 2;
        numbers[3] = 4;
        numbers[4] = 6;

        // outputting array values
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);*/

        // other way to declare and initialize array:
        // int [] numbers={5,6,4,2,5};

        // ----------------------------------------
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size of array: ");
        // int size = sc.nextInt();
        // declaring the array
        int[] values = new int[5];
        //inicializing array values
        System.out.println("Please enter all the elements of the array: ");
        for (int i = 0; i < 5; i++) {
            values[i] = sc.nextInt();
        }

        // outputting array values
        for (int i=0; i<5; i++){
            System.out.println(numbers[i]);
        }
        
    }
}
