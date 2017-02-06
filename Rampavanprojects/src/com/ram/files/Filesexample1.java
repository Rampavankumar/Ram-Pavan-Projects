package com.ram.files;

import java.io.File;
import java.io.IOException;

public class Filesexample1 {

	public static void main(String[] args) throws IOException {
		File file=new File("ab.txt");
		
		//System.out.println(file.exists());
		//file.createNewFile();
		//System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		
		
		//System.out.println(file.exists());
		//System.out.println(file.createNewFile());
		
		File dir=new File("rampavan");
		System.out.println(dir.exists());
		dir.mkdir();
		
		System.out.println(file.getAbsolutePath());
		System.out.println(dir.exists());
		System.out.println(dir.getAbsolutePath());
		
		
	//File file1=new File("temp","demo.txt");
	
	//System.out.println(file1.exists());
	//file1.createNewFile();
	//System.out.println(file1.exists());
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
	}


