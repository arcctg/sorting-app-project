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
                {new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"},
                        "Please provide up to 10 integers."}
        });
    }
}
