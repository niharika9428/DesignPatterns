package com.creational.factory;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the delivery mode.");
		System.out.println("1. Road");
		System.out.println("2. Ship");
		int mode = sc.nextInt();
		sc.close();
		Logistics logistics = null;
		switch (mode) {
		case 1:
			logistics = new RoadLogistics();
			logistics.planDelivery();
			break;
		case 2:
			logistics = new ShipLogistics();
			logistics.planDelivery();
			break;
		default:
			System.out.println("Choose either 1 or 2");
		}

	}
}
