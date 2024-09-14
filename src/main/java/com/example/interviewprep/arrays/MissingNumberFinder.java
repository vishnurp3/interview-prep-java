package com.example.interviewprep.arrays;

/**
 * Utility class to find the missing number in an array of distinct integers.
 * The numbers are expected to be in the range from 1 to n, where one number is missing.
 */
public class MissingNumberFinder {

    /**
     * Finds the missing number from the array.
     *
     * @param numbers an array containing n-1 distinct integers in the range 1 to n
     * @param n       the total number of elements including the missing one
     * @return the missing number
     */
    public int findMissingNumber(int[] numbers, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : numbers) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}
