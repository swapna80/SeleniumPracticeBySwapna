package com.javaInterview;

import java.util.Arrays;

//This is for practice
public class Test {

	public static void main(String[] args){
		
	//Remove junk from string
		
		String s="8765 Automation &**%$ Selenium";
		String s1=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s1);
}
}