package com.java.spring;

public class Dimention {
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void printDimention(){
		System.out.println("Dimention: (" + getPointA().getX() + "," + getPointA().getY() + ")");
	}

}
