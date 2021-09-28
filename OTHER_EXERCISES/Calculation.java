import java.util.Scanner;

public class Calculation{
	public static void main(String[] args){
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println(" Enter radius value- ");
		double radius = inputValue.nextDouble();
		
		System.out.println(" Enter length value- ");
		double length = inputValue.nextDouble();

		double area = radius * radius * (22.0/7);
		double volume = area * length;

		System.out.printf( " %f is the value for area, %f is the value for volume ", area , volume );





}

}
