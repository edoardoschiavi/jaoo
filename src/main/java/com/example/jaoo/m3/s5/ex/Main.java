/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.Arrays;

/**
 * Interface vs class exercise
 */
public class Main {
    /**
     * See requests in the "to do" comments
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: (1) put objects of (at least) three different types in this array
        Vehicle[] vehicles = {new MotorBike(), new Bus(), new Car(), new Vehicle()};
        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions
        for(int i = 0; i < vehicles.length; i ++) {
        	if(i % 2 == 0) {
        		vehicles[i].LeftSteer();
        	} else {
        		vehicles[i].RightSteer();
        	}
        
        }

        // TODO: (3) put objects of (at least) three different types in this array
        Conditioning[] conditionings = {new Flat(), new Car(), new Bus()};
        System.out.println(Arrays.toString(conditionings));

        // TODO: (4) set the temperature of each conditioned to 20
        for(Conditioning conditioning : conditionings ) {
        	conditioning.SetTemperature(20);
        }
    }
}
