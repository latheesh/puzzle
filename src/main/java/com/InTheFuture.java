package com;

import java.util.Scanner;

public class InTheFuture {

    static int minNum(int A, int K, int P) {
        if (P == 0 && A >= K)
            return -1;

        int ashaSum = P;
        int kellySum = 0;
        int daysCount = 0;
        while (true) {
            ++daysCount;
            ashaSum += A;
            kellySum += K;
            if (kellySum > ashaSum) {
                return daysCount;
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = Integer.parseInt(in.nextLine());
        int K = Integer.parseInt(in.nextLine());
        int P = Integer.parseInt(in.nextLine());
        System.out.println(minNum(A, K, P));
    }
}
