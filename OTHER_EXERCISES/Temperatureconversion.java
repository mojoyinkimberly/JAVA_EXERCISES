import java.util.Scanner;
public class Temperatureconversion{

public static void main(String[] args){
Scanner scan = new Scanner(System.in);

Temperatureconversion process = new Temperatureconversion();

System.out.println("Enter celsius value: ");
double celsius = scan.nextDouble();
//process.convertingTofahrenheit(43.0);
double finalResult = process.convertingTofahrenheit(celsius);
System.out.println(finalResult);
}

public double convertingTofahrenheit (double celsius){
	
	double result = (9/5.0) * celsius + 32;

	return result;

}













}

