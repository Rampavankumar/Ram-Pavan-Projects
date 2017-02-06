package com.ram.threads;

public class ThreadExample2 {

	public static void main(String[] args) {
		 ThreadExample1 th=new ThreadExample1();
		 
		 th.start();
		 
		 for(int i=0;i<10;i++){
			 System.out.println("ram");
			 
		 }

	}

}
