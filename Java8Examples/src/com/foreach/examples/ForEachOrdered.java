package com.foreach.examples;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrdered {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Maggie");
		names.add("Michonne");
		names.add("Rick");
		names.add("Merle");
		names.add("Governor");

		/*
		 *  forEach - the output would be in any order
		 */
		System.out.println("Print using forEach");
		names.stream().filter(f -> f.startsWith("M")).parallel().forEach(System.out::println);

		/*
		 * forEachOrdered - the output would always be in this order: Maggie, Michonne,
		 * Merle
		 */
		System.out.println("Print using forEachOrdered");
		names.stream().filter(f -> f.startsWith("M")).parallel().forEachOrdered(System.out::println);
	}

}
