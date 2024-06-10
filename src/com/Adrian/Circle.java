package com.Adrian;

/**
 * @author Adrian Cieplicki
 * date 06/07/2024
 * A java implementation of a circle
 */

/**
 * The circle class
 */
public class Circle {
	/**
	 * Instance variables for position of the circle and its radius
	 */
	private int x, y, radius;
	
	/**
	 * Default Constructor
	 */
	public Circle() {
		
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	/**
	 * Constructor method
	 * @param radius The radius of the circle
	 */
	public Circle(int radius) {
		this();
		
		// Create circle bounds for invariance
		if (radius > 100) {
			this.radius = 100;
		} else if (radius < 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	/**
	 * Constructor method
	 * @param x The x-position of the circle
	 * @param y The y-position of the circle
	 * @param radius The radius of the circle
	 */
	public Circle(int x, int y, int radius) { // variable names are made same for convenience
		// modify instance variables/attributes on object creation, to be specific to each new object
		if (x > 100) {
			this.x = 100;
		} else if (x < -100) {
			this.x = -100;
		} else {
			this.x = x;
		}
		
		if (y > 100) {
			this.y = 100;
		} else if (y < -100) {
			this.y = -100;
		} else {
			this.y = y;
		}
		
		if (radius > 100) {
			this.radius = 100;
		} else if (radius < 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	/**
	 * Combines two circles together
	 * @param c The circle to combine to the current circle object
	 */
	public void combineCircle(Circle c) {
		this.radius += c.radius;
		this.x = (this.x + c.x) / 2;
		this.y = (this.y + c.y) / 2;
	}
	
	/**
	 * Combines the circle with itself
	 */
	public void doubleCircle() {
		combineCircle(this);
	}
	
	/**
	 * Getter for the radius of the circle
	 * @return The radius of the circle
	 */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * Getter for the origin of the circle
	 * @return The origin of the circle
	 */
	public int[] getOrigin() {
		int[] origin = {this.x, this.y};
		return origin;
	}
	
	/**
	 * Gets the diameter of the circle
	 * @param radius The radius of the circle
	 * @return The diamter of the circle
	 */
	private int diameter(int radius) {
		return radius*2;
	}
	
	/**
	 * Gets the area of the circle
	 * @return The area of the circle
	 */
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	/**
	 * Gets the perimeter of the circle
	 * @return The perimeter of the circle
	 */
	public double perimeter() {
		return Math.PI*diameter(this.radius);
	}
	
	/**
	 * Moves the circle's position
	 * @param x How many spaces to move the circle in the x-direction
	 * @param y How many spaces to move the circle in the y-direction
	 */
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	/**
	 * Resizes the circle
	 * @param radius The new radius of the circle
	 */
	public void resize(int radius) {
		this.radius = radius;
	}
	
	
	/**
	 * Gives a String representation of the circle
	 */
	public String toString() {
		return "(x-" + this.x + ")^2 + (y-" + this.y + ")^2 = " + this.radius + "^2";
	}
}



