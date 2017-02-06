package com.ram.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriterexample {

	public static void main(String[] args) throws IOException {
		File file=new File("abs.txt");
		
		FileWriter fw=new FileWriter(file);
		
		fw.write('a');
		fw.write("ram");
		fw.write("abc");
		fw.write(65);
		fw.write(69);
		char[] ch={'a','s','d','f','g'};
		
		
		fw.write(ch);
		fw.write('a');
		fw.write('a');
		fw.write('a');
		fw.write('\n');
		fw.write('a');
		fw.write('a');
		fw.write('a');
		
		fw.flush();
		System.out.println("it got printed");
		fw.close();
		
		
		
		
		
	}

}
