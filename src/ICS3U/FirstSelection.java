package ICS3U;
/*Catarina Burghi
*Date: March 3rd 2021
*This program calculates the savings, and the total 
*that a costumer spent at a store where they are giving discounts based
*how much you spent.
*/
import java.util.Scanner;
public class FirstSelection {
    public static void main(String[] args) {
        //Declaring my variables
        Scanner keyedInput = new Scanner(System.in);

        double spent;
        double savings;
        double total;
        
        System.out.println("Please enter the amount spent:");
        spent = keyedInput.nextDouble();

        System.out.println("You spent: "+spent);
        
        //If and else if statements 
        //and calculations
        if (spent<40){
            System.out.println("You are saving 10%");
            savings = spent*0.10;
            System.out.println("You are saving: "+savings);
            total = spent-savings;
            System.out.println("Your total is: "+total);

        }else if ((spent>40)&&(spent<80)){
            System.out.println("You are saving 20%");
            savings = spent*0.20;
            System.out.println("You are saving: "+savings);
            total = spent-savings;
            System.out.println("Your total is: "+total);

        }else if((spent>80)&&(spent<120)){
            System.out.println("You are saving 30%");
            savings = spent*0.30;
            System.out.println("You are saving: "+savings);
            total = spent-savings;
            System.out.println("Your total is: "+total);

        }else if (spent>120){
            System.out.println("You are saving 40%");
            savings = spent*0.40;
            System.out.println("You are saving: "+savings);
            total = spent-savings;
            System.out.println("Your total is: "+total);
        }
    }
}
