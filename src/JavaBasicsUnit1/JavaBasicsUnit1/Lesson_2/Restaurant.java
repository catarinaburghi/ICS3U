package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_2;
/*Catarina Burghi
 *Date: February 17th 2021 
 *Calculating the 
 *Tax, Tip and Total of a bill */

public class Restaurant {
    // these are constant values
    private static final double PRICE = 28.93;
    private static final double TAX_PERCENT = 0.13;
    private static final double TIP_PERCENT = 0.1;

    public static void main(String[] args) {
        double tax = PRICE * TAX_PERCENT;
        double tip = PRICE * TIP_PERCENT;
        double total = PRICE + tip + tax;
        System.out.println(String.format("Meal Price $%.2f", PRICE));
        System.out.println(String.format("Tax $%.2f", tax));
        System.out.println(String.format("Tip $%.2f", tip));
        System.out.println(String.format("Total $%.2f", total));
    }

}
