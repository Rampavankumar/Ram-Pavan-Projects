package com.ram.assign;

import java.util.Scanner;



public class Basic {
	public static void main(String[] args) {
		
		int maths,science,social,telugu,hindi,gk;
		int total;
		int percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks 1 to 100 :");
		System.out.println("enter the maths marks :");
		
		int marks =sc.nextInt();
		
		System.out.println("enter the science marks :");
		
		science=sc.nextInt();
		
		System.out.println("enter the telugu marks :");
		
		telugu =sc.nextInt();
		System.out.println("enter the social marks :");
		social=sc.nextInt();
		System.out.println("enter the hindi marks :");
		hindi=sc.nextInt();
		System.out.println("enter the gk marks :");
		gk=sc.nextInt();
		
		if (marks>100||marks<0|| science>100||science<0|| social>100||social<0|| hindi>100||hindi<0||gk>100||gk<0||telugu>100||telugu<0) {
			
			System.out.println("you entered invalid marks");
			
			
		} else {

			total=marks+science+social+telugu+hindi+gk;
			
			percentage=total/6;
			
			if(percentage<40){
				System.out.println("you are failed");
			}
			else if(percentage>=40&& percentage<60){
				System.out.println("you percentage was avearge :"+percentage+"%");
			}
			
			else if(percentage>=60&& percentage<80){
				System.out.println("you percentage was good  :"+ percentage +"%");
			}
			else if(percentage>=80&& percentage<90){
				System.out.println("you percentage was very good"+percentage);
			}
			else 
				System.out.println("you percentage was excellent"+percentage);
		}
	}

		
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	