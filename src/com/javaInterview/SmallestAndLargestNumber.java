package com.javaInterview;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int a[]={-5,10,25,50,987};
		
		int largest=a[0]; //-10
		int smallest=a[0]; //-10
		
//Here taking i=24 (index=1).already assigned index=0 to largest and smallest		
		for(int i=1;i<a.length;i++){
			if(a[i]>largest){
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
			
			System.out.println("given array is " +Arrays.toString(a));
			System.out.println("Larget Number " + largest);	
			System.out.println("smallest number " + smallest);
			
		}
		

	}

}
