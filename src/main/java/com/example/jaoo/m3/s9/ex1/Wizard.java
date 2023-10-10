package com.example.jaoo.m3.s9.ex1;

public class Wizard extends Actor {
	int MagicLevel;

	protected Wizard(String name, int MagicLevel) {
		super(name);
		this.MagicLevel = MagicLevel;
	}
	
	public int getMagicLevel() {
		return MagicLevel;
	}

	@Override
	public boolean fight(Actor enemy) {
		// TODO Auto-generated method stub
		if(enemy instanceof Warrior) {
			return true;
		} else if(enemy.getValue() > MagicLevel) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return MagicLevel;
	}

}
