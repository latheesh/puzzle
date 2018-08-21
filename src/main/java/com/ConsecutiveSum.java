package com;

import java.util.Scanner;

public class ConsecutiveSum {

    static int consecutive(long num) {
        int count = 0;
        long sum = 0;
        for (long index = 1; index <= (num / 2) + 1; index++) {
            sum = 0;
            for (long sumIndex = index; sumIndex <= (num / 2) + 1; sumIndex++) {
                sum += sumIndex;
                if (sum == num) {
                    ++count;
                    break;
                } else if (sum > num) {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = Long.parseLong(in.nextLine());
        System.out.println(consecutive(num));
    }
}
