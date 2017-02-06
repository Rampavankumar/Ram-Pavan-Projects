package first;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
//		String st="rampavankumar";
//		
//		StringBuilder sb=new StringBuilder();
//		sb.append(st);
//		sb=sb.reverse();
//		System.out.println(sb);
//		for(int i=0;i<sb.length();i++)
//			System.out.println(sb.charAt(i));
//		}
//	}
//
//		
//		
			 
			/*  int input=1234567890;
			  StringBuilder input1 = new StringBuilder();
			  input1.append(input);
			  input1=input1.reverse(); 
			  for (int i=0;i<input1.length();i++)
			  System.out.print(input1.charAt(i));  
			 }
}*/


		Scanner s=new Scanner(System.in);
		System.out.println("enter the string you want to reverse");
		String ram=s.next();
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(ram);
		
		sb=sb.reverse();
		
		System.out.println(sb);
		for(int i=0;i<sb.length();i++){
			System.out.println(sb.charAt(i));
			
			
			
		}
		
	}
	}

		
		
		
		
				
		
		
		
		
		
