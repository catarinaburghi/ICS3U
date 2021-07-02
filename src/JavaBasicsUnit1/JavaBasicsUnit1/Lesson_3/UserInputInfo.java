package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

/* Catarina Burghi
*  February 18th 2021
*  This program asks for the user
*  to imput their information 
*  and will outprint that same information
*  as a "profile"*/
import java.util.Scanner;

public class UserInputInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fname;
        String lname;
        int grade;
        String studentid;
        String loginname;
        double GPA;

        System.out.println("Please enter your first name: ");
        fname = sc.next();

        System.out.println("Please enter your last name: ");
        lname = sc.next();

        System.out.println("Please enter what grade you are in: ");
        grade = sc.nextInt();

        System.out.println("Please enter your student ID: ");
        studentid = sc.next();

        System.out.println("Please enter your login name: ");
        loginname = sc.next();

        System.out.println("Please enter your GPA: ");
        GPA = sc.nextDouble();

        System.out.println("This is your information: ");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Your grade: " + grade);
        System.out.println("Your Student ID: " + studentid);
        System.out.println("Your login name:" + loginname);
        System.out.println("Your GPA: " + GPA);

    }

}
