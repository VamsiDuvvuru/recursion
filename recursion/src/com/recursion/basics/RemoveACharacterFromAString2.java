package com.recursion.basics;

public class RemoveACharacterFromAString2 {
 
	
	public static void main(String[] args) {
		System.out.println(removeCharacter("abbccauidaaa"));
		
	}
	
	static String removeCharacter(String s1) {
		if(s1.equals("")) {
			return "";
		}
		char ch=s1.charAt(0);
		if(ch=='a') {
			return removeCharacter(s1.substring(1));
		}else {
			return ch+removeCharacter(s1.substring(1));
		}
	}
}
