//Ask user to enter a five digit number
//Check number
//While number is !>=10000 && number !<= 99999
//      display "enter five digits number only"
//if first number == fifth number && second number == fifth number
//      display "this is a palindrome"
//  else
//      display "this is not a palindrome"
package chapterFour;
import java.util.Scanner;
public class FourPointThreeZERO {
    public static void main(String[] args) {

        int number;
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number");
        number = input.nextInt();

        while (!((number >= 10000) && (number <= 99999))) {

            System.out.print("Enter five digit numbers only");
            number = input.nextInt();

        }
        firstNumber = number % 10;
        number = number / 10;

        secondNumber = number % 10;
        number = number / 10;

        thirdNumber = number % 10;
        number = number / 10;

        fourthNumber = number % 10;
        number = number / 10;

        fifthNumber = number;

        if((firstNumber == fifthNumber) && (secondNumber == fourthNumber)){
            System.out.print("This is a palindrome");

        } else{
            System.out.print("This is not a palindrome");

        }

    }



}