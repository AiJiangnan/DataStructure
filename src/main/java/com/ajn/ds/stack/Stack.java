package com.ajn.ds.stack;

/**
 * 栈接口
 *
 * @author 艾江南
 * @date 4/27/2020
 */
public interface Stack<T> {

    /**
     * 入栈
     */
    void push(T t);

    /**
     * 出栈
     */
    T pop();

    /**
     * 判断栈是否为空
     */
    boolean isEmpty();

    /**
     * 打印栈所有数据
     */
    void print();
}
