package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double radius;
        double perimiter;
        double area;
        double pie;
        double num2;

        pie= 3.14; 
        num2= 2;

        System.out.println("Please insert radius: ");
        radius = sc.nextDouble();
        perimiter = radius * num2 * pie;

        area= radius*radius*pie;
        System.out.println("The area is: "+area);
        System.out.println("The perimiter is: "+perimiter);
        

    }
    
}
