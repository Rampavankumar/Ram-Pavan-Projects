package com.ram.exception;


public class Exceptionexample {
	

		static void throwOne() throws IllegalAccessException{		
			System.out.println("Inside the throwOne method");
			throw new IllegalAccessException("demo");
		}
		
		public static void main(String[] args) {
			try {
				throwOne();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			}
		}
		
			
		}
	

		
	





		
		


	

