package com.capg.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
	        // List of data
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(10);
	        list.add(20);
	        list.add(1);
	        list.add(-4);
	        list.add(-8);        
	     
	        long count = list.stream() 
	                .filter(e -> e < 0).map(num->num*2).sorted(Collections.reverseOrder()).distinct() .count();
	      
	         System.out.println(count);
	        
	    }
}
