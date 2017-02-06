package com.ram.venture;

import java.util.Vector;

public class VectorExample1 {

	/*public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<10;i++){
			v.addElement(i);
		}
			System.out.println("enter the numbers inserted"+v.capacity());
			v.addElement(20);
			System.out.println(v.capacity());
			System.out.println(v);
			
		}
}*/
		
	public static void main(String[] args) {
		
	Vector vector  = new Vector();	
	for(int i=0;i<20;i++){
		
		vector.addElement(i);
	}
	System.out.println("initial capacity for vecotr is  "+vector.capacity());
	
	vector.addElement(20);
	
	System.out.println("initial capacity for vecotr is after 20 added  "+vector.capacity());
	System.out.println("elemetns are "+vector);

	}

}
