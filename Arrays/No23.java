package Array_1;

/*
Given an int array length 2,
return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

public class No23 {

    public static void main(String[] args) {

        int[] a = {4, 5}, b = {4, 2}, c = {3, 5};

        System.out.println("a: " + no23(a));
        System.out.println("b: " + no23(b));
        System.out.println("c: " + no23(c));

    }

    public static boolean no23(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2 || nums[i] == 3) {
                j++;
            }
        }
        return (j > 0) ? false : true;
    }

}
