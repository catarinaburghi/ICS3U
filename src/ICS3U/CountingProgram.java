/*Catarina Burghi
*March 18th 2021
*This program asks the user to pick one of the given options
*and then it peforms the task using if statements and for loops
*/
package ICS3U;
import java.util.Scanner;
public class CountingProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int x;
        // menu with options
        System.out.println("---Cool Counting Program---");
        System.out.println(" ");
        System.out.println("Please enter your choice:");
        System.out.println("1... Count to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        x = sc.nextInt();

        //if statements and for loops
        if (x==1){
            System.out.println("---");
            System.out.println("You have chosen to count from 1 to 10 by 1: ");
            for (int i = 1; i<=10; i = i +1){
                System.out.println(i);

            }
            
        }else if (x==2){
            System.out.println("---");
            System.out.println("You have chosen to count from 100 to 0 by 10: ");
            for (int j = 100; j>= 0; j=j -10){
                System.out.println(j);
            }
        }else if (x==3){
            System.out.println("---");
            System.out.println("You have chosen to count from 50 to 500 by 50: ");
            for (int k = 50; k<=500; k=k +50){
                System.out.println(k);
            }
        }else if (x==4){
            System.out.println("---");
            System.out.println("You have chosen to count from 6000 to 1000 by 1000: ");
            for (int i = 6000; i>=1000; i=i -1000){
                System.out.println(i);
            }
        }




    }
    
}
