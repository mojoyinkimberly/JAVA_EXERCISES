package CHAPTER_17_EXERCISES;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        //display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));
        //strings in uppercase
        System.out.printf(" strings in uppercase: %s%n",
                Arrays.stream(strings)
                      .map(String::toUpperCase)
                      .collect(Collectors.toList()));

        //strings less than "n" (case insensitive ) sorted ascending
        System.out.printf(" strings less than n sorted in ascending: %s%n",
                  Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") <  0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));

        //strings less than "n" (case insensitive) sorted descending
        System.out.printf(" strings less than n sorted in descending: %s%n",
                  Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") <  0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));


    }
}
