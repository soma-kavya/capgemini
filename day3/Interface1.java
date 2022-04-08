package com.capg.day3;

interface In1 {
	float a = 10;
}

interface In2 {
	void display();
}

public class Interface1 implements In1, In2 {

	public void display() {
		System.out.println("Interface program");
	}

	// Driver Code
	public static void main(String[] args) {
		Interface1 p = new Interface1();
		p.display();
		System.out.println(a);
	}
}