package com.ajn.ds.algorithm;

import java.util.Arrays;

/**
 * 排序算法
 *
 * @author 艾江南
 * @date 5/14/2020
 */
public class Sort {

    /**
     * 冒泡排序
     */
    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        return a;
    }

    /**
     * 选择排序
     */
    public static int[] selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        return a;
    }

    /**
     * 插入排序
     */
    public static int[] insertSort(int[] a) {
        int tmp;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            tmp = a[i];
            for (; j >= 0 && tmp < a[j]; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = tmp;
        }
        return a;
    }

    /**
     * 归并排序
     */
    public static int[] mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
        return a;
    }

    private static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(a, l, L, 0, n1);
        System.arraycopy(a, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }
        while (i < n1) {
            a[k++] = L[i++];
        }
        while (j < n2) {
            a[k++] = R[j++];
        }
    }

    /**
     * 快速排序
     */
    public static int[] quicklySort(int[] a, int l, int r) {
        if (l >= r) {
            return a;
        }
        int i = l, j = r, k = a[l];
        while (i != j) {
            while (i < j && a[j] > k) {
                j--;
            }
            a[i] = a[j];
            while (i < j && a[i] <= k) {
                i++;
            }
            a[j] = a[i];
            a[i] = k;
        }
        quicklySort(a, l, j - 1);
        quicklySort(a, j + 1, r);
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 3, 5, 1, 2};
        print(bubbleSort(a));
        int[] b = {4, 6, 3, 5, 1, 2};
        print(selectSort(b));
        int[] c = {4, 6, 3, 5, 1, 2};
        print(insertSort(c));
        int[] d = {4, 6, 3, 5, 1, 2};
        print(mergeSort(d, 0, d.length - 1));
        int[] e = {4, 6, 3, 5, 1, 2};
        print(quicklySort(e, 0, a.length - 1));
    }

    private static void print(int[] ints) {
        System.out.println(Arrays.toString(ints));
    }
}
