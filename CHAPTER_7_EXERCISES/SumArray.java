package chapterSeven;

public class SumArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int total=0;
        for(int counter=0;counter< array.length;counter++)
            total+=array[counter];
        System.out.println("Sum of array elements: "+ total);
    }
}
