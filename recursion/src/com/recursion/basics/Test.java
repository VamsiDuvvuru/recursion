package com.recursion.basics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=998;
		int num1=0;
		while(num!=0) {
			System.out.println((num%10));
			num=num/10;
			num1+=10*(num%10);
		}

	}

}
