package com.recursion.basics;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		int[] a1= {1,2,3,4};
		ReverseArray(a1, 0, a1.length-1);
		System.out.println(Arrays.toString(a1));
	}
	
	public static void ReverseArray(int[] a1,int start,int end) {
		if(start>=end) return;
		swapVal(a1, start, end);
		ReverseArray(a1, start+1, end-1);
	}
	
	private static void swapVal(int[] a1,int src,int dest) {
		int temp=a1[src];
		a1[src]=a1[dest];
		a1[dest]=temp;
	}

}
