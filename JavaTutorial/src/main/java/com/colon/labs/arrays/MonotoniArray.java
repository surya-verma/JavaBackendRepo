package com.colon.labs.arrays;

public class MonotoniArray {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b=  new int[] {5,4,3,2,1,0};
		int[] c = new int[] { 1,1,1,1,1,1 };
		int[] d = new int[] { 1, 2, 3, 4, 2, 5, 7, 9, 5 };
		int[] e=  new int[] {9,8,7,5,6,5,4,3,8,9,10};
		
		
		if(checkFornonMonotonousAscending(d)||checkFornonMonotonousDecending(d)) {
			System.out.println("Array is not monotonous.");
		}else if(checkMonotonousEqual(d)) {
			System.out.println("Array is equal monotonous.");
		}else {
			System.out.println("Array is monotonous.");
		}

	}
	
	public static boolean checkMonotonousEqual(int[] array) {
		boolean temp = true;
		for(int i=0;i<array.length;i++) {
			if(array[0]!=array[i]) {
				temp=false;
			}
		}
		return temp;
	}

	public static boolean checkFornonMonotonousAscending(int[] array) {
		boolean ascendingFlag = false;
		boolean temp = false;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i + 1] > array[i]) {
				ascendingFlag = true;
			}
			if (ascendingFlag == true && array[i + 1] < array[i]) {
				temp = true;
			}
		}
		return temp;
	}
	
	public static boolean checkFornonMonotonousDecending(int[] array) {
		boolean Flag = false;
		boolean temp = false;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i + 1] < array[i]) {
				Flag = true;
			}
			if (Flag == true && array[i + 1] > array[i]) {
				temp = true;
			}
		}
		return temp;
	}
}
