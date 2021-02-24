package com.lavenberg;

public class Triangle implements Shape {
	
	double width;
    double height;
    public Triangle(double w, double h){
        width = w;
        height = h;
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
        return ((width * height)/2);
	}

}
