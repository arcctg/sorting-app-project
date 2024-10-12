package org.arcctg;

import java.util.Arrays;

/**
 * SortingApp is a command-line application that sorts up to ten integers.
 */
public class SortingApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide integers to sort.");
            return;
        } else if (args.length > 10) {
            System.out.println("Please provide up to 10 integers.");
            return;
        }

        try {
            int[] numbers = Arrays.stream(args)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Arrays.sort(numbers);
            System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        } catch (NumberFormatException e) {
            System.out.println("Please provide only integer values.");
        }
    }

    public static String handleArguments(String[] args) {
        if (args.length == 0) {
            return "Please provide integers to sort.";
        } else if (args.length > 10) {
            return "Please provide up to 10 integers.";
        }

        try {
            int[] numbers = Arrays.stream(args)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Arrays.sort(numbers);

            return "Sorted numbers: " + Arrays.toString(numbers);
        } catch (NumberFormatException e) {
            return "Please provide only integer values.";
        }
    }
}
