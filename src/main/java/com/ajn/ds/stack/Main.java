package com.ajn.ds.stack;

/**
 * @author 艾江南
 * @date 4/27/2020
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(evaluate("10 + 2 * 6"));
        System.out.println(evaluate("100 * 2 + 12"));
        System.out.println(evaluate("100 * ( 2 + 12 )"));
        System.out.println(evaluate("100*(2+12)/14"));
        System.out.println(toBinaryString(3));
    }

    public static String toBinaryString(int num) {
        Stack<Integer> stack = new LinkedStack<>();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.toString();
    }

    public static int evaluate(String expression) {
        Stack<Integer> numStack = new LinkedStack<>();
        Stack<Character> opStack = new LinkedStack<>();
        char[] chars = expression.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                StringBuilder num = new StringBuilder();
                while (i < chars.length && chars[i] >= '0' && chars[i] <= '9') {
                    num.append(chars[i++]);
                }
                numStack.push(Integer.valueOf(num.toString()));
                i--;
            } else if (chars[i] == '(') {
                opStack.push(chars[i]);
            } else if (chars[i] == ')') {
                char op;
                while ((op = opStack.pop()) != '(') {
                    numStack.push(calculate(op, numStack.pop(), numStack.pop()));
                }
            } else if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {
                if (!opStack.isEmpty()) {
                    char op = opStack.pop();
                    opStack.push(op);
                    while (!opStack.isEmpty() && hasPrecedence(chars[i], op)) {
                        numStack.push(calculate(opStack.pop(), numStack.pop(), numStack.pop()));
                    }
                }
                opStack.push(chars[i]);
            }
        }
        while (!opStack.isEmpty()) {
            numStack.push(calculate(opStack.pop(), numStack.pop(), numStack.pop()));
        }
        return numStack.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    public static int calculate(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("不能除以0");
                }
                return a / b;
            default:
                return 0;
        }
    }
}
