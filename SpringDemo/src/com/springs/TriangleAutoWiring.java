package com.springs;

public class TriangleAutoWiring {
	private Points point1;
	private Points point2;
	private Points point3;
	
	public TriangleAutoWiring() {
		
	}
	public TriangleAutoWiring(Points point1, Points point2, Points point3) {
		this.point1=point1;
		this.point2=point2;
		this.point3=point3;
	}
	

	public Points getPoint1() {
		return point1;
	}

	public void setPoint1(Points point1) {
		this.point1 = point1;
	}

	public Points getPoint2() {
		return point2;
	}

	public void setPoint2(Points point2) {
		this.point2 = point2;
	}

	public Points getPoint3() {
		return point3;
	}

	public void setPoint3(Points point3) {
		this.point3 = point3;
	}

	public void draw() {
		
		System.out.println("Drawing by Autowiring...");
		
		System.out
				.println("Drawing Trinangle with pointA " + "(" + getPoint1().getX() + ", " + getPoint1().getY() + ")");
		System.out
				.println("Drawing Trinangle with pointB " + "(" + getPoint2().getX() + ", " + getPoint2().getY() + ")");
		System.out
				.println("Drawing Trinangle with pointC " + "(" + getPoint3().getX() + ", " + getPoint3().getY() + ")");
	}
}
