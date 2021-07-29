package com.ajn.ds.linear;

/**
 * 线性表接口
 *
 * @author 艾江南
 * @date 2020/4/25
 */
public interface LinearTable<T> {

    /**
     * 初始化线性表数据
     */
    void init(T... t);

    /**
     * 判断线性表是否为空
     */
    boolean empty();

    /**
     * 清空线性表
     */
    void clear();

    /**
     * 返回线性表的大小
     */
    int size();

    /**
     * 插入数据元素
     */
    void insert(int pos, T t);

    /**
     * 删除数据元素
     */
    void delete(int pos);

    /**
     * 通过位置查找数据元素
     */
    T findElement(int pos);

    /**
     * 通过数据元素查找位置
     */
    int findPosition(T t);

    /**
     * 打印线性表所有数据
     */
    void print();
}
