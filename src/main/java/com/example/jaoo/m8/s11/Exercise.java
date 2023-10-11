/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * HashMap exercise
 */
public class Exercise {
    /**
     * Extract non-duplicated values in input and return them as a Collection, for
     * example:
     * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public Collection<Integer> singles(int[] data) {
        var hashMap = new HashMap<Integer, Integer>();
        for(Integer i : data) {
        	// Tre modi per farlo
        	Integer num = hashMap.putIfAbsent(i, 1);
        	if(num != null)
        		hashMap.put(i, num + 1);
        	
//			hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
			
			
//        	if(hashMap.containsKey(i)) {
//        		hashMap.put(i, hashMap.get(i) + 1);
//        	} else {
//        		hashMap.put(i, 1);
//        	}
       }
        
        var correctValues = new ArrayList<Integer>();
        
        for(Integer key : hashMap.keySet()) {
        	if(hashMap.get(key) == 1)
        		correctValues.add(key);
        }
        
        return correctValues;
    }

    public static void main(String[] args) {
        Collection<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
        System.out.println(result);
    }
}
