package com.capg.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayEg {

	public static void main(String[] args) {
	
		ArrayList<String>list = new ArrayList<String>();
		//Adding elements
		list.add("abc");
		list.add("akhil");
		list.add("arjun");
		list.add("sushi");
		System.out.println(list);
		
		//Insert an element to the ArrayList at the end
		list.add("kavya");
		System.out.println(list);
		
		list.add(2,"aaa");
		System.out.println(list);
		
		//Update an element to the ArrayList
		list.set(4, "puja");
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
