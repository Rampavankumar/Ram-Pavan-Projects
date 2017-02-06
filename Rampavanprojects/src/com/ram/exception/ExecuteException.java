package com.ram.exception;

import java.util.Scanner;

public class ExecuteException {
	
	
	
	static void getdetails()throws NameException{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int value=s.nextInt();
	
		if(value<45){
			throw new NameException("denied");
		}
		else{
			System.out.println("elected");
		}
	}
		public static void main(String[] args){	

			try{
				
				getdetails();
			}
			catch(Exception e){
				System.out.println("he is ecected:"+e);
			}
			
			
			
		}
	}


