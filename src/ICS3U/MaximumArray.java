package ICS3U;
import java.util.Scanner;
public class MaximumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //asks user input for the size of the array

        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        //asks user to input elements for the array

        int [] array = new int [size];
		System.out.println("Enter array elements: ");
		for (int i=0; i<size; i++) {
            array [i]=sc.nextInt();
		}
		
		int max=array[0];
		
		for (int i=1; i<array.length; i++) {
			
			if (array[i]>max) {
				max=array[i];
			}
		}
		System.out.print("Maximum value is: " + max);

	}

    
}
