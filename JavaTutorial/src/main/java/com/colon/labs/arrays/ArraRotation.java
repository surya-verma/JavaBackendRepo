package com.colon.labs.arrays;

public class ArraRotation {

	public static void main(String[] args) {
		
		int[] one=new int[] {1,2,3,4,5,6,7};
		int[] two=new int[] {1,2,3,4,5,6,7};
		
		
		int[] rotatedLeft=rotateLeft(one,one.length,2);
		int[] rotatedRight=rotateRight(two,two.length,2);
		
		  for(int a:rotatedLeft) { System.out.println(a); }
				
		  for(int a:rotatedRight) { System.out.println(a); }
		 
	}

	public static int[] rotateLeft(int[] array, int sizeOfArray, int numberOfElements) {

		for (int i = 0; i < numberOfElements; i++) {
			int temp = array[0];
			for (int j = 0; j < sizeOfArray; j++) {
				if(j==sizeOfArray-1) {
					array[j]=temp;
					break;
				}
				array[j] = array[j + 1];
			}

		}
		return array;
	}
	
	public static int[] rotateRight(int[] array, int sizeOfArray, int numberOfElements) {

		for (int i = 0; i < numberOfElements; i++) {
			int temp = array[sizeOfArray-1];
			for (int j = sizeOfArray-1; j >= 0; j--) {
				if(j==0) {
					array[j]=temp;
					break;
				}
				array[j] = array[j - 1];
			}

		}
		return array;
	}

}
