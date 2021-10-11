package chapterFour;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number " + ":");
        number = input.nextInt();

        for (int counter = 2; counter <= number / 2; counter++) {

            if(number % counter == 0){
                System.out.println("this is not a prime number");
                break;
            } else {
                System.out.println("this is a prime number");
               break;
            }
        }

    }

}
