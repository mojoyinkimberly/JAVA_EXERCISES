package chapterNine;

import static org.junit.jupiter.api.Assertions.*;

class BmiTest {
    public static void main(String[] args) {
Bmi bmi= new Bmi("kim",18,120,70);
        System.out.println("The Bmi for "+ bmi.getName()+  " " + "is: "+ bmi.getBmi() + " " + bmi.getStatus());
    }

}