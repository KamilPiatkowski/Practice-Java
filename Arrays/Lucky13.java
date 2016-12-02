package Array_2;

/*
Given an array of ints,
return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
lucky13([]) → true
*/

public class Lucky13 {

    public static void main(String[] args) {

        int[] a = {0, 2, 4}, b = {1, 2, 3}, c = {1, 2, 4}, d = {};

        System.out.println("a: " + lucky13(a));
        System.out.println("b: " + lucky13(b));
        System.out.println("c: " + lucky13(c));
        System.out.println("d: " + lucky13(d));

    }

    public static boolean lucky13(int[] nums) {
        boolean lucky = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3) {
                lucky = false;
            }
        }
        return lucky;
    }

}
