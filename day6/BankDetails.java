package com.capg.day6;

public class BankDetails {
	int id;
	String name;
	
	BankDetails(int id,String name ){
		this.id = id;
		this.name = name;
	}
	public void setId(int id)

	{
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId()

	{
		return id;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Bank1 [id=" + id + ", name=" + name + "]";
	}
	
}