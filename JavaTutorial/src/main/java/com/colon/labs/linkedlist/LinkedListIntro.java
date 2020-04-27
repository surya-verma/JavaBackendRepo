package com.colon.labs.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListIntro {

	public static void main(String[] args) {
		
		String[] aarrayOfString= new String[] {"Rakesh","Sawan","Pallav","Nitish","Amaresh","Ajeya"};
		
		LinkedList<String> testlist=new LinkedList<String>();
		ArrayList<String> convertedArrayList=new ArrayList<String>(Arrays.asList(aarrayOfString));
		
		testlist.addAll(convertedArrayList);
		
		System.out.println(testlist);
		//testlist.clear();
		System.out.println(testlist.peek());
		testlist.poll();
		System.out.println(testlist);
		testlist.pollFirst();
		System.out.println(testlist);
		testlist.add(0,"Sawan");
		System.out.println(testlist);
		System.out.println(testlist.clone());
		testlist.addFirst("Rakesh");
		System.out.println(testlist);
		testlist.addAll(6, convertedArrayList);
		System.out.println(testlist);
		System.out.println(testlist.remove());
		System.out.println(testlist);
		testlist.set(5, "Kumar");
		System.out.println(testlist);
		testlist.offer("Last");
		System.out.println(testlist);
		testlist.offerLast("Last");
		System.out.println(testlist);
		testlist.offerFirst("Rakesh");
		System.out.println(testlist);
	}

}
