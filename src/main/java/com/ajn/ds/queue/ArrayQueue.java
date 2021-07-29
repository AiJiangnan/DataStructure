package com.ajn.ds.queue;

import java.util.Arrays;

/**
 * @author 艾江南
 * @date 4/29/2020
 */
public class ArrayQueue<T> implements Queue<T> {

    private int front = 0;
    private int rear = 0;
    private int size = 0;

    private final Object[] elementData;

    public ArrayQueue(int size) {
        this.elementData = new Object[size];
    }

    @Override
    public void add(T t) {
        if (front == rear && size == elementData.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        elementData[rear] = t;
        rear = (rear + 1) % elementData.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove() {
        if (front == rear && size == 0) {
            throw new NullPointerException();
        }
        Object t = elementData[front];
        elementData[front] = null;
        front = (front + 1) % elementData.length;
        size--;
        return (T) t;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(elementData));
    }
}
