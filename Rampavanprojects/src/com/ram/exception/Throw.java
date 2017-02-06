package com.ram.exception;

public class Throw {

	
	static void throwone(){
		
		try{
			throw new NullPointerException("denied");
			
			
		}catch(NullPointerException e){
			System.out.println("rsm");
			throw e;
		}
	}
		public static void main(String[] args){
			try{
				throwone();
			}catch(NullPointerException e){
				System.out.println("pass"+e);
				
				
			}
		
			
		}
		
			
	}


