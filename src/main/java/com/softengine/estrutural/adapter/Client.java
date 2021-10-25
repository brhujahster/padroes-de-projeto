package com.softengine.estrutural.adapter;

public class Client {

	public static void main(String[] args) {
		RoundHole roundHole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);
		
		System.out.println("fits 1 " + roundHole.fits(roundPeg));
		
		SquarePeg small_sqpeg = new SquarePeg(5);
		SquarePeg large_sqpeg = new SquarePeg(10);
		
		SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(small_sqpeg);
		SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(large_sqpeg);
		
		System.out.println("fits 2 adapter " + roundHole.fits(smallSquarePegAdapter));
		System.out.println("fits 3 adapter " + roundHole.fits(largeSquarePegAdapter));
	}
}
