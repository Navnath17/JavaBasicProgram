package com.startup.programpractice;

public class Spacecount {
	public static void main(String[] args) {
		
	
	int a =0;
	String str = "my name is nav nath";
	
	for(int i=0;i <str.length() ;i++) {
		if(str.charAt(i) != ' ') {
			a++;
		}
		
	}
	System.out.println("str count "+a);
	System.out.println("with count "+ str.length());
	System.out.println("space count ::"+ (str.length()-a));
	}
}
