package com.ram.files;

import java.io.File;
import java.io.IOException;

public class Fileexample2 {

	public static void main(String[] args) throws IOException {
		File king=new File("ram.txt");
		
		if(king.exists() == false)
			
			king.createNewFile();
			System.out.println(king.createNewFile());
			
		}
		
	}


