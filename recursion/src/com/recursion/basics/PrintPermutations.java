package com.recursion.basics;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="abcd";
		//permutationsOfString(st,0);	
//		for(int i=0;i<st.length();i++) {
//			System.out.println(swap(st,0,i));
//		}
		//printPermutations("abcd","");
		printPermutationsMine("abcd","");

	}
	
	static void permutationsOfString(String st,int n) {
		if(n==st.length()) {
			System.out.println(st);
			return;
		}
		for(int i=0;i<st.length();i++) {
			System.out.println(swap(st,n,i));
			permutationsOfString(st, n+1);
		}
		
	}

	static String swap(String st,int i1,int j1) {//i==0,st=abcd
		char[] c1=st.toCharArray();
		String temp=c1[i1]+"";
		c1[i1]=c1[j1];
		c1[j1]=temp.charAt(0);
		return new String(c1);
	}
	
	static void printPermutations(String str, String current) {
	    if (str.length() == 0) {
	        System.out.println(current);
	        return;
	    }
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        String remaining = str.substring(0, i) + str.substring(i + 1);
	        printPermutations(remaining, current + c);
	    }
	}
	
	static void printPermutationsMine(String str, String current) {
		if(str.length()==0) {
			System.out.println(current);
		}
	    for(int i=0;i<str.length();i++) {
	    	String st1=str.charAt(i)+"";
	    	String rem=str.substring(0,i)+str.substring(i+1);
	    	printPermutations(rem, current+st1);
	    }
	}

}
