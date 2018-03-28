package com.javaInterview;

public class ReverseInteger {

	public static void main(String[] args){
		//Method 1:
		long num=12345;
		long rev=0;
		while(num!=0){
			rev=rev * 10 + num % 10;
			num=num / 10;
		}
		System.out.println(rev);
		System.out.println("**********");
		
		//Method 2:using StringBuffer
		long num1=56789;
		StringBuffer sb=new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(sb);
	}

}
