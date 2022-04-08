package com.capg.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Mobile {
	int id;
	String name;
	double price;

	public Mobile(int i, String string, int j) {
		this.id = i;
		this.name = string;
		this.price = j;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class Stream {
	public static void main(String[] args) {
		List<Mobile> list = new ArrayList<Mobile>();
	
		Mobile m1 = new Mobile(22, "a", 20000);
		Mobile m2 = new Mobile(25, "b", 25000);
		Mobile m3 = new Mobile(29, "c", 22000);
		list.add(m1);
		list.add(m2);
		list.add(m3);

		list.stream().filter(p -> p.getPrice() >20000).forEach(p -> System.out.println(p.getName()));

	}
}
