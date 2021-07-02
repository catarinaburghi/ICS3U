package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class SpeedOfAnObject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double time;
        double distance;
        double result;

        System.out.println("Please enter the time: ");
        time = sc.nextDouble();

        System.out.println("Please enter the distance: ");
        distance = sc.nextDouble();

        result= time/distance;
        System.out.println("The result is: "+result);



    }

}
