package com.ajn.ds.algorithm;

/**
 * @author 艾江南
 * @date 4/29/2020
 */
public class BinarySearch {

    private static int binarySearch(int[] array, int a) {
        int r = 0;
        int l = array.length - 1;
        int m;
        while (r <= l) {
            m = (r + l) / 2;
            if (array[m] < a) {
                r = m + 1;
            } else if (array[m] > a) {
                l = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7, 8, 9};
        System.out.println(binarySearch(a, 7));
    }
}
