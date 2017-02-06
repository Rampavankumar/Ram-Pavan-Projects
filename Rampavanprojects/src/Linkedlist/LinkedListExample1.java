package Linkedlist;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		l.add(5);
		l.addFirst(3);
		l.addLast(100);
		l.add(2, "ganesh");
		l.remove(4);
		//l.size();
		System.out.println(l);
		System.out.println(l.size());
		LinkedList l1=new LinkedList();
		l1.add(3);
		l1.add(3);
		l1.add(3);
		l1.add(3);
		l1.add(3);
		l1.add(3);
		l1.add(3);
		l1.add(l.size());
		l1.add(2,l.size());
		l1.addFirst(10000000);
		System.out.println(l1);
		System.out.println(l1.size());
		
		
		
		
		
	}

}
