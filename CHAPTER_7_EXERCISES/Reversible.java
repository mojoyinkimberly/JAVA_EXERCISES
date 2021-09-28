package chapterSeven;
import java.util.Scanner;
public class Reversible{
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        name = input.nextLine();
        reverseWithLoop(name);
    }

    private static void reverseWithLoop(String name) {
        for(int i= name.length();i>0;i--){
            System.out.print(name.charAt(i-1));

        }
    }

}


