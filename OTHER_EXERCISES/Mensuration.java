import java.util.Scanner;
public class Mensuration{
public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	Mensuration object = new Mensuration();


//object.findingVolume(5.5);
//object.findingArea(12);

    System.out.println("Enter radius");
    double radius = scan.nextDouble();
    
    System.out.println("Enter length");
    double length = scan.nextDouble();


double finalVolume = object.findingArea(radius);
double finalArea = object.findingVolume(length);
System.out.println(finalArea);
System.out.println(finalVolume);

}


private double area;


public double findingArea(double radius){
 
 area = radius * radius * (22/7.0);
 
 return area;
 }
 
 public double findingVolume(double length){
 
 double volumeResult = area * length;
 
 return volumeResult;
 }
 }













