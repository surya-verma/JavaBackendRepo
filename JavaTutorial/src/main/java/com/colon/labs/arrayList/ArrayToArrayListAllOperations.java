package com.colon.labs.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayListAllOperations {
	
	public List<String> arrayToListPart1(String[] stringArray) {
		
		List<String> convertedArrayList=Arrays.asList(stringArray);
		
		//convertedArrayList.add("Deepak"); //This will give runtime error Exception in thread "main" java.lang.UnsupportedOperationException
		//convertedArrayList.add("Nikhil");
		
		return convertedArrayList;		
	}
	
	public ArrayList<String> arrayToArrayListPart2(String[] stringArray) {
		
		ArrayList<String> convertedArrayList=new ArrayList<String>(Arrays.asList(stringArray));
		
		convertedArrayList.add("Abhishek");
		convertedArrayList.add("Neeraj");
				
		return convertedArrayList;		
	}
	
	public List<String> arrayToArrayListUsingCollectionAndList(String[] stringArray) {
		
		List<String> convertedArrayList =new ArrayList<>();
		
		Collections.addAll(convertedArrayList, stringArray);	
		convertedArrayList.add("Sid");
		convertedArrayList.add("Chetan");
		
		return convertedArrayList;
	}
	
	public ArrayList<String> arrayToArrayListUsingCollectionAndArrayList(String[] stringArray) {
		
		ArrayList<String> convertedArrayList =new ArrayList<>();
		
		Collections.addAll(convertedArrayList, stringArray);
		convertedArrayList.add("Shankar");
		convertedArrayList.add("Shubham");
		
		return convertedArrayList;
	}
	
	

	public static void main(String[] args) {
		
		String[] aarrayOfString= new String[] {"Rakesh","Sawan","Pallav","Nitish","Amaresh","Ajeya"};
	
		ArrayToArrayListAllOperations one=new ArrayToArrayListAllOperations();
		 
		List<String> byPart1=one.arrayToListPart1(aarrayOfString);
		System.out.println(byPart1);
		
		ArrayList<String> byPart2=one.arrayToArrayListPart2(aarrayOfString);
		System.out.println(byPart2);
		
		List<String> collectionList=one.arrayToArrayListUsingCollectionAndList(aarrayOfString);
		System.out.println(collectionList);
		
		ArrayList<String> collectionArrayList=one.arrayToArrayListUsingCollectionAndArrayList(aarrayOfString);
		System.out.println(collectionArrayList);

	}

}
