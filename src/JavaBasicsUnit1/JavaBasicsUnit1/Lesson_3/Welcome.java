package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String fname;
        String lname;

        System.out.println("Please enter your first name: ");
        fname = sc.next();

        System.out.println("Please enter your last name: ");
        lname = sc.next();

        System.out.println("Welcome "+fname+" "+lname);
    

    }
}
