package com.foreach.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachClassMap {

	public static void main(String[] args) {

		/*
		 * forEach method with Map
		 */
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Monkey");
		hmap.put(2, "Dog");
		hmap.put(3, "Cat");
		hmap.put(4, "Lion");
		hmap.put(5, "Tiger");
		hmap.put(6, "Bear");

		hmap.forEach((key, value) -> System.out.println(key + " - " + value));

		hmap.forEach((key, value) -> {
			if (key == 4) {
				System.out.println("Value associated with key 4 is: " + value);
			}
		});

		hmap.forEach((key, value) -> {
			if ("Cat".equals(value)) {
				System.out.println("Key associated with Value Cat is: " + key);
			}
		});

		/*
		 * forEach method with List
		 */
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Pear");
		fruits.add("Mango");
		// lambda expression in forEach Method
		fruits.forEach(str -> System.out.println(str));

		/*
		 * forEach Method with Streams
		 */
		List<String> names = new ArrayList<>();
		names.add("Maggie");
		names.add("Michonne");
		names.add("Rick");
		names.add("Merle");
		names.add("Governor");
		names.stream().filter(f -> f.startsWith("M")).forEach(System.out::println);
	}
	
}
