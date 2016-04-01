package com.elephant.data_structure.stack;

/**
 *	Implementatino of the Stack interface using an array
 *
 */
public class ArrayStack implements Stack {

	public static final int CAPACITY=1024;	// default capacity of stack
	private int N;	// maximum capacity of stack
	private Object S[];	// S holds the elements of the stack
	private int t=-1;	// the top element of the stack

	// initialize the stack with default capacity
	public ArrayStack(){this(CAPACITY);}
	// initialize the stack with given capacity
	public ArrayStack(int cap){
		N=cap;
		S=new Object[N];
	}

// implements methods in Stack interface
	// return current Stack size
	public int size(){
		return t+1;
	}
	// return true if the stack empty
	public boolean isEmpty() {
		return t<0;
	}
	// push a new element on stack
	public void push(Object element) throws StackFullException{
		if (size()==N)
			throw new StackFullException("Stack Overflow!");
		S[++t]=element;
	}
	// pop off the stack element
	public Object pop() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is empty.");
		Object element;
		element=S[t];
		S[t--]=null;
		return element;
	}

	//
	public Object top() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is empty.");
		return S[t];
	}
}
