package com.recursion.test;

public class DecodingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeString("3[ac]"));

	}

	public static String decodeString(String s) {
		String decodedString = "";
		String numString = "";
		String chars = "";
		if (s.length() == 0) {
			return "";
		}
		if ((s.charAt(0) + "").equals("[")) {
			String st1 = decodeString(s.substring(1));
			int count = Integer.parseInt(numString.trim().equals("") ? "0" : numString);
			decodedString += appendingString(st1, count);
		} else if ((s.charAt(0) + "").matches("[A-Za-z]{1}")) {
			chars += s.charAt(0);
		} else if ((s.charAt(0) + "").equals("]")) {
			decodedString+= chars;
		} else {
			numString += s.charAt(0);
		}
		return decodedString += decodeString(s.substring(1));
	}

	public static String appendingString(String value, int count) {
		String decodedString = value;
		while (count > 1) {
			decodedString += value;
			count--;
		}
		return decodedString;
	}

}
