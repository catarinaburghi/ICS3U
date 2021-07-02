package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;
/*Catarina Burghi
*Date March 3rd 2021
*This program is supposed to calculate how much
*someone is spending, it calculates the total, subtotal and tax.
*/

import java.util.Scanner;

public class Sales {
    //Variables that don't change
     private static final double USBPRICE = 19.99;
     private static final double KEYBOARDPRICE = 49.99;
     private static final double MOUSEPRICE = 25.99;
     private static final double TAX_PERCENT = 0.13;
        
    public static void main(String[] args) {
        //Declared Variables
        Scanner sc = new Scanner(System.in);
        double tax = TAX_PERCENT;
        double total = KEYBOARDPRICE + MOUSEPRICE + USBPRICE;
        double totaltax = total*tax;
        double total1 = total+totaltax;
        double numofkb;
        double numofm;
        double numusb;

        numofkb = KEYBOARDPRICE;
        numofm = MOUSEPRICE;
        numusb = USBPRICE;

        System.out.println("Please select the number of Keyboards: ");
        numofkb = sc.nextDouble();
        System.out.println("Please select the number of mouses: ");
        numofm = sc.nextDouble();
        System.out.println("Please select the number of USB's");
        numusb = sc.nextDouble();

        System.out.println("Your subtotal without taxes is: "+total);
        System.out.println("Your tax total is: "+totaltax);
        System.out.println("Your total is: "+total1);
        



    }

}
