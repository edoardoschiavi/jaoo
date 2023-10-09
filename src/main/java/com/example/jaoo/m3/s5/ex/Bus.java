/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();
    private int temperature;

    /**
     * No-arg constructor
     */
    public Bus() {
        log.info("Bus created");
        this.temperature = 0;
    }
    
    @Override
    public void LeftSteer() {
    	System.out.println("The bus is left steering.");
    }
    
    @Override
    public void RightSteer() {
    	System.out.println("The bus is right steering.");
    }

	@Override
	public void SetTemperature(int x) {
		this.temperature = x;
		
	}
}
