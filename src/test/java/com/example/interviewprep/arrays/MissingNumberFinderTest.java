package com.example.interviewprep.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MissingNumberFinderTest {

    private final MissingNumberFinder finder = new MissingNumberFinder();

    static Object[][] testCases() {
        return new Object[][] {
                { new int[]{1, 2, 4, 5, 6}, 6, 3 },
                { new int[]{2, 3, 4, 5}, 5, 1 },
                { new int[]{1, 3, 4, 5, 6}, 6, 2 }
        };
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testFindMissingNumber(int[] numbers, int n, int expected) {
        assertEquals(expected, finder.findMissingNumber(numbers, n));
    }
}
