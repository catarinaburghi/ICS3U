package ICS3U;
import java.util.Scanner;

public class DLicense {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		final int LICENSE_AGE=16;
		
		System.out.println ("Enter your age: ");
		int age=sc.nextInt();
		
		if (age>=LICENSE_AGE) {
		
		System.out.println("You are old enough to get your drivers license!");
		} else {
			System.out.println("Sorry, you are not old enough to get your drivers license.");
		}
	}
}