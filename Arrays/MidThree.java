package Array_1;

/*
Given an array of ints of odd length,
return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
*/

import java.util.Arrays;

public class MidThree {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5}, b = {8, 6, 7, 5, 3, 0, 9}, c = {1, 2, 3};

        System.out.println(Arrays.toString(midThree(a)));
        System.out.println(Arrays.toString(midThree(b)));
        System.out.println(Arrays.toString(midThree(c)));

    }

    public static int[] midThree(int[] nums) {
        int[] arr = {nums[(nums.length / 2) - 1], nums[nums.length / 2], nums[(nums.length / 2) + 1]};
        return arr;
    }

}
