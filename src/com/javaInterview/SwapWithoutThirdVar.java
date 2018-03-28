package com.javaInterview;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		
		//1.using third variable : t
//		int t;
//		t=x; //t=5
//		x=y; //x=10
//		y=t; //y=5
//		System.out.println(x); //10
//		System.out.println(y); //5
//		
//		//2. without using third variable : using + operator
//	    x = x + y; //15
//	    y = x - y; //5
//	    x = x - y; //10
//	    System.out.println(x);
//	    System.out.println(y);
	    
	  //3.without third variable : using * operator
	  		x = x * y; // x= 50
	  		y = x / y; // y=10
	  		x = x / y; // x=15
	  		System.out.println(x);
	  		System.out.println(y);

	}

}
