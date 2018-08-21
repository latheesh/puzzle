package com;

import java.util.Arrays;
import java.util.HashMap;

public class FindCommonElementsInMap {
    static int[] findCommoElements(int[][] map) {
        HashMap<Integer, Integer> commonElements = new HashMap<>();
        for (int column = 0; column < map[0].length; column++) {
            commonElements.put(map[0][column], 1);
        }

        for (int row = 1; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                boolean isDuplicate = false;
                for (int i = column + 1; i < map[row].length; i++) {
                    //System.out.println("row " + row + " column " + column + " i  " + i);
                    if (map[row][column] == map[row][i])
                        isDuplicate = true;
                }
                if (!isDuplicate) {
                    commonElements.compute(map[row][column], (integer, integer2) -> {
                        if (integer2 == null) {
                            return 1;
                        } else {
                            return integer2 + 1;
                        }
                    });
                }
            }
        }
        int[] ints = commonElements.keySet().stream().filter(integer -> commonElements.get(integer) == map.length).mapToInt(Integer::intValue).toArray();
        return ints;
    }

    public static void main(String[] args) {
        int mat[][] =
                {
                        {7, 1, 3, 5, 3, 6},
                        {2, 3, 6, 1, 1, 6},
                        {6, 1, 7, 2, 1, 4},
                        {6, 6, 7, 1, 3, 3},
                        {5, 5, 6, 1, 5, 4},
                        {3, 5, 6, 2, 7, 1},
                        {4, 1, 4, 3, 6, 4},
                        {4, 6, 1, 7, 4, 3}
                };

        System.out.println("findCommoElements(mat) = " + Arrays.toString(findCommoElements(mat)));
    }
}
