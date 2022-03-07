package com.ajn.ds.tree;

/**
 * @author 艾江南
 * @date 6/5/2020
 */
public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new LinkedBinaryTree<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(tree.nodeCount());
        System.out.println(tree.leafNodeCount());
        System.out.println(tree.depth());
        tree.preOrderTraverse();
        System.out.println();
        tree.inOrderTraverse();
        System.out.println();
        tree.postOrderTraverse();
        System.out.println();
        tree.levelOrderTraverse();
    }
}
