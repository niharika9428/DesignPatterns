package com.creational.factory;

public class ShipLogistics implements Logistics {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
