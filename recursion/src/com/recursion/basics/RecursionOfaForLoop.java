package com.recursion.basics;

public class RecursionOfaForLoop {
	
	public static void main(String[] args) {
		recursionLoop(0, 15);
		System.out.println("--------------");
		decrementforLoop(15, 0);
	}
	
	private static void recursionLoop(int n,int max) {
		if(n>max) return;
		System.out.println(n);
		recursionLoop(n+1,max);
	}
	
	private static void decrementforLoop(int n,int min) {
		if(n<min) return;
		System.out.println(n);
		decrementforLoop(n-1, min);
	}

}
