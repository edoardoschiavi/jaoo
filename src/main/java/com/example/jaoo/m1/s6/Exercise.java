/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s6;

/**
 * This exercise should be solved using a method in a primitive wrapper
 */
public class Exercise {
    /**
     * See requests in the "to do" comments
     * 
     * @param args used to test the code
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pass me one argument!");
        } else {
            // TODO (1) check if the argument contains only digits
        	for(int i = 0; i < args[0].length(); i++) {
        		if(!Character.isDigit(args[0].charAt(i))) {
        			System.out.println("Wrong!");
        			break;
        		}
        		System.out.println("Right!");
        			
        	}
            // TODO (2) check if the argument contains at least one digit
        	for(int i = 0; i < args[0].length(); i++) {
        		if(Character.isDigit(args[0].charAt(i))){
        			System.out.println("");
        			System.out.println("Right!");
        			break;
        		}	
        	}
        	System.out.println();
            System.out.println("Done");
        }
    }
}
