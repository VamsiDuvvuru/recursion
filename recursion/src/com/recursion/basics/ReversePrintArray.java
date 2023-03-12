package com.recursion.basics;

public class ReversePrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]  a1= {1,2,3,4,5,6};
     printArray(a1,-1);
	}
	
	private static void printArray(int[] a1,int i) {
		  i=i+1; 
		 if(i>=a1.length) return;
		 printArray(a1, i);
		 System.out.println(a1[i]);
	}

}
