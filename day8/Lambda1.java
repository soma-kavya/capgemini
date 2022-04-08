package com.capg.day8;

//functional interface which have only one method
@FunctionalInterface
interface Lambda {
    // method with parameters
    public void print();
}
interface SumInterface {
    public void sum(int a, int b);
}
public class Lambda1 {
    public static void main(String[] args) {
    	
        int d = 10;

     
        Lambda result = () -> System.out.println("this is lambda");
        result.print();

        SumInterface sumInterface = (int a, int b) -> {

            int c = a + b;
            System.out.println(c);
        };
        
        sumInterface.sum(10, 10);
    }

    public static void print() {
        System.out.println("Hello world");
    }

    public static void addingNumber(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }


}