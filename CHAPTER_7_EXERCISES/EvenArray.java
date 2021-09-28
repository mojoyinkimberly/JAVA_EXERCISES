package chapterSeven;

public class EvenArray {
    public static void main(String[] args) {
//        int[] array= new int[10];
//        System.out.printf("%s%12s%n","Index","Value");
//        for(int counter=0;counter<array.length;counter++){
//            array[counter]=2+2*counter;
//            System.out.printf("%d%12d%n",counter,array[counter]);
//        }
//
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
        System.out.printf("%s%12s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%12d%n", counter, array[counter]);

    }
}

