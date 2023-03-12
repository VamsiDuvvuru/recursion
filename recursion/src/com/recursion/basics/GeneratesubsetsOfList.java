package com.recursion.basics;
import java.util.*;

public class GeneratesubsetsOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> l1=Arrays.asList(1,2,3,5);
      List<Integer> l2=new ArrayList<>();
      System.out.println(subsetsOfList(l1,l2));
	}
	
	static List<List<Integer>> subsetsOfList(List<Integer> l1,List<Integer> l3 ){
		List<Integer> temp=l3;
		if(l1.size()==0) {
			List<List<Integer>> l21=new ArrayList<>();
			//List<Integer> l2=new ArrayList<>();
			//l2.add(0);
			//l21.add(l2);
			return l21;
		}
		List<Integer> l6=new ArrayList<>();
		if(l3.size()>0) {
			l6.addAll(l3);
		}
		l6.add(l1.get(0));
		l1=l1.subList(1, l1.size());
		List<List<Integer>> l4=subsetsOfList(l1, l6);
		l4.add(l6);
		List<List<Integer>> l5=subsetsOfList(l1, temp);
		l5.addAll(l4);
		return l5;
	}

}
