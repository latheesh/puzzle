package com;

import java.time.Clock;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DistinctPairs {
    static int distinctPairs(int[] a, int K) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            integers.add(i1);
        }

        int[] ints = integers.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();

        Arrays.sort(ints);

        HashSet<String> distinctPairs = new HashSet<>();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if(ints[i] + ints[j] > K)
                    break;
                if (ints[i] + ints[j] == K) {
                    int first = Math.min(ints[i], ints[j]);
                    int second = Math.max(ints[i], ints[j]);
                    distinctPairs.add(first + ":" + second);
                }
            }
        }

        return distinctPairs.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 1, 9};
        int[] b = null;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

        Clock clock = Clock.systemDefaultZone();
        long start = clock.millis();
        int[] ints = integers.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("distinctPairs(a,10000) = " + distinctPairs(a, 10));

        System.out.println("distinctPairs(a,10000) = " + distinctPairs(ints, 5000));
        long end = clock.millis();
        System.out.println("(end -start) = " + (end - start));
    }
}
