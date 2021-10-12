package exercises;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word containing a maximum of ten letters: ");
        String word1 = input.next();
        System.out.println("Enter first number between 0 and 999: ");
        int num1 = input.nextInt();
        System.out.println("Enter second word containing a maximum of ten letters: ");
        String word2 = input.next();
        System.out.println("Enter second number between 0 and 999: ");
        int num2 = input.nextInt();
        System.out.println("Enter third word containing a maximum of ten letters: ");
        String word3 = input.next();
        System.out.println("Enter third number between 0 and 999: ");
        int num3 = input.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s%03d%n%-15s%03d%n%-15s%03d%n", word1, num1, word2, num2, word3, num3);
        System.out.println("================================");
    }
}
