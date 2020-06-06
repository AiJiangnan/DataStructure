package com.ajn.ds.tree;

/**
 * @author 艾江南
 * @date 6/5/2020
 */
public interface BinaryTree<T> {

    /**
     * 初始化树
     */
    void init(T[] arr);

    /**
     * 计算节点个数
     */
    int nodeCount();

    /**
     * 计算叶子节点个数
     */
    int leafNodeCount();

    /**
     * 计算深度
     */
    int depth();

    /**
     * 先序遍历
     */
    void preOrderTraverse();

    /**
     * 中序遍历
     */
    void inOrderTraverse();

    /**
     * 后序遍历
     */
    void postOrderTraverse();

    /**
     * 层次遍历
     */
    void levelOrderTraverse();
}
