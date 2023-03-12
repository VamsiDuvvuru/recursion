package com.recursion.basics;

public class PalindromeCheckUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="motor";
		String st1=palindromeCheck(st, -1);
//		if(st.equalsIgnoreCase(st1)) {
//			System.out.println("palindorm");
//		}else {
//			System.out.println("Not a palindorm");
//		}	
		boolean palindrome=isPalindrome(st1, 0, st.length()-1);
		if(palindrome) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	public static String palindromeCheck(String st,int i) {
		String st1="";
		if(i==st.length()) return "";
		i=i+1;
		st1+=palindromeCheck(st, i);
		if(i<st.length()) {
			st1+=st.charAt(i);
		}
		return st1;
	}
	public static String palindromeCheck(String st) {
		String st1="";
		if(st.length()<=0) return "";
		palindromeCheck(st.substring(st.length()-1));
		return st1;
	}
	
	private static boolean isPalindrome(String st,int start,int end){
		if(start>end) return true;
		else
			if((st.charAt(start)+"").equals(st.charAt(end)+"")) {
				start=start+1;
				end=end-1;
				return isPalindrome(st, start, end);
			}else {
				return false;
			}
	}
	

}
