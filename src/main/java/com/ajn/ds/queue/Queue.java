package com.ajn.ds.queue;

/**
 * @author 艾江南
 * @date 4/29/2020
 */
public interface Queue<T> {

    /**
     * 入队
     */
    void add(T t);

    /**
     * 出队
     */
    T remove();

    /**
     * 判断队列是否为空
     */
    boolean isEmpty();

    /**
     * 打印队列所有数据
     */
    void print();
}
