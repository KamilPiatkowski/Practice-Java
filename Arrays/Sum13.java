package Array_2;

/*
Return the sum of the numbers in the array,
returning 0 for an empty array. Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
sum13([]) → 0
sum13([13, 1, 2, 13, 2, 1, 13]) → 3
*/

public class Sum13 {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 1}, b = {1, 1}, c = {1, 2, 2, 1, 13}, d = {}, e = {13, 1, 2, 13, 2, 1, 13};

        System.out.println("a: " + sum13(a));
        System.out.println("b: " + sum13(b));
        System.out.println("c: " + sum13(c));
        System.out.println("d: " + sum13(d));
        System.out.println("e: " + sum13(e));

    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 13) {
                i ++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

}
