package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTrys {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        returnArray();
    }

    private static void returnArray() {
        int[] array=new int[10];
        for(int i=0;i< array.length;i++){
            System.out.println("Enter numbers"+(i+1));
            int number= input.nextInt();
            array[i]=number;
        }
        System.out.println("the array is: "+ Arrays.toString(array));

    }


}
