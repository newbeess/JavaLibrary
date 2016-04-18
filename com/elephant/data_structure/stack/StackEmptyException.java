package com.elephant.data_structure.stack;

/**
 * Created by elephant on 16/4/1.
 */
public class StackEmptyException extends RuntimeException {
	public StackEmptyException(String s){
		super(s);
		System.out.println("StackEmptyException");
	}
}
