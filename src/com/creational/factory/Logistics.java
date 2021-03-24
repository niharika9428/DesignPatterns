package com.creational.factory;

public interface Logistics{

	public default void planDelivery() {
		Transport t = createTransport();
		System.out.println("Planning delivery for : "+t.getClass().getName());
		t.deliver();
	}
	
	public abstract Transport createTransport();
}
