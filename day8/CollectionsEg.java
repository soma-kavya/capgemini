package com.capg.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

 


//Create A list of integer 
//Create A list of String
//Create A list of Double

 

//Insert , Update ,Delete , Sort the element 
//Search by element and index 

 

public class CollectionsEg {

 

    public static void main(String[] args) {

 

        LinkedList<Integer> ls = new LinkedList<Integer>();
        // add method of list
        ls.add(15);
        ls.add(20);
        ls.add(10);
        ls.add(100);
        ls.add(35);
        
        Collections.sort(ls,Collections.reverseOrder());

        System.out.println(ls.contains(101));
        System.out.println(ls.equals(35));

        ls.forEach(System.err::println);

        System.out.println(ls.isEmpty());
        
        System.out.println(ls);

        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println("it "+it.next());
        }
       
        //size of list
        ls.size();
        
        //update the value using index
        ls.set(0, 200);
        
        System.out.println(ls);

        //linked List method
        ls.addFirst(1);
        ls.addLast(1000);
        
        System.out.println(ls);
      //linked List method
       Iterator<Integer> rit=ls.descendingIterator();
       while(rit.hasNext())
       {
           System.out.println(rit.next());
       }
       
       //it will give me the first element
      System.out.println(ls.getFirst());
      
      System.out.println(ls.getLast());
      
      ls.offer(10001);
      System.out.println(ls);
   
      System.out.println(ls.peek());
      
      //return the first
      System.out.println(ls.peekFirst());
      
      System.out.println(ls.peekLast());
      
      
      //it will return and remove element also
      System.out.println(ls.poll());
      System.out.println(ls.pollFirst());
      System.out.println(ls.pollLast());
      System.out.println(ls);
      
      ls.removeFirst();
      ls.removeLast();
    }

 

}
 

https://github.com/soma-kavya/capgemini.git