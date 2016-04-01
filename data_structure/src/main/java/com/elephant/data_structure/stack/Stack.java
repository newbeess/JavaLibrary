package com.elephant.data_structure.stack;

/**
 * Created by elephant on 16/4/1.
 */
public interface Stack {

	// access methods
	public int size();
	public boolean isEmpty();
	public Object top() throws StackEmptyException ;


	// update methods
	public void push(Object element);
	public Object pop() throws StackEmptyException;
}
