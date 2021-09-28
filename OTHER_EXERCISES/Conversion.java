import java.util.Scanner;
public class Conversion{
public static void main(String[] args){ 
        Scanner celciusTofahrenheit = new Scanner(System.in);
        System.out.println(" Enter value in celsius ");
             double celcius = celciusTofahrenheit.nextDouble();
             double fahrenheit = (9 / 5.0) * celcius + 32;
                  System.out.printf(" %f is the degree in fahrenheit ",fahrenheit );
}




















}
