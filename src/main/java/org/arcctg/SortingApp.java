package org.arcctg;

import java.util.Arrays;

/**
 * <p>SortingApp is a command-line application that sorts up to ten integers provided as arguments.</p>
 *
 * <p>If the number of arguments exceeds ten, or if the arguments contain non-integer values,
 * the application displays an appropriate error message.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * -jar sorting-app-project-1.0-SNAPSHOT.jar 3 1 2
 * Sorted numbers: [1, 2, 3]
 *
 * -jar sorting-app-project-1.0-SNAPSHOT.jar 10
 * Sorted numbers: [10]
 *
 * -jar sorting-app-project-1.0-SNAPSHOT.jar
 * Please provide integers to sort.
 *
 * -jar sorting-app-project-1.0-SNAPSHOT.jar 5 4 a
 * Please provide only integer values.
 *
 * -jar sorting-app-project-1.0-SNAPSHOT.jar 1 2 3 4 5 6 7 8 9 10 11
 * Please provide up to 10 integers.
 * </pre>
 */
public class SortingApp {
    /**
     * The main method sorts the command-line arguments if they are valid integers and prints the sorted list.
     *
     * @param args the command-line arguments, which should be integer values (up to 10 values)
     *             that will be sorted in ascending order.
     * @throws NumberFormatException if any of the command-line arguments cannot be parsed as an integer.
     */
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
