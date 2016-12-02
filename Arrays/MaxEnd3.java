package Array_1;

/*
Given an array of ints length 3,
figure out which is larger, the first or last element in the array,
and set all the other elements to be that value.
Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
*/

import java.util.Arrays;

public class MaxEnd3 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3}, b = {11, 5, 9}, c = {2, 11, 3};

        System.out.println(Arrays.toString(maxEnd3(a)));
        System.out.println(Arrays.toString(maxEnd3(b)));
        System.out.println(Arrays.toString(maxEnd3(c)));

    }

    public static int[] maxEnd3(int[] nums) {
        if(nums[0] < nums[nums.length - 1]) {
            nums[0] = nums[nums.length - 1];
        }
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[0];
        }
        return nums;
    }

}
