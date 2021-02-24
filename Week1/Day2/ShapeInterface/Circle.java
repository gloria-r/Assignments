package com.lavenberg;

public class Circle implements Shape {
	
    public double radius;
    public Circle(double r) {
        radius = r;
    }

	@Override
	public double area() {
        return 3.14 * radius * radius;

	}
}
