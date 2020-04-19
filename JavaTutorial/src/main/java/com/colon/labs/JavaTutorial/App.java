package com.colon.labs.JavaTutorial;

import java.util.Scanner;

import com.colon.labs.oops.Application;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("By Rakesh");
        
		Scanner x=new Scanner(System.in);
		System.out.println("Enter your Car model:");
		String model=x.nextLine();
		System.out.println("Enter your Car's year of manufacture:");
		int year=x.nextInt();
		
		Application a=new Application();
		a.start(model,year);
		a.loanSuggestion();
		a.leaseSuggestion();
		//a.brand(model, year);
    }
}
