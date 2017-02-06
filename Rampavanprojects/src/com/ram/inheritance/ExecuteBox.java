package com.ram.inheritance;

public class ExecuteBox {

	public static void main(String[] args) {
		
		Box2 box=new Box2(2,3,4,5);
		Box2 bo=new Box2(4,5,6,70);
		
		double vol;
		vol=box.volume();
		System.out.println(vol);
		System.out.println(box.weight);
		vol=bo.volume();
		
		System.out.println(vol);
	}
}
		
	


