package com.java.spring;

public class Area {
	private Point pointA;
	
	public Area(Point pointA) {
		super();
		this.pointA = pointA;
	}
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void getTriangleAre(){
		int area = getPointA().getX()*getPointA().getY(); 
		if(area == 2)
		System.out.println("Area: " + area);
	}

}
