/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s6;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * This exercise should be solved using a method in a primitive wrapper
 */
public class Exercise {
	//initialize logger
	private static final String Error_NaN = "You have to insert valid number!";
	
	private static final Logger log = Logger.getGlobal();
	
    /**
     * See requests in the "to do" comments
     * 
     * @param args used to test the code
     */
    public static void main(String[] args) {
    	int i = 0;
        if (args.length != 1) {
            System.out.println("Pass me one argument!");
        } else {
            // TODO (1) check if the argument contains only digits
        	for(i = 0; i < args[0].length(); i++) {
        		if(!Character.isDigit(args[0].charAt(i))) {
        			log.warning("");
        			System.out.println("The word NOT contains only digits!");
        			break;
        		}	
        	}
        	if(i == args[0].length())
        		System.out.println("The word contains only digits!");
        	
        	System.out.println();
        	System.out.println(Character.isLetter(args[0].charAt(0)) ? "First char is a letter" : "First char is not a letter");
        	
        	// TODO (2) check if the argument contains at least one digit
        	for(i = 0; i < args[0].length(); i++) {
        		if(Character.isDigit(args[0].charAt(i))){
        			System.out.println("");
        			System.out.println("Right!");
        			break;
        		}	
        	}
        	System.out.println();
            System.out.println("Done");
        }
       
        if(args.length == 2) {
        	System.out.println(Arrays.toString(args));
        	try {
        		@SuppressWarnings("unused") int index = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				log.log(Level.SEVERE, Error_NaN, e);
			}
        }
    }
}
