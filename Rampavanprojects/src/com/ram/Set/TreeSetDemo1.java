package com.ram.Set;

import java.util.TreeSet;

public class TreeSetDemo1 {

	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(20);
		ts.add(0);
		ts.add(15);
		ts.add(30);
		
		System.out.println(ts);
		
	}
}
