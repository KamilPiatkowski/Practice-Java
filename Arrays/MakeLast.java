package Array_1;

/*
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
makeLast([0]) → [0, 0]
*/

import java.util.Arrays;

public class MakeLast {

    public static void main(String[] args) {

        int[] a = {4, 5, 6}, b = {1, 2}, c = {3}, d = {0};

        System.out.println(Arrays.toString(makeLast(a)));
        System.out.println(Arrays.toString(makeLast(b)));
        System.out.println(Arrays.toString(makeLast(c)));
        System.out.println(Arrays.toString(makeLast(d)));

    }

    public static int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

}
