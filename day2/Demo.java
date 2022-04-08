package com.capg.day2;

import java.io.IOError;
import java.io.IOException;
public class Demo {

	public static void main(String[] args) {
        
        try
        {
        	String str = null;
        	System.out.println(str.length());
        }
        
        catch(NullPointerException e)
        {
            
            System.out.println(e.getMessage());
        }
        
        finally
        {
        
        	System.out.println("some error");
        }

	}
}
