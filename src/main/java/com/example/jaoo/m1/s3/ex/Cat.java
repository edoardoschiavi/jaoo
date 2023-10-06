/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

/**
 * A sample class. Each object has two fields, a constructor, two methods
 * (overload), and toString() method.
 * <p>
 * At class level it is defined a field, the cat counter.
 */
public class Cat {
    private static int count = 0;

    private String name;
    

	private String color;

    /**
     * Cat with a given name and color
     * 
     * @param name  the cat name
     * @param color the cat color
     */
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        
        count ++;
    }

    /**
     * @return the number of cats created via ctor
     */
    public static int getCount() {
        return count;
    }

    /**
     * The current cat meow on the console
     */
    public void meow() {
        System.out.println("Meow");
    }

    /**
     * The current cat meow on the console
     * 
     * @param word to be printed on out console
     */
    public void meow(String word) {
        System.out.println("Cat: " + this.name + ", color: " + this.color + ", MEOW");
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", color=" + color + "]";
    }
    public String getName() {
		return name;
	}
}
