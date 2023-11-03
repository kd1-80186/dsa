
package com.sunbeam;
public class OperatorPriority {
    public static int getPriority(char operator) {
        if (operator == '^')
            return 1;
        else if (operator == '*' || operator == '/')
            return 2;
        else if (operator == '+' || operator == '-')
            return 3;
        else
            return -1;
    }

    public static void main(String[] args) {
        char op1 = '+';
        char op2 = '/';
        char op3 = '^';

        System.out.println("Priority of " + op1 + " is: " + getPriority(op1));
        System.out.println("Priority of " + op2 + " is: " + getPriority(op2));
        System.out.println("Priority of " + op3 + " is: " + getPriority(op3));
    }
}
