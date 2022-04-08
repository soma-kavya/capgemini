package com.capg.day3;

interface Vehicle1 
{
	void bike1();

	void bike2();
}
interface Vehicle2 
{
		void bike1();
}
class Fly
{
	public void bike1(){ 
		String name = "Yamaha";
		float speed = 100;
		System.out.println(name);
		System.out.println(speed);
	}
	public void bike2() {
		String name = "HERO";
		float speed = 80;
		String color = "Black";
		System.out.println(name);
		System.out.println(speed);
		System.out.println(color);
	}
}
public class Interface2 implements Vehicle1, Vehicle2
{
		public static void main(String[] args) 
		{
			new Fly().bike1();
			new Fly().bike2();
		}
		
		public void bike1()
		 {
			
		}
		
		public void bike2() {
			
		}
}