package com.elephant.util;
import java.io.*;
/**
*简化print代码量
*
*/
public class Print{
	//Print a line with break
	public static void print(Object obj){
		System.out.println(obj);
	}
	//Print a void line
	public static void print(){
		System.out.println();
	}
	//Print a line without break
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	//The new Java SE5 printf() from C
	public static PrintStream
	printf(String format,Object... args){
		return System.out.printf(format,args);
	}
}

