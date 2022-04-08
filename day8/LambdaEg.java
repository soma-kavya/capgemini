package com.capg.day8;
@FunctionalInterface 
interface StudetDetails {
	public void student();
}

interface StudentId {
	public void id(int p);
}

interface StudentName {
	public void name(String nm);
}

public class LambdaEg{
	public static void main(String[] args) {

		// interfacename
		StudetDetails a = () -> System.out.println("student details");
		a.student(); // to get the result
		
		StudentId b = (int p) -> System.out.println("Student Id is "+p);
		b.id(102);
		
		StudentName c = (String nm) ->System.out.println("Student Name "+nm);
		c.name("kavya");
	}
}