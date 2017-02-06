package com.ram.threads;

public class ExecuteExample3 {

	public static void main(String[] args) {
		
		Myrunnable th=new Myrunnable();
		Thread t=new Thread(th);
		t.start();
		for(int i=0;i<10;i++){
		System.out.println("ram");
	}

	}
}
