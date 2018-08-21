package com;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class CountingGroups {
    static int[] countGroups(int[][] m, int[] t) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.stream(t).forEach(value -> map.put(value, 0));

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                if (m[r][c] == 1) {
                    int groupSize = computeSize(m, r, c);
                    System.out.println("Group size " + groupSize);
                    map.computeIfPresent(groupSize, (integer, integer2) -> integer2 + 1);
                }
            }
        }
        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }

    static int computeSize(int[][] m, int row, int col) {
        if (row >= 0 && col >= 0 && row < m.length && col < m[row].length) {

        }

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
    }
}
