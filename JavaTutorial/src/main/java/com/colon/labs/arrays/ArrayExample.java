package com.colon.labs.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= new int[] {1,2,3,4,5};
        
       
         
         
         
        for(int i=0; i< a.length;i++) {
        	System.out.println(a[i]);
        }
        int i=0;
        while(i<a.length) {
        	System.out.println(a[i]);
        	i++;
        }
        
        for(int one:a) {
        	System.out.println(one);
        }
        
	}

}
