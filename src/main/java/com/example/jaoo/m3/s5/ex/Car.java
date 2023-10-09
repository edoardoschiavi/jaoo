/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
	
    private static final Logger log = Logger.getGlobal();
    private int temperature;

    /**
     * No-arg constructor
     */
    public Car() {
        log.info("Car created");
        this.temperature = 0;
    }
    @Override
    public void LeftSteer() {
    	System.out.println("The car is left steering.");
    }
    
    @Override
    public void RightSteer() {
    	System.out.println("The car is right steering.");
    }
	@Override
	public void SetTemperature(int x) {
		this.temperature = x;	
	}
}
