package Array_1;

/*
Given an array of ints,
return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
*/

import java.util.Arrays;

public class MakeEnds {

    public static void main(String[] args) {

        int[] a = {1, 2, 3}, b = {1, 2, 3, 4}, c = {7, 4, 6, 2};

        System.out.println(Arrays.toString(makeEnds(a)));
        System.out.println(Arrays.toString(makeEnds(b)));
        System.out.println(Arrays.toString(makeEnds(c)));

    }

    public static int[] makeEnds(int[] nums) {
        int[] arr = {nums[0], nums[nums.length - 1]};
        return arr;
    }

}
