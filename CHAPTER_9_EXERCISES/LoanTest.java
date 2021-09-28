package chapterNine;
import java.util.Scanner;
public class LoanTest {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter annual interest rate: ");
        double annualInterest = input.nextDouble();
        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Enter the loan amount: ");
        double loanAmount = input.nextDouble();
        Loan loan = new Loan(annualInterest,numberOfYears,loanAmount);
        System.out.println("Your monthly payment is: " + loan.getMonthlyPayment());
        System.out.println("Your total payment is: " + loan.getTotalPayment());
    }
}
