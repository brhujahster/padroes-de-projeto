package com.softengine.estrutural.adapter;

public class RoundPeg {

	private int radius;
	
	public RoundPeg(int radius) {
		this.radius = radius;
	}
	
	public RoundPeg() {
		this(0);
	}

	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
