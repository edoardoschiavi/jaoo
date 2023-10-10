/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
	private String name;
    /**
     * Canonical constructor
     * 
     * @param name the actor name
     */
    protected Actor(String name) {
        // TODO
    	this.name = name;
    }
    
    public String getName() {
    	return  name;
    }
    
    public abstract int getValue();

    /**
     * Fight against an enemy
     * 
     * @param enemy another actor
     * @return true if the current actor wins
     */
    public abstract boolean fight(Actor enemy);
}
