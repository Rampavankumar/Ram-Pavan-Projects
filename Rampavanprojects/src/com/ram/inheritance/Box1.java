package com.ram.inheritance;

public class Box1 {

	double height;
	double weight;
	double length;
	
	Box1(Box1 ob){
		
		height=ob.height;
		weight=ob.weight;
		length=ob.length;
	}
	
	Box1(double h,double w,double l){
		
		height=h;
		weight=w;
		length=l;
	}
	
	Box1(){
		
		height=-1;
		weight=-2;
		length=-3;
	}
	
	double volume(){
		
		return length*weight*height;
		
		
		
		
		
		
		
	}
	
}
	
	