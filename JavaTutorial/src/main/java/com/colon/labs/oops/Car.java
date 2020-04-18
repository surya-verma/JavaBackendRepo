package com.colon.labs.oops;

public class Car implements CarType, CarBrand, CarEngine {

	@Override
	public void type(String model) {
		if (model.equals("Accord")) {
			System.out.println("Your Car is sedan.");
		} else if (model.equals("Explorer")) {
			System.out.println("Your Car is SUV");
		} else if (model.equals("Pacifica")) {
			System.out.println("Your Car is Micnivan");
		}else {
			System.out.println("Your Car type is unknown in our database.");
		}
		
	}

	@Override
	public String engine(String model) {
		String returnEngine = null;
		if (model.equals("Accord")) {
			returnEngine = "Hybrid-V6";
		} else if (model.equals("Explorer")) {
			returnEngine = "Hybrid-V8";
		} else if (model.equals("Pacifica")) {
			returnEngine = "Hybrid-NitroV6";
		}else {
			returnEngine="Unknown";
		}
		
		return returnEngine;
	}

	public String brand(String model) {
		String returnBrand = null;
		if (model.equals("Accord")) {
			returnBrand = "Honda";
		} else if (model.equals("Explorer")) {
			returnBrand = "Ford";
		} else if (model.equals("Pacifica")) {
			returnBrand = "Chrysler";
		}else {
			returnBrand="Unknown";
		}
		return returnBrand;
	}
}
