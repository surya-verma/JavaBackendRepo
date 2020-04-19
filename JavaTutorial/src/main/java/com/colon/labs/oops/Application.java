package com.colon.labs.oops;

import java.util.Scanner;

public class Application extends Car {

	public  void start(String model, int year) {
		
	    
		
		Car myCar=new Car();

		
		String engine =myCar.engine(model);
		String brand = myCar.brand(model);
		StringBuilder brandY= myCar.brand(model, year);
		
		myCar.type(model);
		System.out.println("Your Car's engine is:" + engine);
		System.out.println("Your Car's brand is:" +brand);
		
		System.out.println("Your Car's brand is:" +brandY);
		
		
	}
	
	

}
