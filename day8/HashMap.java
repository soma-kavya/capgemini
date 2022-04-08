package com.capg.day8;

import java.util.HashSet;
import java.util.LinkedHashSet;

 

public class HashMap{

 

    public static void main(String[] args) {
        
  
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        set.add(10);
        set.add(1);
        set.add(100);
        set.add(105);
        set.add(10);
        System.out.println(set);
        
        
        Object[] arr=set.toArray();
        System.out.println(arr.length);
        for(Object obj:arr)
        {
            System.out.println((Integer)obj);
        }
     
        set.contains(10);
        set.forEach(System.out::println);
     
        set.size();
        
        
    }
}