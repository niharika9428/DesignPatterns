package com.creational.factory;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("Delivery from the Truck has been planned");
	}

}
