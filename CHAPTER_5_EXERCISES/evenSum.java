package chapterFive;

public class evenSum {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 2; number <= 20; number = number + 2) {
            total += number;
            System.out.printf("sum is %d%n ", total);

        }
    }
}