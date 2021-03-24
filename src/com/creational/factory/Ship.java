package com.creational.factory;

public class Ship implements Transport {

	@Override
	public void deliver() {
		System.out.println("Delivery from the Ship has been planned");
	}

}
