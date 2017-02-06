package com.ram.Set;

import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet();
		/*
		System.out.println(treeSet.add(10)); 
		
		System.out.println(treeSet.add(0)); //0.comareTo(10);
		
		System.out.println(treeSet.add(1));
		
		System.out.println(treeSet.add(-1));*/
		
		System.out.println(treeSet.add("A"));
		System.out.println(treeSet.add("Z"));
		System.out.println(treeSet.add("b"));
		System.out.println(treeSet.add("c"));
		System.out.println(treeSet.add("y"));
		System.out.println(treeSet.add("a"));
		System.out.println(treeSet.add("g"));
		System.out.println(treeSet.add("t"));
		System.out.println(treeSet.add("e"));
		System.out.println(treeSet.add("v"));
		System.out.println(treeSet.add(new StringBuffer("ram")));
		//System.out.println(treeSet.add(10));
		
		//System.out.println(treeSet.add(treeSet));
		  
		//System.out.println(treeSet.add(null));
		System.out.println(treeSet);
		
		
		
	}
	
}
