package com.ajn.ds.queue;

/**
 * @author 艾江南
 * @date 4/29/2020
 */
public class LinkedQueue<T> implements Queue<T> {

    private Node front;

    private Node rear;

    private int size = 0;

    private class Node {
        private T t;
        private Node next;

        public Node() {
        }

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }

    @Override
    public boolean add(T t) {
        Node n = new Node(t, null);
        if (rear != null) {
            rear.next = n;
        }
        if (front == null) {
            front = n;
        }
        rear = n;
        size++;
        return false;
    }

    @Override
    public T remove() {
        if (front == null) {
            throw new NullPointerException();
        }
        T t = front.t;
        front = front.next;
        size--;
        return t;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        Node n = front;
        while (n != null) {
            System.out.print(n.t + ",");
            n = n.next;
        }
        System.out.println();
    }
}
