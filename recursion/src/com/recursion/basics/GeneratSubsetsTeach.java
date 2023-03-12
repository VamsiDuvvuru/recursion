package com.recursion.basics;

import java.util.*;

public class GeneratSubsetsTeach {

	public static void main(String[] args) {
		//subsetOfString("abc", "");
		System.out.println(subsetOfStringWithList("abc", ""));
	}

	static void subsetOfString(String st, String ap) {
		if (st.length() == 0) {
			return;
		}
		String st1 = ap + st.charAt(0);
		System.out.println(st1);
		// Take it
		subsetOfString(st.substring(1), st1);
		// Ignore it
		subsetOfString(st.substring(1), ap);

	}

	static List<String> subsetOfStringWithList(String st, String ap) {
		if (st.length() == 0) {
			List<String> l1 = new ArrayList<>();
			l1.add("");
			return l1;
		}
		String st1 = ap + st.charAt(0);
		List<String> l1 = subsetOfStringWithList(st.substring(1), st1);
		l1.add(st1);
		List<String> l2 = subsetOfStringWithList(st.substring(1), ap);
		l2.addAll(l1);
		return l2;
	}

}
