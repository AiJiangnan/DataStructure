package com.ajn.ds.stack;

import java.util.Arrays;

/**
 * @author 艾江南
 * @date 4/27/2020
 */
public class ArrayStack<T> implements Stack<T> {

    private int top = -1;

    private int size = 0;

    private Object[] elementData;

    public ArrayStack(int size) {
        this.elementData = new Object[size];
    }

    @Override
    public boolean push(T t) {
        if (top > elementData.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        elementData[++top] = t;
        size++;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (top == -1) {
            throw new NullPointerException();
        }
        Object e = elementData[top];
        elementData[top--] = null;
        size--;
        return (T) e;
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
