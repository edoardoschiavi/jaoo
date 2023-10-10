package com.example.jaoo.m3.s9.ex1;

public class Warrior extends Actor {
	private int strength;

	protected Warrior(String name, int strength) {
		super(name);
		this.strength = strength;
	}

	@Override
	public boolean fight(Actor enemy) {
		// TODO Auto-generated method stub
		if(enemy instanceof Wizard) {
			return false;
		} else if(enemy.getValue() > strength) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return strength;
	}

}
