package chapterFive;
//import java.util.Scanner;
public class dayOfTheWeek {
    //public static void main(String[] args) {
     //   int day = 0;
        //       Scanner input = new Scanner(System.in);
        //      System.out.println("Enter number between 0 and 6");
        //      day = input.nextInt();
//        printDayOfTheWeek(-1);
//        printDayOfTheWeek(0);
//        printDayOfTheWeek(1);
//        printDayOfTheWeek(2);
//        printDayOfTheWeek(3);
//        printDayOfTheWeek(4);
//        printDayOfTheWeek(5);
//        printDayOfTheWeek(6);
//        printDayOfTheWeek(7);
//
//    }
//    private static void printDayOfTheWeek(int day){
//        switch (day) {
//            case 0:
//                System.out.println("day is Sunday");
//                break;
//            case 1:
//                System.out.println("day is Monday");
//                break;
//            case 2:
//                System.out.println("day is Tuesday");
//                break;
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Day is either Wednesday,Thursday,Friday or Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
//    }

 //   }

    public static void main(String[] args) {
        int day = 0;
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }
    private static void printDayOfTheWeek(int day){
    if(day == 0){
        System.out.println("Day is Sunday");
    }else if(day == 1) {
        System.out.println("Day is Monday");
    }else if(day == 2){
        System.out.println("Day is Tuesday");
    }else if(day == 3){
        System.out.println("Day is Wednesday");
    }else if(day == 4){
        System.out.println("Day is Thursday");
    }else if(day == 5){
        System.out.println("Day is Friday");
    }else if(day == 6) {
        System.out.println("Day is Saturday");
    } else {
        System.out.println("Invalid day");
    }
}
}