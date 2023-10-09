/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;


/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
    /**
     * Create a bunch of actors
     * <p>
     * Let them fight against each others
     * <p>
     * Peer-to-peer fight, the most skilled one wins
     * <p>
     * Wizards always beat warriors
     * <p>
     * In the end, let the user knows who survived
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = {new Wizard("Merlino"), new Warrior("Giovanni"), new Warrior("Achille")};

        for (Actor actor : actors) {
            System.out.println(actor.getName());
        }

        System.out.println("Let's fight ...");
        for(int i = 0; i < actors.length - 1; i ++) {
        	for(int j = i + 1; j < actors.length; j ++) {
        		boolean ris = actors[i].fight(actors[j]);
        		System.out.println(ris ? actors[i].getName() + " won!" : actors[j].getName() + " won!");
        	}
        }
    }
}
