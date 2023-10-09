/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Flat is-a Conditioning
 */
public class Flat implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private int temperature;

    /**
     * No-arg constructor
     */
    public Flat() {
        log.info("Flat created");
        this.temperature = 0;
    }

	@Override
	public void SetTemperature(int x) {
		this.temperature = x;
	}
}
