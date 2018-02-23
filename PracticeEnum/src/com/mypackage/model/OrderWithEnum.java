package com.mypackage.model;

public class OrderWithEnum {
	public enum CoffeeSize {
		BIG,
		HUGE,
		OVERWHELMMING
	}
	
	private CoffeeSize coffeeSize;

	public CoffeeSize getCoffeeSize() {
		return coffeeSize;
	}

	public void setCoffeeSize(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	
	

}
