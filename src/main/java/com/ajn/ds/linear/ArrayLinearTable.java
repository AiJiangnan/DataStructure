package com.ajn.ds.linear;

import java.util.Arrays;

/**
 * 顺序存储线性表
 *
 * @author 艾江南
 * @date 2020/4/25
 */
public class ArrayLinearTable<T> implements LinearTable<T> {

    private final Object[] elementData;

    public ArrayLinearTable(T[] array) {
        this.elementData = array;
    }

    @Override
    public boolean empty() {
        return elementData.length == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(elementData, null);
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public void insert(int pos, T t) {
        if (pos > elementData.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (elementData.length - 1 - pos >= 0) {
            System.arraycopy(elementData, pos, elementData, pos + 1, elementData.length - 1 - pos);
        }
        elementData[pos] = t;
    }

    @Override
    public void delete(int pos) {
        if (pos > elementData.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (elementData.length - 1 - pos >= 0) {
            System.arraycopy(elementData, pos + 1, elementData, pos, elementData.length - 1 - pos);
        }
        elementData[elementData.length - 1] = null;
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
