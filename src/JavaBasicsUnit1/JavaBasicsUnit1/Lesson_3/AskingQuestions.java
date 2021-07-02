package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class AskingQuestions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		int heightfeet;
		int heightinches;
		double weight;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How tall are you in feet? ");
		heightfeet = keyboard.nextInt();

		System.out.print("How many inches? ");
		heightinches = keyboard.nextInt();

		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();

		System.out.println("So you're " + age + " old, " + heightfeet + " \" " + heightinches + "' tall and " + weight
				+ " heavy.");

	}
}