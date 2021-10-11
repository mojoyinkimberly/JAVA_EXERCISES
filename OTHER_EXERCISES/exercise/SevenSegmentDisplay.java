package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {
    private static Scanner input = new Scanner(System.in);
    private static int[] array = new int[8];

    private static int[][] segmentArray = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};

    public static void display() {
        for (int[] rows : segmentArray) {
            for (int columns : rows) {
                if (columns == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void setScreen() {
//        if (Integer.parseInt(String.valueOf(userInput.charAt(7))) == 1) {
        if (array[7] == 1) {
            setScreen1();
            setScreen2();
            setScreen3();
            setScreen4();
            setScreen5();
            setScreen6();
            setScreen7();
        } else {
            clearScreen();
        }

    }
    public static void setScreen1() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
        //       if (Integer.parseInt(String.valueOf(userValue.charAt(1))) == 1) {
        if (array[7] == 1) {
            if (array[0] == 1) {
                segmentArray[0][0] = 1;
                segmentArray[0][1] = 1;
                segmentArray[0][2] = 1;
                segmentArray[0][3] = 1;
//        }
            }
            if (array[0] == 0) {
                segmentArray[0][0] = 0;
                segmentArray[0][1] = 0;
                segmentArray[0][2] = 0;
                segmentArray[0][3] = 0;
            }
        }
    }

    public static void setScreen2() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
//        if (Integer.parseInt(String.valueOf(userValue.charAt(2))) == 1) {
            if (array[1] ==1) {
            segmentArray[0][3] = 1;
            segmentArray[1][3] = 1;
            segmentArray[2][3] = 1;
        }
        if (array[1] ==0) {
            segmentArray[0][3] = 0;
            segmentArray[1][3] = 0;
            segmentArray[2][3] = 0;
        }
    }


    public static void setScreen3() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
//        if (Integer.parseInt(String.valueOf(userValue.charAt(3))) == 1) {
        if (array[2] ==1) {
            segmentArray[2][3] = 1;
            segmentArray[3][3] = 1;
            segmentArray[4][3] = 1;
        }
        if (array[2] ==0) {
            segmentArray[2][3] = 0;
            segmentArray[3][3] = 0;
            segmentArray[4][3] = 0;
        }
    }


    public static void setScreen4() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
//        if (Integer.parseInt(String.valueOf(userValue.charAt(4))) == 1) {
        if (array[3] ==1) {
            segmentArray[4][0] = 1;
            segmentArray[4][1] = 1;
            segmentArray[4][2] = 1;
            segmentArray[4][3] = 1;
        }
        if (array[3] ==0) {
            segmentArray[4][0] = 0;
            segmentArray[4][1] = 0;
            segmentArray[4][2] = 0;
            segmentArray[4][3] = 0;
        }

    }

    public static void setScreen5() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
//        if (Integer.parseInt(String.valueOf(userValue.charAt(5))) == 1) {
        if (array[4] ==1) {
            segmentArray[2][0] = 1;
            segmentArray[3][0] = 1;
            segmentArray[4][0] = 1;

        }
        if (array[4] ==0) {
            segmentArray[2][0] = 0;
            segmentArray[3][0] = 0;
            segmentArray[4][0] = 0;
        }
        }

    public static void setScreen6() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
//        if (Integer.parseInt(String.valueOf(userValue.charAt(6))) == 1) {
        if (array[5] ==1) {
            segmentArray[0][0] = 1;
            segmentArray[1][0] = 1;
            segmentArray[2][0] = 1;

        }
        if (array[5] ==0) {
            segmentArray[0][0] = 0;
            segmentArray[1][0] = 0;
            segmentArray[2][0] = 0;
        }

    }

    public static void setScreen7() {
//        System.out.println("enter your number");
//        String userNumber = input.nextLine();
//        if (Integer.parseInt(String.valueOf(userValue.charAt(7))) == 1) {
        if (array[6] ==1) {
            segmentArray[2][0] = 1;
            segmentArray[2][1] = 1;
            segmentArray[2][2] = 1;
            segmentArray[2][3] = 1;
        }
        if (array[6] ==0) {
            segmentArray[2][0] = 0;
            segmentArray[2][1] = 0;
            segmentArray[2][2] = 0;
            segmentArray[2][3] = 0;
        }

    }

    public static void clearScreen() {
        for (int[] row : segmentArray) {
            Arrays.fill(row, 0);
        }
    }
    public static void collectUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter eight binary numbers");
        String userInput = input.nextLine();
        for(int i = 0; i< userInput.length();i++) {
            array[i] = Integer.parseInt(String.valueOf(userInput.charAt(i)));
        }





        }
    }
