package Array_1;

/*
Given an array of ints length 3,
return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/
public class Sum3 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3}, b = {5, 11, 2}, c = {7, 0, 0};

        System.out.println(sum3(a));
        System.out.println(sum3(b));
        System.out.println(sum3(c));

    }

    public static int sum3(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
