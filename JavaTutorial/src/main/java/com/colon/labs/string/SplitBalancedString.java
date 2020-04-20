package com.colon.labs.string;

import java.awt.List;
import java.util.ArrayList;

public class SplitBalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "RLRRLLRLRL";
		String b = "RLRRRLLRLL";
		int count = 0;
		int numberOfBalancedStrings = 0;
		ArrayList<String> bs = new ArrayList<String>();

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'R') {
				count++;
			} else if (a.charAt(i) == 'L') {
				count--;
			}

			if (count == 0 ) {
				numberOfBalancedStrings++;
				
				String[] split=a.split(Character.toString(a.charAt(i))); //to be worked on
							 
				 bs.add(split[1]); ////to be worked on
				
			}
		}
		System.out.println("The total number of balanced strings are:" + numberOfBalancedStrings);
		System.out.println(bs); ////to be worked on

	}

}
