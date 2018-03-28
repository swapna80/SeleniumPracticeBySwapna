package com.javaInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
	//using Hashset: set will store only unique values
		
//		String names[]={"Java","C","Ruby","Java"};
//		
//		Set<String> store=new HashSet<String>();
//		for(String name : names){
//			if(store.add(name) == false){
//				System.out.println("Duplicate Element is:" + name);
//			}
//		}
		
		//This is not Naveen program
		
		String str="Java";
	//	str.toLowerCase();
		
		Set<Character> set=new HashSet<Character>();
		//StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			Character c=str.charAt(i);
			if(set.add(c) == false){
				System.out.println(c);
				System.out.println(str);
			}
		}
	
		
		

	}

}
