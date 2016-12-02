package Array_2;

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
no14([]) → true
no14([1, 1, 1, 1]) → true
no14([9, 4, 4, 1]) → false
*/

public class No14 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3}, b = {1, 2, 3, 4}, c = {2, 3, 4}, d = {}, e = {1, 1, 1, 1}, f = {9, 4, 4, 1};

        System.out.println("a: " + no14(a));
        System.out.println("b: " + no14(b));
        System.out.println("c: " + no14(c));
        System.out.println("d: " + no14(d));
        System.out.println("e: " + no14(e));
        System.out.println("f: " + no14(f));

    }

    public static boolean no14(int[] nums) {
        boolean noOneOrFour = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] == 4) {
                        noOneOrFour = false;
                    }
                }
            }
        }
        return noOneOrFour;
    }

}
