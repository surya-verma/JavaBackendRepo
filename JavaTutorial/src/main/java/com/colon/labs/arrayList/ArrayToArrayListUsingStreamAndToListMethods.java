package com.colon.labs.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public abstract class ArrayToArrayListUsingStreamAndToListMethods {
	
	public static ArrayList<String> toArrayListUsingStream(String[] stringArray){
		
		ArrayList<String> convertedArrayList = (ArrayList<String>) Arrays.stream(stringArray).collect(Collectors.toList());
		 
		return convertedArrayList;
		
	}
	
	public static ArrayList<String> toArrayListUsingToList(String[] stringArray){
		
		ArrayList<String> convertedArrayList = new ArrayList<String>(List.of(stringArray));
			
		return convertedArrayList;
		
	}

}
