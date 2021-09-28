//exercise 2.17
import java.util.Scanner; 

	public class ArithSmall{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first integer");
	int num1 = input.nextInt();
	
	System.out.println("Enter the second integer");
	int num2 = input.nextInt();
	
	System.out.println("Enter the third integer");
	int num3 = input.nextInt();
	
	int sum = (num1 + num2 + num3);
	System.out.println("the sum is - " + sum);
	
	int average = ((num1 + num2 + num3)/3);
	System.out.println("the average is - " + average);
	
	int product = (num1 * num2 * num3);
	System.out.println("the product is - " + product);
	
	 	if (num1 < num2 && num1 < num3){
		System.out.println(num1+ " is the smallest");
}
		if (num2 < num1 && num2 < num3){
		System.out.println(num2+ " is the smallest");
}		
		if (num3 < num1 && num3 < num2){
		System.out.println(num3+ " is the smallest");
}

		if (num1 > num2 && num1 > num2){
		System.out.println(num1+ " is the largest");
}		
		if (num2 > num1 && num2 > num3){
		System.out.println(num2+ " is the largest");
}		
		if (num3 > num1 && num3 > num2){
		System.out.println(num3+ " is the largest");
}












}






}




