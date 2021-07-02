package JavaBasicsUnit1.JavaBasicsUnit1.Lesson_3;

import java.util.Scanner;

public class ScannerStringPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1, word2, together;

        System.out.println("Enter the first word: ");
        word1 = sc.nextLine();

        System.out.println("Enter the second word: ");
        word2 = sc.nextLine();

        together = word1 + word2;

        System.out.println("Both words together: ");
        together = sc.nextLine();

    }

}
