package com.ram.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Properties;

public class Properties1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Properties p=new Properties();
		p.load(new FileInputStream("src/com/ram/properties/ab.txt"));
		
		System.out.println(p);
		
		
		
	
		
	


	}
}

