package exercises;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int month = 1; month <= 3; month++) {
           amount -= ((0.1) * amount);
        }
        System.out.println(amount);
    }
}

