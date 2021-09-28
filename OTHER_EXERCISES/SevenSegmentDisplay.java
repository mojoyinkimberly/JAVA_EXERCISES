package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {

    public static void main(String[] args) {
        int[][] segmentArray = getSegmentArray();
        display(segmentArray);
    }

    private static void display(int[][] segmentArray) {
        for (int[] rows : segmentArray) {
            for (int columns : rows) {
                if (columns == 1) {
                    System.out.print(columns + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] getSegmentArray() {
        Scanner input = new Scanner(System.in);
//        int[][] segmentArray = new int[5][4];
        return new int[][]{{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
    }
}