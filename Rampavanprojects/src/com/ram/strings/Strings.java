package com.ram.strings;

public class Strings {
	
	public static String concatwithString(){
		
		String s="ram";
		
		for(int i=0;i<100000;i++){
			
			s=s+"sita";
			
			
		}
		return s;
		
	}
public static String concatwithstringbuffer(){
	
	
	StringBuffer ch=new StringBuffer("ram");
	
	for(int i=0;i<100000;i++){
		
		ch=ch.append("sita");
		
		
		
		
		
		
	}
	return ch.toString();
	
	

}
public static void main(String[] args){
	
	long  starttime=System.currentTimeMillis();
	
	concatwithString();
	
	
	System.out.println("the concatination of"+(System.currentTimeMillis()-starttime));
	
	
	starttime=System.currentTimeMillis();
	
	concatwithstringbuffer();
	
	System.out.println("the concatination of"+(System.currentTimeMillis()-starttime));
	
}	
	
}	
	
	
	
	
		

