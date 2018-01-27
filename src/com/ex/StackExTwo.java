package com.ex;


class MyStack {
	private int maxSize;
	private Integer[] stackArray = null;
	private int top = -1;
	private int size =0;
	
	public MyStack() {
	stackArray = new Integer[3];
	maxSize = 3;
	}
	
	public MyStack(int size) {
		stackArray = new Integer[size];
		maxSize = size;
	}
	
	public void push(Integer element) {
		stackArray[++top] = element;
		size++;
	}
	
	public Integer pop() {
		size--;
		return stackArray[top--];
	}
	
	public Integer peek(Integer element) {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
}
public class StackExTwo {

	public static void main(String[] args) {
		
		MyStack myStack = new MyStack(5);
		myStack.push(10);
		
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		System.out.println(myStack.size());
		myStack.pop();
		System.out.println(myStack.size());
		
	}

}
