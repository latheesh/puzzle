package com;

import java.util.Arrays;

public class PsychometricTesting {
    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int[] jobOffers = new int[lowerLimits.length];

        for (int i = 0; i < lowerLimits.length; i++) {
            int lowerLimit = lowerLimits[i];
            int upperLimit = upperLimits[i];
            int jobOffer = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] >= lowerLimit && scores[j] <= upperLimit) {
                    ++jobOffer;
                }
            }
            jobOffers[i] = jobOffer;
        }
        return jobOffers;
    }

    public static void main(String[] args) {
        int[] scores = {4, 8, 7};
        int[] lowerLimits = {2, 4};
        int[] upperLimits = {8, 4};
        System.out.println("jobOffers(scores, lowerLimits, upperLimits) = " + Arrays.toString(jobOffers(scores, lowerLimits, upperLimits)));

        scores = new int[]{1, 3, 5, 6, 8};
        lowerLimits = new int[]{2};
        upperLimits = new int[]{6};
        System.out.println("jobOffers(scores, lowerLimits, upperLimits) = " + Arrays.toString(jobOffers(scores, lowerLimits, upperLimits)));

    }
}
