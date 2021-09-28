package chapterSeven;

public class InitArray {
    public static void main(String[] args) {
     int[] array = new int[10];
        System.out.printf("%s%12s%n","Index","Value");
        for(int counter=0;counter< array.length;counter++){
            System.out.printf("%5d%12d%n",counter,array[counter]);
        }
    }
}
