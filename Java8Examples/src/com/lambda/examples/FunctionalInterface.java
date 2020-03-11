package com.lambda.examples;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		   new Thread(new Runnable() {
		          @Override
		          public void run() {
		              System.out.println("I just implemented the Runnable Functional Interface.");
		          }
		      }).start();

	}

}
