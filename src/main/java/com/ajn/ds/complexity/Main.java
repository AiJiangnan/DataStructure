package com.ajn.ds.complexity;

/**
 * @author 艾江南
 * @date 2020/4/24
 */
public class Main {

    /**
     * O(1)
     */
    public static int abs(int a) {
        return a < 0 ? -a : a;
    }

    /**
     * O(n)
     */
    public static int sum(int[] a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }

    /**
     * O(log n)
     */
    public static int binarySearch(int[] a, int b) {
        int i, r = 0, l = a.length;
        while (r <= l) {
            i = (r + l) / 2;
            if (a[i] < b) {
                r = i + 1;
            } else if (a[i] > b) {
                l = i - 1;
            } else {
                return i;
            }
        }
        return -1;
    }

    /**
     * O(n^2)
     */
    public static int[] bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 5, 6, 9, 10}, 9));
    }
}
