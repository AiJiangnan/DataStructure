package com.ajn.ds.stack;

/**
 * @author 艾江南
 * @date 4/27/2020
 */
public class Main {

    static class Peo {
        private int age;
        private String name;

        public Peo(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Peo{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Stack<Peo> stack = new LinkedStack<>();
        stack.print();
        stack.push(new Peo(6, null));
        stack.print();
        stack.push(new Peo(5, null));
        stack.push(new Peo(4, null));
        stack.push(new Peo(3, null));
        stack.print();
        System.out.println(stack.pop());
        stack.push(new Peo(2, null));
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();

    }
}
