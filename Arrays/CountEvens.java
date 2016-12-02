package Array_2;

/*
Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder,
e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
*/

public class CountEvens {

    public static void main(String[] args) {

        int[] a = {2, 1, 2, 3, 4}, b = {2, 2, 0}, c = {1, 3, 5};

        System.out.println("a: " + countEvens(a));
        System.out.println("b: " + countEvens(b));
        System.out.println("c: " + countEvens(c));

    }

    public static int countEvens(int[] nums) {
        int evens = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                evens ++;
            }
        }
        return evens;
    }

}
