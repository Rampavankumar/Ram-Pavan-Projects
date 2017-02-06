package com.ram.enums;


//enum clsss{moon,jupitor,sun,mango,green,yellow}

enum Chocolates{
	
	dairymilk(20),kitkat(10),munch(5);
	
	int hie;
	
	Chocolates(int cost){
		
		this.hie=cost;
	
	}
}
public class EnumsMain {
	
	public static void main(String[] args) {
		
	Chocolates ch[]=Chocolates.values();	
	
//	System.out.println(Chocolates.dairymilk);
	
	
	for(Chocolates c:ch){
		
		System.out.println(c);
	
//	System.out.println(c.hie);
	
	
	
	}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		
//		clsss colors[]=clsss.values();
//		
//		System.out.println(clsss.sun);
//		
//		for(clsss cl:colors){
//			
//			System.out.println(cl);
//		}
//		
		
		
	
	
	

