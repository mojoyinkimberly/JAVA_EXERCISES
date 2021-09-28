package chapterSeven;
import java.util.*;

public class ScoreArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] scores;
        scores =new int[10];
        int i;
        int sum=0;
        double average=0;
        int minimumNumber=0;
        int maximumNumber=0;

        for( i = 0; i < 10; i++){
            System.out.printf("Enter score"  + "%d:%n", i+1);
            scores[i] = input.nextInt();

            System.out.println(Arrays.toString(scores));
            sum=sum + scores[i];
            average = sum/10.0;

           minimumNumber = scores[0];
            if (scores[i]< minimumNumber) {
                minimumNumber= scores[i];
            }

            if (scores[i]>maximumNumber) {
                maximumNumber= scores[i];
            }
        }

        System.out.println("the sum is " + sum);
        System.out.println("the average is " + average);
        System.out.println("the minimum number is " + minimumNumber);
        System.out.println("the maximum number is " + maximumNumber);
    }
    }




