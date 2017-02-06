package com.ram.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Receiver {

	public static void main(String[] args) {
		
		TreeSet s=new TreeSet();
		
    TreeSetExample ts=new TreeSetExample();
    
    s=ts.sender();
    
    System.out.println(s);
    
    Iterator it=s.iterator();
    while(it.hasNext()){
    	String sp=(String)it.next();
    	System.out.println(sp);
    }
    
    

		
	}

}
