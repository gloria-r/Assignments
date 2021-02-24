package com.lavenberg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7.3);
        System.out.println("Area of circle: " + c.area());
        
        Rectangle r = new Rectangle(10.0, 12.5);
        System.out.println("Area of rectangle: " + r.area());
        
        Triangle t = new Triangle(7.0, 3.3);
        System.out.println("Area of triangle: " + t.area());

	}

}
