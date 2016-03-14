package com.elephant.util;

/**
 * Created by elephant on 16/3/14.
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
	public final E fifth;
	public FiveTuple(A a,B b,C c,D d,E e){
		super(a,b,c,d);
		fifth=e;
	}
	public String toString(){return "("+first+", "+second+", "+third+", "+fourth+", "+fifth+")";}
}

