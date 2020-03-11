package com.lambda.examples;

import java.util.ArrayList;
import java.util.List;

public class LambdaStream {

	static List<String> places = new ArrayList<>();

    // preparing our data
    public static List<String> getPlaces(){

        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");
        
        // Filter places from Nepal
        myPlaces.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(p -> p.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
