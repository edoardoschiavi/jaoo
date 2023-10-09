/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * Base of a class hierarchy
 * <P>
 * TODO: it should steer left/right, it should brake
 */
public class Vehicle {
    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public Vehicle() {
        log.info("Vehicle created");
    }
    
    public void LeftSteer() {
    	System.out.println("The vehicle is left steering!");
//    	System.out.println(getClass().getSimpleName() + " is left steering!");
    }
    
    public void RightSteer() {
    	System.out.println("The vehicle is right steering!");
    }
}

