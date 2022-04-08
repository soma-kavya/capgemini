package com.capg.day2;

public class TryCatch {

	public static void main(String[] args) {
		
		int a = 1;
        int b = 0;
         
        try 
        {
        	int i = a/b;
			
		} 
        catch (java.lang.Exception e)
        {
			 System.out.println(e.getMessage());
			
		}
        
        finally 
        {
        
        	System.out.println("some error");
        }
	}

}