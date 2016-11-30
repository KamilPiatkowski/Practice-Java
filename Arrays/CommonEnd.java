package Array_1;

/*
Given 2 arrays of ints, a and b,
return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
*/

public class CommonEnd {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3}, b1 = {7, 3};
        int[] a2 = {1, 2, 3}, b2 = {7, 3, 2};
        int[] a3 = {1, 2, 3}, b3 = {1, 3};

        System.out.println(commonEnd(a1, b1));
        System.out.println(commonEnd(a2, b2));
        System.out.println(commonEnd(a3, b3));

    }

    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }

    }

}
