package com.ajn.ds.linear;

import java.util.Arrays;

/**
 * 顺序存储线性表
 *
 * @author 艾江南
 * @date 2020/4/25
 */
public class ArrayLinearTable<T> implements LinearTable<T> {

    private Object[] elementData;

    public ArrayLinearTable(int size) {
        elementData = new Object[size];
    }

    @Override
    public LinearTable<T> init(T... t) {
        elementData = t;
        return this;
    }

    @Override
    public boolean empty() {
        return elementData.length == 0;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < elementData.length; i++) {
            elementData[i] = null;
        }
        return true;
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public boolean insert(int pos, T t) {
        if (pos > elementData.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = elementData.length - 1; i > pos; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[pos] = t;
        return true;
    }

    @Override
    public boolean delete(int pos) {
        if (pos > elementData.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = pos; i < elementData.length - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[elementData.length - 1] = null;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findElement(int pos) {
        return (T) elementData[pos];
    }

    @Override
    public int findPosition(T t) {
        if (t == null) {
            return -1;
        }
        for (int i = 0; i < elementData.length; i++) {
            if (t.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(elementData));
    }
}
