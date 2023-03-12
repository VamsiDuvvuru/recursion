package com.recursion.basics;

public class RemoveACharacterFromAString {
 
	
	public static void main(String[] args) {
		System.out.println(removeCharacter("abbccauidaaa", 0));
		
	}
	
	static String removeCharacter(String s1,int pos) {
		if(pos==s1.length()) {
			return "";
		}
      if((s1.charAt(pos)+"").equals("a")) {
    	  return removeCharacter(s1,pos+1);
	    }else {
	    	return s1.charAt(pos)+removeCharacter(s1,pos+1);
	    }
	}
}
