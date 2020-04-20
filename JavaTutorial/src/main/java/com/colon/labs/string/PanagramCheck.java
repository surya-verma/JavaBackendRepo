package com.colon.labs.string;

import java.util.Arrays;

public class PanagramCheck {

	public static void main(String[] args) {
		String input = "abcdefghijklmnopqrstuvwxyzzzzz";
		PanagramCheck aa = new PanagramCheck();
		if(aa.checkPanagram(input)) {
			System.out.println("String is panagram.");
		}else {
			System.out.println("String is not panagram.");
		}
		

	}

	public boolean checkPanagram(String input) {

		boolean[] mark = new boolean[26];
		int index = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				index = input.charAt(i) - 'A';	
			    mark[index]=true;
			}
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				index = input.charAt(i) - 'a';
				 mark[index]=true;
			}else
				continue;			
			
		}
		
		for(int i=0;i<mark.length;i++) {
			if(mark[i]==false) {
				return (false);
			}
		}
		return (true);

	}

}
