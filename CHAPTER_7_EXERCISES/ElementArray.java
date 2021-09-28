package chapterSeven;

public class ElementArray {
    public static void main(String[] args) {
        int[] array={32,27,64,18,95,45,34,23,12,32};
        System.out.printf("%s%12s%n","Index","Value");
        for(int counter=0;counter< array.length;counter++) {
            System.out.printf("%5d%12d%n",counter,array[counter]);
        }
        }

}
