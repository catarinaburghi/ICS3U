package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double length;
        double width;
        double area;
        double perimiter;
        double num1;
        num1 = 2;

        System.out.println("Please enter the length: ");
        length = sc.nextDouble();

        System.out.println("Please enter the width: ");
        width = sc.nextDouble();

        area = length*width;
        perimiter = length + width + num1;
        System.out.println("The area is: "+area);
        System.out.println("The perimiter is: "+perimiter);


    }
}
