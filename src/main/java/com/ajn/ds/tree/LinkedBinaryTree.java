package com.ajn.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 艾江南
 * @date 6/5/2020
 */
public class LinkedBinaryTree<T> implements BinaryTree<T> {

    private Node root;

    private class Node {
        private final T data;
        private Node left;
        private Node right;

        public Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    @Override
    public void init(T[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        List<Node> list = new ArrayList<>();
        for (T t : arr) {
            list.add(new Node(t, null, null));
        }
        root = list.get(0);
        for (int i = 0; i < list.size() / 2; i++) {
            if ((i * 2 + 1) < list.size()) {
                list.get(i).left = list.get(i * 2 + 1);
            }
            if ((i * 2 + 2) < list.size()) {
                list.get(i).right = list.get(i * 2 + 2);
            }
        }
    }

    @Override
    public int nodeCount() {
        return nodeCount(root);
    }

    @Override
    public int leafNodeCount() {
        return leafNodeCount(root);
    }

    @Override
    public int depth() {
        return depth(root);
    }

    @Override
    public void preOrderTraverse() {
        preOrderTraverse(root);
    }

    @Override
    public void inOrderTraverse() {
        inOrderTraverse(root);
    }

    @Override
    public void postOrderTraverse() {
        postOrderTraverse(root);
    }

    @Override
    public void levelOrderTraverse() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            operate(node);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    private int nodeCount(Node node) {
        if (node == null) {
            return 0;
        }
        return nodeCount(node.left) + nodeCount(node.right) + 1;
    }

    private int leafNodeCount(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return leafNodeCount(node.left) + leafNodeCount(node.right);
    }

    private int depth(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    private void preOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        operate(node);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    private void inOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        operate(node);
        inOrderTraverse(node.right);
    }

    private void postOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        operate(node);
    }

    private void operate(Node node) {
        System.out.print(node.data + " ");
    }
}
