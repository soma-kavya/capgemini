package com.capg.day5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListEg {

	public static void main(String[] args) {

		ArrayList<Integer>p = new ArrayList<Integer>(); 
		
		 // adding
		p.add(0);
		p.add(1);
		p.add(6);
		p.add(2);
		p.add(3);
		
		System.out.println(p);
		
		 Iterator itr=p.iterator();  
		 while(itr.hasNext())      
		 {  
			 System.out.println(itr.next());  
		 }  
		
		
		
	}

}