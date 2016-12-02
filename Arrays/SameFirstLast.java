package Array_1;

/*
Given an array of ints, return true if the array is length 1 or more,
and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*/

public class SameFirstLast {

    public static void main(String[] args) {

        int[] a = {1, 2, 3}, b = {1, 2, 3, 1}, c = {1, 2, 1};

        System.out.println("a: " + sameFirstLast(a));
        System.out.println("b: " + sameFirstLast(b));
        System.out.println("c: " + sameFirstLast(c));

    }

    public static boolean sameFirstLast(int[] nums) {
        boolean equal = false;
        if(nums.length >= 1) {
            if(nums[0] == nums[nums.length - 1]) {
                equal = true;
            }
        }
        return equal;
    }

}
