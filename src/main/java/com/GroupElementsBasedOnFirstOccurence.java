package com;

import java.util.*;

public class GroupElementsBasedOnFirstOccurence {
    static int[] groupElements(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!integers.contains(nums[i])) {
                integers.add(nums[i]);
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j])
                        integers.add(nums[j]);
                }
            }
        }
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 5, 5, 3, 1, 2, 2, 4};
        int[] groupedElements = groupElements(nums);
        System.out.println("groupedElements = " + Arrays.toString(groupedElements));
        nums = new int[]{1, 2, 3, 1, 2, 1};
        System.out.println("groupedElements = " + Arrays.toString(groupElements(nums)));
    }
}
