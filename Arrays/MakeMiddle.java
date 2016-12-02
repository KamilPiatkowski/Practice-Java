package Array_1;

/*
Given an array of ints of even length,
return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/

import java.util.Arrays;

public class MakeMiddle {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4}, b = {7, 1, 2, 3, 4, 9}, c = {1, 2};

        System.out.println(Arrays.toString(makeMiddle(a)));
        System.out.println(Arrays.toString(makeMiddle(b)));
        System.out.println(Arrays.toString(makeMiddle(c)));

    }

    public static int[] makeMiddle(int[] nums) {
        int[] arr = {nums[(nums.length / 2) - 1], nums[nums.length / 2]};
        return arr;
    }

}

