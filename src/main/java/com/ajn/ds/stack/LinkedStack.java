package com.ajn.ds.stack;

/**
 * @author 艾江南
 * @date 4/27/2020
 */
public class LinkedStack<T> implements Stack<T> {

    private Node head;

    private int size = 0;

    @Override
    public void push(T t) {
        Node n = new Node(t, null);
        if (head != null) {
            n.next = head;
        }
        head = n;
        size++;
    }

    @Override
    public T pop() {
        if (head == null) {
            throw new NullPointerException();
        }
        T t = head.t;
        head = head.next;
        size--;
        return t;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.t + ",");
            n = n.next;
        }
        System.out.println();
    }

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
}
