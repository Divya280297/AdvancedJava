package com.divya.clientClass;

import com.divya.LinkedList.LinkedList;

public class Program {
	public static void main(String args[]) {
		LinkedList<String> names=new LinkedList<String>();
		names.add("One");
		names.add("Two");
		names.add("Three"); 
		String str = names.get(0);
		System.out.println("Check--->"+str);
		System.out.println(names.toString());
	}
	
}
