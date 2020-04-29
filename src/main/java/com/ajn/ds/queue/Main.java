package com.ajn.ds.queue;

/**
 * @author 艾江南
 * @date 4/29/2020
 */
public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayQueue<>(5);
        q.print();
        for (int i = 1, n = 6; i < n; i++) {
            q.add(i);
            q.print();
        }
        for (int i = 1, n = 4; i < n; i++) {
            System.out.println(q.remove());
            q.print();
        }
        q.add(6);
        q.print();
        q.add(7);
        q.print();
        q.add(8);
        q.print();
        System.out.println(q.remove());
        q.print();
        for (int i = 1, n = 4; i < n; i++) {
            System.out.println(q.remove());
            q.print();
        }
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
