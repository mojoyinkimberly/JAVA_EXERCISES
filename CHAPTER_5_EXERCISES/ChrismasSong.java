package chapterFive;
import java.util.Scanner;
public class ChrismasSong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter day");
        int day = input.nextInt();
        String days = "";

        switch (day) {
            case 1 -> days = "first";

            case 2 -> days = "second";

            case 3 -> days = "third";

            case 4 -> days = "fourth";

            case 5 -> days = "fifth";

            case 6 -> days = "sixth";

            case 7 -> days = "seventh";

            case 8 -> days = "eighth";

            case 9 -> days = "ninth";

            case 10 ->days = "tenth";

            case 11 ->days = "eleventh";

            case 12 ->days = "twelfth";

        }

        System.out.println("On the " + days + " day of Christmas, My true love sent to me");

        switch(day) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a milking");
            case 7:
                System.out.println("Seven swans a swimming");
            case 6:
                System.out.println("Six geese a laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three french hens");
            case 2:
                System.out.println("Two turtle doves and ");
            case 1:
                System.out.println("A partridge in a pear tree");
                break;

        }
    }
}