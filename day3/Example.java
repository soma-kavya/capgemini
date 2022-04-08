package com.capg.day3;

class HotelForOne
{
	public void booking(String place)
	{
		System.out.println("Booking hotel in " + place);
	}
	public void booking(int date)
	{
		System.out.println("Booking hotel for one on " + date);
	}
}
class HotelForMany extends HotelForOne
{
	public void booking(String place, int date)
	{
		System.out.println("Booking hotel "+ "at "+ place +" for many on " + date);
	}
	public void booking(double price)
	{
		System.out.println("Booking hotel the price of " + price);
	}
}
public class Example {
	public static void main(String[] args) {
		HotelForMany h = new HotelForMany();
		h.booking("Goa");
		h.booking(20);
		h.booking("Srinagar", 30);
		h.booking(8000.08);
	}
}
