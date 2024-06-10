package com.Adrian;

import java.util.Arrays;

/**
 * @author Adrian Cieplicki
 * date 06/07/2024
 * Main method for the circle class
 */

public class CircleMain {

	public static void main(String[] args) {
		// Create circles
		Circle circle = new Circle(2, 3, 4);
		Circle circle2 = new Circle(9, 1, 2);
		Circle circle3 = new Circle(5, 4, 6);
		circle2.combineCircle(circle3);
		
		// Perform various operations with the circles
		circle.doubleCircle();
		System.out.println("Origin: " + Arrays.toString(circle.getOrigin()));
		System.out.println("Radius: " + circle.getRadius());
		
		System.out.println("New circle");
		System.out.println("Origin: " + Arrays.toString(circle2.getOrigin()));
		System.out.println("Radius: " + circle2.getRadius());
		
	}

}
