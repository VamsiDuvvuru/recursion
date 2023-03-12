package com.recursion.basics;

import java.util.Arrays;
import java.util.*;

public class GenerateSubsetSumUsingRecursionMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,2,3);
		System.out.println(subsetSum(l1,0));

	}
	
	static List<Integer> subsetSum(List<Integer> l1,int sum){
		if(l1.size()==0) {
			List<Integer> l2=new ArrayList<>();
			return l2;
		}
		int tempSum=sum+l1.get(l1.size()-1);
		List<Integer> l4=subsetSum(l1.subList(0, l1.size()-1), tempSum);
		l4.add(tempSum);
		List<Integer> l5=subsetSum(l1.subList(0, l1.size()-1), sum);
		l5.addAll(l4);
		return l5;
	}

}
