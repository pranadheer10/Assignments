package com.springs;

import java.util.List;

public class TriangleCollections_List {

	private List<Points> points;

	public List<Points> getPoints() {
		return points;
	}

	public void setPoints(List<Points> points) {
		this.points = points;
	}
	
	public void draw() {
		int i=1;
		for(Points point:points) {
		
			System.out.println("Point"+i+" : ("+point.getX()+", "+point.getY()+")");
			i=i+1;
		
		}
	}
	
}
