package com.startup.program;
import java.util.Scanner;

public class CaseConvert {
	public static void main(String[] args) {
		String s=" ";
		System.out.println("Enter String : ");
		Scanner sc= new Scanner(System.in);
		s= sc.nextLine();
		StringBuffer str = new StringBuffer(s);
		sc.close();
		for(int i=0;i<=s.length()-1 ;i++)
		{
			if( Character.isLowerCase(s.charAt(i)))
			{
				str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else
			{
				str.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println(str);
	}
}
