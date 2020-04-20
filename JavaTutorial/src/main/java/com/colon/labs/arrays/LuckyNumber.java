package com.colon.labs.arrays;

public class LuckyNumber {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 1, 2, 2, 3,3,3,4, 4, 4,4,4, 5, 5 };
		int temp = 0;
		for (int j = 0; j < a.length; j++) {
			int count = 0;

			for (int i = 0; i < a.length; i++) {
				if (a[j] == a[i] && a[j] != temp) {
					count++;
				}
			}
			if (count == a[j]) {
				temp = a[j];
				System.out.println("The lucky number is:" + a[j]);
			}
		}

	}

}
