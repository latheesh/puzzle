package com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BalancedOrNot {

    static int[] balancedOrNot(String[] expressions, int[]
            maxReplacements) {

        for (int i = 0; i < expressions.length; i++) {
            Stack<Character> stack = new Stack<>();
            String str = expressions[i];

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '<') {
                    stack.push(c);
                } else {
                    if (!stack.isEmpty()) {
                        char stackChar = stack.peek();
                        if (stackChar == '<') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else {
                        stack.push(c);
                    }

                }
            }

            if (stack.isEmpty()) {
                maxReplacements[i] = 1;
            } else {
                int maxReplacement = maxReplacements[i];
                for (int rCount = 0; rCount < maxReplacement; rCount++) {
                    if (!stack.isEmpty()) {
                        char stackChar = stack.peek();
                        if (stackChar == '>') {
                            stack.pop();
                        }
                    }
                }
                if (stack.isEmpty())
                    maxReplacements[i] = 1;
                else
                    maxReplacements[i] = 0;
            }


        }

        return maxReplacements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[size];

        for (int i = 0; i < size; i++) {
            strings[i] = scanner.nextLine();
        }

        int sizeOfMaxReplacement = Integer.parseInt(scanner.nextLine());
        int[] maxReplacesments = new int[sizeOfMaxReplacement];

        for (int i = 0; i < maxReplacesments.length; i++) {
            maxReplacesments[i] = Integer.parseInt(scanner.nextLine());

        }


        int[] ints = balancedOrNot(strings, maxReplacesments);
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            System.out.println(anInt);
        }

    }
}
