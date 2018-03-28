package com.javaInterview;

public class StringManipulation {
	
	public static void main(String[] args)
	{
		String str="The rains started here selenium swapna";
		String str1="The Rains started here selenium swapna";
		
		System.out.println("Length: " +str.length());
		System.out.println(str.charAt(11));
		
		//Interview Question:How will u get 1st occurance and 2nd occurance
		System.out.println(str.indexOf("e")); //2 //1st occurance of e
		System.out.println(str.indexOf("e", str.indexOf("e")+1)); //15 // 2nd occurance of e
		
		System.out.println(str.indexOf("h")); //1 //1st occurance of h
		System.out.println(str.indexOf("h", str.indexOf("h")+1)); //18 //2nd occurance of h
		
		System.out.println(str.indexOf("s")); //8 //1st occurance
		System.out.println(str.indexOf("s", str.indexOf("s")+1)); //10 //2nd occurance
		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s")+1+2))); //23 //3rd occurance
		
		
		//i didn't understand 4th occurance
		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s", str.indexOf("s")+1+2+15)))); //4th occurance
		
		System.out.println(str.indexOf("here")); //18
		
		System.out.println(str.indexOf("hello")); //-1 //hello is not in the string.It won't throw you an exception.
		
		//string comparision
		System.out.println(str.equals(str1)); //false
		
		System.out.println(str.equalsIgnoreCase(str1)); //true
		
		//substring
		System.out.println(str.substring(0, 9)); //The rains
		
		//trim - remove space before and after
		String s="  Hello world  ";
		System.out.println(s.trim());//Hello world
		
		//replace - Hello world - remove space between Hello and world
		System.out.println(s.replace(" ", "")); //Helloworld
		
		String date="03-05-2018"; // 03/05/2018
		System.out.println(date.replace("-", "/")); //03/05/2018
		
		//split
		String test="Hello_World_testing_selenium";
		String testval[]=test.split("_");
		System.out.println(testval.length);
		for(int i=0;i<testval.length;i++){
			System.out.println(testval[i]);
		}
		
		String x="Hello";
		String y="world";
		int x1=100;
		int y1=200;
		
		System.out.println(x+y); //Helloworld
		System.out.println(x1+y1); //300
		System.out.println(x+y+x1+y1);//Helloworld100200
		System.out.println(x1+y1+x+y);//300Helloworld
	
	}

}
