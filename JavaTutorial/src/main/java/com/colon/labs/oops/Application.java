package com.colon.labs.oops;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter your Car model:");
		String model=x.nextLine();
		
		String engine =myCar.engine(model);
		String brand = myCar.brand(model);
		
		myCar.type(model);
		System.out.println(engine);
		System.out.println(brand);
		
		
	}

}
