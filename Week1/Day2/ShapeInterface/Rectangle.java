package com.lavenberg;

public class Rectangle implements Shape {
	
	double length;
    double breadth;
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
        return length * breadth;
	}

}
