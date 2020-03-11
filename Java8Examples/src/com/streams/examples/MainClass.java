package com.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String []ar) {
		
		
		List<Student> listStudents = new ArrayList<>();
		 
		listStudents.add(new Student("Alice", 82));
		listStudents.add(new Student("Bob", 90));
		listStudents.add(new Student("Carol", 67));
		listStudents.add(new Student("David", 80));
		listStudents.add(new Student("Eric", 55));
		listStudents.add(new Student("Frank", 49));
		listStudents.add(new Student("Gary", 88));
		listStudents.add(new Student("Henry", 98));
		listStudents.add(new Student("Ivan", 66));
		listStudents.add(new Student("John", 52));
		
		
		/*****************************/
		// find students whose score >= 70
		List<Student> listGoodStudents = listStudents.stream()
		                    .filter(s -> s.getScore() >= 70)	// Intermediate Operation
		                    .collect(Collectors.toList());		//Terminal Operation
		 
		listGoodStudents.stream().forEach(System.out::println);
		
		
		/*****************************/
		// calculate average score of all students
		double average = listStudents.stream()
		            .mapToInt(s -> s.getScore())
		            .average().getAsDouble();
		 
		System.out.println("Average score: " + average);
		
		
		/*****************************/
		List<Student> top3Students = listStudents.stream()
                .filter(s -> s.getScore() >= 70)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
 
		System.out.println("Top 3 Students by Score:");
		top3Students.forEach(s -> System.out.println(s));

		
		
		/**********************************************/
		
		System.out.println("Parallel Stream : ");
		listStudents.parallelStream()
        .filter(s -> s.getScore() >= 70)
        .sorted()
        .limit(3)
        .forEach(System.out::println);
		
		
		/*
		 * The following example shows a stream executes the sorted operation sequentially,
		 *  and then execute the filter operation in parallel:
		 */
		System.out.println("operating sequential and parallel stream: ");
		listStudents.stream()
        .sorted()
        .parallel()
        .filter(s -> s.getScore() >= 70)
        .forEach(System.out::println);
		
		
		/*********************************************/
		System.out.println("Streams and Lambda Expressions: ");
		listStudents.stream()
		    .filter(s -> s.getScore() >= 70)
		    .map(s -> s.getName())
		    .sorted()
		    .forEach(name -> System.out.println(name));

		
	}

}
