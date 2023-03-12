package com.recursion.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfPower(5, 2);
	}

   static int sumOfPower(int N,int K) {
	   if(N<=0) {
		   return 0;
	   }
	   return (int)Math.pow(sumOfPower(N-1, K),K)
			   +(int)Math.pow(sumOfPower(N-2, K),K);
   }
}
