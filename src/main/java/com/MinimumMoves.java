package com;

import java.util.List;

public class MinimumMoves {

    public static int moves(List<Integer> a, List<Integer> m){
        int moves = 0;
        for (int i =0; i < a.size(); i++){
            int number = a.get(i);
            int target = m.get(i);

            while (number > 0) {
                int aInt = number %10;
                int mInt = target %10;
                int move = Math.abs(aInt - mInt);
                moves += move;
                number /= 10;
                target /= 10;
            }

        }
        return moves;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1225, 3245);
        List<Integer> m = List.of(8999, 9999);
        int moves = MinimumMoves.moves(a, m);
        System.out.println("moves = " + moves);

    }
}
