package ICS3U;

import java.util.Scanner;

public class CreateMethodsFunction {   
	//1st Method (function) to add numbers and calculate sum (return value)
	public static int addAndOut (int n1, int n2) {
		
		int sum=n1+n2;
		return(sum);
	} 
	//2nd method (function) to multiply numbers and calculate product (return value)
	public static int multAndOut (int n1, int n2) {
		
		int product=n1*n2;
		return(product);
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);    

        int num1, num2, sumOfBoth;   
        //getting numbers from the user
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();       

        System.out.println("Enter the second number:");
        num2 = sc.nextInt();         

        sumOfBoth=addAndOut(num1, num2);
        //output of the value from the 1st method
        System.out.println(sumOfBoth);
        //output of the value from the 2nd method
        System.out.println(multAndOut(num1, num2));   
    } 
}
