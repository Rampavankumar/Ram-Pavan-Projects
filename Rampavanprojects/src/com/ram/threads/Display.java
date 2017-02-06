package com.ram.threads;

public class Display {
	

		public synchronized void wish(String name) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning!!!" + name);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(name);
				}
}
		}
}