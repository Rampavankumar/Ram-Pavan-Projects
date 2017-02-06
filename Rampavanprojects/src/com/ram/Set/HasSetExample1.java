package com.ram.Set;

import java.util.HashSet;

public class HasSetExample1 {
	
  public static void main(String[] args) {
	HashSet hashSet = new HashSet();
	
	hashSet.add("a");
	hashSet.add("b");
	hashSet.add("c");
	hashSet.remove("a");
	
	System.out.println(hashSet);
	
System.out.println(hashSet.add("a"));
hashSet.add(null);
System.out.println(hashSet);

	
}

}
