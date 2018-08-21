package com;

public class FindTheWinner {
    static String winner(int[] andrea, int[] maria, String s) {
        int index = 0;
        if ("Odd".equalsIgnoreCase(s)) {
            index = 1;
        }
        int scoreAndrea = 0;
        int scoreMaria = 0;
        while (index < andrea.length) {
            scoreAndrea += andrea[index] - maria[index];
            scoreMaria += maria[index] - andrea[index];
            index += 2;
        }
        if (scoreAndrea > scoreMaria) {
            return "Andrea";
        } else if (scoreMaria > scoreAndrea) {
            return "Maria";
        } else {
            return "Tie";
        }
    }

    public static void main(String[] args) {
        int[] andrea = {1, 2, 3};
        int[] maria = {2, 1, 3};
        String s = "Odd";
        System.out.println("winner(andrea, maria, s) = " + winner(andrea, maria, s));

    }
}
