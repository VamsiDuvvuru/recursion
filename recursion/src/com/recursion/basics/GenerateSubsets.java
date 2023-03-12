package com.recursion.basics;
import java.util.*;

public class GenerateSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="abcdef";
		subsetsOfString(st, 0);
	}
	
	private static void subsetsOfString(String st,int i) {
		if(i>=st.length()) return;
		int j=i;
		String temp="";
		while(j<=st.length()) {
			temp=st.substring(i,j);
			System.out.println(st.substring(i,j));
			j++;
		}
		//take care of end characters
		int j1=0;
		while(temp.length()<st.length()-1) {
			temp+=st.charAt(j1);
			System.out.println(temp);
			j1++;
		}
		
		
		subsetsOfString(st, i+1);
	}

}
