package com.ram.Set;

import java.util.Enumeration;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("rakesh");
		lhs.add("nithin");
		lhs.add("kolli");
		lhs.add("abhi");
		lhs.add("sukhesh");
		lhs.add("ashok lungi");

		lhs.add(null);
		System.out.println(lhs);
		
	
	}

}
