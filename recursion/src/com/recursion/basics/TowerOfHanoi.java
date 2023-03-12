package com.recursion.basics;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 2; 
	     ToH(n, 'A', 'B', 'C');  
	}
	
	static void ToH(int n,char a,char b,char c) {
		if(n==1) {
			System.out.println("move "+n+"from"+a+" to "+c);
			return;
		}
		ToH(n-1,a,c,b);
		System.out.println("move "+n+"from  "+ a +" to "+c);
		ToH(n-1,b,a,c);
	}

}
