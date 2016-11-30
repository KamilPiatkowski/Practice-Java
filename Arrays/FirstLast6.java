package Array_1;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
*/

public class FirstLast6 {

    public static void main(String[] args) {

        int[] a = {1, 2, 6}, b = {6, 1, 2, 3}, c = {13, 6, 1, 2, 3};

        System.out.println("a: " + firstLast6(a));
        System.out.println("b: " + firstLast6(b));
        System.out.println("c: " + firstLast6(c));

    }

    public static boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }

    }

}
