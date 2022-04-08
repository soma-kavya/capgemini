package com.capg.day6;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class TreeMaps {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();

		// key as string and value as integer
		map1.put("abc", 1001);
		// integer //user defined
		TreeMap<Integer, Student> map2 = new TreeMap<Integer, Student>();
		// <int, String ,String>
		map2.put(1001, new Student(1001, "abc", "1000"));
		map2.put(1001, new Student(1001, "abc", "1000"));
		map2.put(1001, new Student(1001, "abc", "1000"));
		map2.put(1001, new Student(1001, "abc", "1000"));
		map2.put(1001, new Student(1001, "abc", "1000"));

		TreeMap<Student, Student> map3 = new TreeMap<Student, Student>();

		TreeMap<Student, Integer> map4 = new TreeMap<Student, Integer>();

		TreeMap<Student, String> map5 = new TreeMap<Student, String>();

		map5.put(null, null);

		map5.pollFirstEntry();
		map.pollLastEntry();

		map5.descendingKeySet();

		map5.firstKey();
		map5.lastKey();
		map.put(1001, "arjun");
		map.put(1002, "kavya");
		map.put(1003, "soma");
		map.put(1004, "ajay");
		map.put(1004, "akhil");


		Set<Integer> keys = map.keySet();

		for (Integer key : keys) {
			System.out.println("key " + key + " value " + map.get(key));
		}

		
		System.out.println(map.containsValue("umesh"));

		// map of entry set
		// Map.Entry<Integer, String>
		Set<Map.Entry<Integer, String>> key = map.entrySet();

		for (Map.Entry<Integer, String> m : key) {

			System.out.println(m.getKey() + " Value is " + m.getValue());
		}
		
		map.isEmpty();
		map.size();
		Collection<String> value = map.values();
		value.forEach(System.out::println);
	}

}
