package com.javaInterview;

public class ReverseString {

	
	public static void main(String[] args) {
	
//Strings are immutable.
//There is no reverse() method in Strings
//In StringBuffer we have reverse() method because StringBuffer mutable  
//Selenium --- muineleS
		
	//Method 1:	for loop
		String s="Selenium";  // 0 to 7 --- total=8
  	   int len=s.length();
		System.out.println(len); //8
		String rev="";
		
		
		for(int i=len-1;i>=0;i--){
			rev=rev + s.charAt(i); //m //mu
	//		System.out.println(rev); //--Dont write here 
		}
	     System.out.println("Using for loop::: " +rev); //muineleS
	     
	     
		//Method 2: StringBuffer class
		StringBuffer sf=new StringBuffer(s);
		System.out.println("Using String Buffer::: " +sf.reverse());
		
	}

}
