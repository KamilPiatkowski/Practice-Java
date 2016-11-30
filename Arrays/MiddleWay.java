package Array_1;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/
public class MiddleWay {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3}, b1 = {4, 5, 6};
        int[] a2 = {7, 7, 7}, b2 = {3, 8, 0};
        int[] a3 = {5, 2, 9}, b3 = {1, 4, 5};

        System.out.println(Arrays.toString(middleWay(a1, b1)));
        System.out.println(Arrays.toString(middleWay(a2, b2)));
        System.out.println(Arrays.toString(middleWay(a3, b3)));

    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] arr = {a[a.length / 2], b[b.length / 2]};
        return arr;
    }

}
