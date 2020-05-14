package com.ajn.ds.algorithm;

/**
 * 查找算法
 *
 * @author 艾江南
 * @date 4/29/2020
 */
public class Search {

    /**
     * 顺序查找
     */
    public static int iterationSearch(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     */
    public static int binarySearch(int[] array, int a) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] < a) {
                start = mid + 1;
            } else if (array[mid] > a) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7, 8, 9};
        System.out.println(iterationSearch(a, 7));
    }
}
