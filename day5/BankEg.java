package com.capg.day5;

class Bank {
	
	private long id;
	private String name;
	
	public void setId(long id) 
	{
		this.id = id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	//public int getId()
	public long getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
public class BankEg {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setId(1234567890);
		b1.setName("SBI");
		System.out.println(b1.getId());
		System.out.println(b1.getName());
	}
}