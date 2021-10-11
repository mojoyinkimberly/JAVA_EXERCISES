//Ask user to input five numbers
package chapterFour;
import java.util.Scanner;

public class FourPointTwoThree {
    public static void main(String[] args) {
        int number;
        int largestNumber = 0;
        int largerNumber = 0;
        Scanner input = new Scanner(System.in);

        for (int num = 1; num <= 10; num++) {
            System.out.println("Enter number " + num);
            number = input.nextInt();

            if (num == 1) {
                largestNumber = number;
            }
            if (number > largestNumber) {
                largerNumber = largestNumber;
                largestNumber = number;
            } else {
                if (number > largerNumber) {
                    largerNumber = number;
                }
            }
        }
        System.out.println("largest number is: " + largestNumber);
        System.out.println("larger number is: " + largerNumber);
    }
}


//Ask user to enter a number
//declare first number entered as largest
//if number entered is greater than the largest number
    //largest number is now the larger number
    //number is now the largest number
//else
    //if number entered is greater than the second largest number
    //number is the second largest number which is the larger number



