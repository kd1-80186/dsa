package com.sunbeam;

public class DecendingStack {
    private int top;
    private final int SIZE;
    private int[] stackArray;

    public DecendingStack(int size, int initialValue) {
        this.SIZE = size;
        this.stackArray = new int[SIZE];
        this.top = initialValue;
    }

    public void push(int data) {
        if (top < 0) {
            System.out.println("Stack is full, cannot push element.");
            return;
        }
        stackArray[top] = data;
        top--;
    }

    public int pop() {
        if (top >= SIZE - 1) {
            System.out.println("Stack is empty, cannot pop element.");
            return -1; 
        }
        top++;
        int poppedElement = stackArray[top];
        return poppedElement;
    }

    public static void main(String[] args) {
        int size = 10; 
        int initialValue = size - 1; 
        DecendingStack descendingStack = new DecendingStack(size, initialValue);

     
        descendingStack.push(5);
        descendingStack.push(3);
        descendingStack.push(8);

      
        System.out.println(descendingStack.pop()); 
        System.out.println(descendingStack.pop()); 
        System.out.println(descendingStack.pop()); 
        System.out.println(descendingStack.pop());
    }
}