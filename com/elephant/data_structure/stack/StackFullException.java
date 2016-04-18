package com.elephant.data_structure.stack;

/**
 * Created by elephant on 16/4/1.
 */
public class StackFullException extends RuntimeException{
		public StackFullException(String s){
			super(s);
			System.out.println("StackFullException");
		}
}
