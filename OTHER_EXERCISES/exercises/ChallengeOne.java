package exercises;

import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a sentence");
        String inputString = input.nextLine();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
