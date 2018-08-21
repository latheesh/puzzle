package com;

import java.util.Arrays;

public class LargestSubsetSum {
    static long[] maxSubsetSum(int[] k) {
        long[] subset = new long[k.length];

        for (int i = 0; i < k.length; i++) {
            long subSetSum = 0;
            int LCM = k[i];
            for (int j = 1; j <= LCM; j++) {
                if (LCM % j == 0) {
                    subSetSum += j;
                }
            }
            subset[i] = subSetSum;
        }
        return subset;
    }

    public static void main(String[] args) {
        int[] k = {2, 4};
        System.out.println("maxSubsetSum(k) = " + Arrays.toString(maxSubsetSum(k)));
    }
}
