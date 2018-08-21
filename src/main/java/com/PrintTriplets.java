package com;

import java.util.Arrays;

public class PrintTriplets {
    static void printTriplets(int[] nums, int K) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] <= K) {
                        System.out.println("(" + nums[i] + "," + nums[j] + "," + nums[k] + ")");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 9, 5, 1, 3};
        printTriplets(nums, 10);
    }
}
