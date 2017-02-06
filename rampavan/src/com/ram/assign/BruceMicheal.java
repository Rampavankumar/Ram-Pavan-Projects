package com.ram.assign;

import java.util.Scanner;

public class BruceMicheal {

	public static void main(String[] args) {

		int bruce = 100;
		int micheal = 200;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bruce price");

		bruce = sc.nextInt();

		System.out.println("enter the micheal price");
		micheal = sc.nextInt();

		System.out.println("The Numbers that were entered are :");
		System.out.println("micheal :" + micheal);
		System.out.println("bruce :" + bruce);

		if (bruce > micheal) {
			System.out.println("bruce wins");
		} else if (bruce == micheal) {

			System.out.println("no won wins");
		} else {
			System.out.println("micheal wins");
		}
	}

}
