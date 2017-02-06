package com.ram.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		
		h.put(1, "ram");
		h.put(2, "pavan");
		h.put(3, "naresh");
		h.put(4, "vamc");
		h.put(5, "kumar");
		h.put(6, "sunitha");
		h.put(7, "venkateswarlu");
		h.get(1);
		
		System.out.println(h);
		System.out.println(h.put(1, "krishna"));
		System.out.println(h.get(1));
		
		Set s=h.keySet();
		
		System.out.println(s);
		
		Collection c=h.values();
		System.out.println(c);
		
		Set se=h.entrySet();
		
		
		
		
		
		

	}

}
