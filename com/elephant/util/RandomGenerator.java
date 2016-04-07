package com.elephant.util;

import java.util.*;
/**
 * Generators that produce random values
 */
public class RandomGenerator {
	private static Random r=new Random(47);
// Boolean
	public static class Boolean implements Generator<java.lang.Boolean>{
		public java.lang.Boolean next(){
			return r.nextBoolean();
		}
	}
// Byte
	public static class Byte implements Generator<java.lang.Byte>{
		public java.lang.Byte next(){
			return (byte)r.nextInt();
		}
	}
// Character
	public static class Character implements Generator<java.lang.Character>{
		public java.lang.Character next(){
			return CountingGenerator.chars[r.nextInt(CountingGenerator.chars.length)];
		}
	}
// String
	public static class String extends CountingGenerator.String{
		{cg=new Character();}
		public String(){}
		public String(int length){super(length);}
	}
// Integer
	public static class Integer implements Generator<java.lang.Integer>{
		private int mod=10000;
		public Integer(){}
		public Integer(int modulo){mod=modulo;}
		public java.lang.Integer next(){return r.nextInt(mod);}
	}
	
// Long
	public static class Long implements Generator<java.lang.Long>{
		private int mod=10000;
		public Long(){}
		public Long(int modulo){mod=modulo;}
		public java.lang.Long next(){
			return new java.lang.Long(r.nextInt(mod));
		}
	}
	
// Float
	public static class Float implements Generator<java.lang.Float>{
		public java.lang.Float next(){
			int trimmed=Math.round(r.nextFloat()*100);
			return ((float)trimmed)/100;
		}
	}
	
// Double
	
	public static class Double implements Generator<java.lang.Double>{
		public java.lang.Double next(){
			long trimmed=Math.round(r.nextDouble()*100);
			return ((double)trimmed)/100;
		}
	}
}
