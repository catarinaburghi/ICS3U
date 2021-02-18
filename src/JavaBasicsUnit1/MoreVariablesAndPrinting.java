package JavaBasicsUnit1;

/*Catarina Burghi
 * Date: February 17th 2021
 * This is the program to print 
 * a bunch of information about the user*/
public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Catarina F. Burghi";
        int age = 15;
        double heightInches = 64;
        double weightPounds = 132;
        double heightCentimeters = inchesToCentimeters(heightInches);
        double weightKilograms = poundsToKilos(weightPounds);
        String eyes = "Green";
        String teeth = "White";
        String hair = "Brown";

        System.out.println(String.format("Let's talk about %s.", name));
        System.out
                .println(String.format("She's %.2f inches tall. (%.2f centimeters)", heightInches, heightCentimeters));
        System.out.println(String.format("She's %.2f pounds heavy. (%.2f Kilograms)", weightPounds, weightKilograms));
        System.out.println("Actually, that's too heavy.");
        System.out.println(String.format("She's got %s eyes and %s hair.", eyes, hair));
        System.out.println(String.format("Her teeth are usually %s depending on the coffee.", teeth));

        // This line is tricky; try to get it exactly right.
        System.out.println(String.format("If I add %d, %.2f, and %.2f, I get %.2f", age, heightInches, weightPounds,
                ((double) age + heightInches + weightPounds)));

    }

    /**
     * converts inches to centimeters
     * 
     * @param value value in inches
     * @return value in centimeters
     */
    private static double inchesToCentimeters(double value) {
        return value * 2.54;
    }

    /**
     * converts pounds to kilograms
     * 
     * @param value value in pounds
     * @return value in kilograms
     */
    private static double poundsToKilos(double value) {
        return value * 2.205;

    }
}
