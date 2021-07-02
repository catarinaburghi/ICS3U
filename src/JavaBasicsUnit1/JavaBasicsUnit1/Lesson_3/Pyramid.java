package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;
/* Catarina Burghi
*  February 18th 2021
*  This program calculates the 
*  Volume of a pyramid with the
*  information inputed by the user*/
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Double length;
        Double width;
        Double height; 
        Double volume;
        Double num2;

        num2= (double) 3;

        System.out.println("Please enter the length: ");
        length = sc.nextDouble();

        System.out.println("Please enter the width: ");
        width = sc.nextDouble();

        System.out.println("Please enter the height: ");
        height = sc.nextDouble();

        volume = length*width*height/num2;

        System.out.println("The volume is: "+volume);



    }
}
