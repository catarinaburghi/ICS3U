/*Catarina F. Burghi
*March 30th 2021
*This program displays a menu that the user can pick between 4 options
*depending on what the user picked on the menu it asks the user to input a number 
* (or maybe a number and a power), and outputs the correct answer.
 */
package ICS3U;

import java.util.Scanner;
import java.lang.Math;

public class whileloop {
    public static void main(String[] args) {
        //declaring my variables
        Scanner sc = new Scanner(System.in);
        double selection;
        double inputnum;
        double z;
        //do-while loop
        do {
            System.out.println("1- Find the value of a number squared");
            System.out.println("2- Find the value of a cubed number");
            System.out.println("3- Find the value of a number, to any power");
            System.out.println("4- Goodbye!");
            System.out.println("Please select a number: ");
            selection = sc.nextDouble();
            //if statements 
            if (selection == 1) {

                System.out.println("Please enter a number: ");
                inputnum = sc.nextDouble();

                inputnum = inputnum * inputnum;
                System.out.println(inputnum);

            } else if (selection == 2) {

                System.out.println("Please enter a number: ");
                inputnum = sc.nextDouble();

                inputnum = inputnum * inputnum * inputnum;
                System.out.println(inputnum);

            } else if (selection == 3) {

                System.out.println("Please enter a number: ");
                inputnum = sc.nextInt();
                System.out.println("Please enter the power: ");
                z = sc.nextInt();
               //Math.pow 
                System.out.println(Math.pow(inputnum, z));
            } else if (selection == 4) {

                System.out.println("Goodbye!");
            }

        } while (selection != 4);
    }
}
