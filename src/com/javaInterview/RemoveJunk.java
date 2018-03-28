package com.javaInterview;

public class RemoveJunk {

	public static void main(String[] args) {
		
//How will you Remove special characters or how will you remove Junk characters from a String?
//Using Regular Expression : [^a-zA-Z0-9]
//	[^a-zA-Z0-9] : remove except these a-zA-Z0-9	
		
		String s="$#%^& Selenium Automation 098764";
		 s=s.replaceAll("[^a-zA-Z0-9]", ""); //SeleniumAutomation098764
		System.out.println(s);
		
		String s1="@#@#@#Testing*&^&*%$Automation!@#$Framework^%&*$";
		 s1=s1.replaceAll("[^a-zA-Z0-9]", " ");//Testing       Automation    Framework   
		System.out.println(s1);
		
//("[^a-zA-Z0-9]", " ") -- " " --because of Space-->Testing       Automation    Framework
	}

}
