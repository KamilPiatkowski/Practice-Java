package Array_2;

/*
Given a number n, create and return a new int array of length n,
containing the numbers 0, 1, 2, ... n-1.
The given n may be 0,
in which case just return a length 0 array.
*/

import java.util.Arrays;

public class FizzArray {

    public static void main(String[] args) {

        int a = 4, b = 1, c = 10, d = 0;

        System.out.println("a: " + Arrays.toString(fizzArray(a)));
        System.out.println("b: " + Arrays.toString(fizzArray(b)));
        System.out.println("c: " + Arrays.toString(fizzArray(c)));
        System.out.println("d: " + Arrays.toString(fizzArray(d)));

    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
