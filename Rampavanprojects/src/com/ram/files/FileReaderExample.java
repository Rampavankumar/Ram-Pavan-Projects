package com.ram.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

		public static void main(String[] args) throws IOException {
			File file=new File("abs.txt");
			
			FileReader kr=new FileReader(file);
			
			int k=kr.read();
			while(k!=-1){
				System.out.println((char)k);
			
			k=kr.read();
			
			}
	}

}
		
