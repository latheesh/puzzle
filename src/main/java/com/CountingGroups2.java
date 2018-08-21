package com;

import java.util.Arrays;

public class CountingGroups2 {
    static int[] countGroups(int[][] m, int[] t) {
        int[] occurences = new int[t.length];
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                int value = m[r][c];
                if (value == 1) {
                    int size = computeSize(m, r, c);
                    for (int index = 0; index < t.length; index++) {
                        if (t[index] == size) {
                            occurences[index] += 1;
                        }
                    }
                }
            }
        }
        return occurences;
    }

    static int computeSize(int[][] m, int row, int col) {
        if (row < 0 || col < 0 || row >= m.length || col >= m[row].length || m[row][col] != 1) {
            return 0;
        }

        int size = 1;
        m[row][col] = -1;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (Math.abs(dr) != Math.abs(dc))
                    size += computeSize(m, row + dr, col + dc);
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[][] m =
                {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0, 0, 1, 1, 1},
                        {1, 1, 0, 0, 1, 0, 0, 1, 1, 1},
                        {1, 0, 1, 0, 0, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        int[] t = {1, 10, 20, 2, 6};
        int[] i = countGroups(m, t);
        System.out.println("i = " + Arrays.toString(i));

        m = new int[][]{{1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1}};
        t = new int[]{1, 2, 3, 4, 5};
        i = countGroups(m, t);
        System.out.println("i = " + Arrays.toString(i));

    }
}
