package com.ajn.ds.linear;

/**
 * 链式存储线性表
 *
 * @author 艾江南
 * @date 2020/4/25
 */
public class LinkedLinearTable<T> implements LinearTable<T> {

    private Node head;
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
    public LinearTable<T> init(T... t) {
        if (t == null || t.length == 0) {
            return this;
        }
        head = new Node(t[size++], null);
        Node pre = head;
        for (int i = 1; i < t.length; i++) {
            pre.next = new Node(t[i], null);
            pre = pre.next;
            size++;
        }
        return this;
    }

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public boolean clear() {
        head = null;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean insert(int pos, T t) {
        if (pos > size) {
            throw new OutOfMemoryError();
        }
        Node n = new Node(t, null);
        if (pos == 0) {
            n.next = head;
            head = n;
        } else {
            Node pre = head;
            for (int i = 0; i < pos - 1; i++) {
                pre = pre.next;
            }
            n.next = pre.next;
            pre.next = n;
        }
        size++;
        return true;
    }

    @Override
    public boolean delete(int pos) {
        if (pos > size - 1) {
            throw new OutOfMemoryError();
        }
        if (pos == 0) {
            head = head.next;
        } else {
            Node pre = head;
            for (int i = 0; i < pos - 1; i++) {
                pre = pre.next;
            }
            pre.next = pre.next.next;
        }
        size--;
        return true;
    }

    @Override
    public T findElement(int pos) {
        Node n = head;
        for (int i = 0; i < pos; i++) {
            n = n.next;
        }
        return n.t;
    }

    @Override
    public int findPosition(T t) {
        int i = 0;
        Node n = head;
        while (n != null && !t.equals(n.t)) {
            i++;
            n = n.next;
        }
        return i;
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
}
