package org.arcctg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortingAppTest {
    private final String[] input;
    private final String expectedOutput;

    public SortingAppTest(String[] input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void testSortingApp() {
        assertEquals(expectedOutput, SortingApp.handleArguments(input));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{}, "Please provide integers to sort."},
                {new String[]{"5"}, "Sorted numbers: [5]"},
                {new String[]{"10", "3", "7"}, "Sorted numbers: [3, 7, 10]"},
                {new String[]{"19", "1", "68", "24", "5"},
                        "Sorted numbers: [1, 5, 19, 24, 68]"},
                {new String[]{"9", "-3", "12", "5", "0", "-8", "14", "-1", "7"},
                        "Sorted numbers: [-8, -3, -1, 0, 5, 7, 9, 12, 14]"},
                {new String[]{"12", "5", "0", "-1", "7", "9", "-3", "-8", "14", "1"},
                        "Sorted numbers: [-8, -3, -1, 0, 1, 5 7, 9, 12, 14]"},
                {new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "11"}, "Please provide up to 10 integers."},
                {new String[]{"3", "4", "15", "-6", "2", "8", "9", "-7", "1",
                        "0", "13"}, "Please provide up to 10 integers."},
                {new String[]{"10", "-5", "20", "3", "-2", "7", "4", "6", "-1",
                        "8", "-9", "2", "13", "0", "11"},
                        "Please provide up to 10 integers."},
                {new String[]{"1", "2", "a", "4"},
                        "Please provide only integer values."},
                {new String[]{"5", "b", "3"},
                        "Please provide only integer values."},
                {new String[]{"@", "7", "8"},
                        "Please provide only integer values."}
        });
    }
}
