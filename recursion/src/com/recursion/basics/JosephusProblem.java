package com.recursion.basics;

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(JosephusProblem(5, 3));
	}
   
	static int JosephusProblem(int n,int k) {
		if(n==1) {
			return 0;
		}	
		int sum=JosephusProblem(n-1, k)+k;
		int mult=sum%n;
		return mult;
	}
}
