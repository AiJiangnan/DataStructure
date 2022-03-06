package com.ajn.ds.linear;

/**
 * @author 艾江南
 * @date 2020/4/25
 */
public class Main {

    public static void main(String[] args) {
        LinearTable<Integer> linearTable = new LinkedLinearTable<>(new Integer[]{1, 2, 3, 4, 5, null, null, null});
        linearTable.print();
        System.out.println(linearTable.size());
        linearTable.insert(0, 0);
        linearTable.print();
        linearTable.insert(3, 6);
        linearTable.print();
        linearTable.delete(0);
        linearTable.print();
        linearTable.delete(3);
        linearTable.print();
        linearTable.delete(linearTable.size() - 1);
        linearTable.print();
        System.out.println(linearTable.findElement(0));
        System.out.println(linearTable.findElement(3));
        System.out.println(linearTable.findElement(linearTable.size() - 1));
        System.out.println(linearTable.findPosition(1));
        System.out.println(linearTable.findPosition(4));
        System.out.println(linearTable.findPosition(5));
    }
}
