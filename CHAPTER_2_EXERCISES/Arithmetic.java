// exercise 2.15
import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first integer");
	int num1 = input.nextInt();
	
	System.out.println("Enter the second integer");
	int num2 = input.nextInt();
	
	int sum = num1 + num2;
	int product = num1 * num2;
	int difference = num2 - num1;
	int quotient = num2/num1;
	
	System.out.printf("sum - %d%nproduct - %d%ndifference- %d%nquotient-%d%n", sum, product, difference, quotient);
	








}













}
