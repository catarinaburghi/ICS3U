package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num4;
        num4= 2; 

        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();

        double result1 = num1*num2;
        
        double finalresult = result1/num4;

        System.out.println("The area of the triangle is: "+finalresult);

        

    }

}
