package com.springs;

public class Triangle {

	private Points pointA;
	private Points pointB;
	private Points pointC;


	
	
	public Points getPointA() {
		return pointA;
	}

	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}

	public Points getPointB() {
		return pointB;
	}

	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}

	public Points getPointC() {
		return pointC;
	}

	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}

	public void draw() {

		System.out.println("Drawing Trinangle with pointA "+"("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Drawing Trinangle with pointB "+"("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Drawing Trinangle with pointC "+"("+getPointC().getX()+", "+getPointC().getY()+")");
	}
}
