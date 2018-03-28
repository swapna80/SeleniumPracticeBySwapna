package com.javaInterview;

public class SwapStringsWithOutThirdVar {

	public static void main(String[] args) {
	
	String a="Hello";
	String b="world"; //5
	
	System.out.println("Before swapping:");
	System.out.println("The value of a:"+ a);
	System.out.println("The value of b:"+ b);
	
	//1.append a and b
	a=a+b; //Helloworld //10
	
	//2.store initial string a in string b
	
	
	//a.substring(beginIndex, endIndex);
	//beginIndex =0; 
	//endIndex= a.length()-b.length() = 5 
	//beginIndex = Inclusive
	//endIndex = Exclusive
	//a.substring(0, 5);
	
	b=a.substring(0, a.length()-b.length()); //Hello
	
	//3.store initial string b in string a
	a=a.substring(b.length());
	
	System.out.println("After swapping:");
	System.out.println("The value of a:"+ a);
	System.out.println("The value of b:"+ b);
	

	}

}
