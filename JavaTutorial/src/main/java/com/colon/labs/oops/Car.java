package com.colon.labs.oops;

public class Car extends Buying implements CarType, CarBrand, CarEngine {

	@Override
	public void type(String model) {
		if (model.equalsIgnoreCase("Accord")) {
			System.out.println("Your Car is sedan.");
		} else if (model.equalsIgnoreCase("Explorer")) {
			System.out.println("Your Car is SUV");
		} else if (model.equalsIgnoreCase("Pacifica")) {
			System.out.println("Your Car is Micnivan");
		} else {
			System.out.println("Your Car type is unknown in our database.");
		}

	}

	@Override
	public String engine(String model) {
		String returnEngine = null;
		if (model.equalsIgnoreCase("Accord")) {
			returnEngine = "Hybrid-V6";
		} else if (model.equalsIgnoreCase("Explorer")) {
			returnEngine = "Hybrid-V8";
		} else if (model.equalsIgnoreCase("Pacifica")) {
			returnEngine = "Hybrid-NitroV6";
		} else {
			returnEngine = "Unknown";
		}

		return returnEngine;
	}

	@Override
	public String brand(String model) {
		String returnBrand = null;
		if (model.equalsIgnoreCase("Accord")) {
			returnBrand = "Honda";
		} else if (model.equalsIgnoreCase("Explorer")) {
			returnBrand = "Ford";
		} else if (model.equalsIgnoreCase("Pacifica")) {
			returnBrand = "Chrysler";
		} else {
			returnBrand = "Unknown";
		}
		return returnBrand;
	}

	public StringBuilder brand(String model, int year) {
		String returnBrand = null;
		String lesgaCheck = null;

		if (model.equalsIgnoreCase("Accord") && year >= 2005) {
			returnBrand = "Honda";
			lesgaCheck = "This vehicle is legal to run on road till date.";
		} else {
			returnBrand = "unknown";
			lesgaCheck = "unknown";
		}
		return new StringBuilder(returnBrand + " & " + lesgaCheck);
	}

}
