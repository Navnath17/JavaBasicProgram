package com.startup.program;

import java.util.Scanner;
public class RevStringNew {
public static void main(String[] args) {
String s="";
String rs="";
System.out.println("Enter string ");
Scanner sc = new Scanner(System.in);
s=sc.next();
sc.close();
int n= s.length();
int i;
for( i=n-1;i>=0;i--)
{
rs=rs+s.charAt(i);
}
System.out.println(rs);
if(s.equals(rs))
{
System.out.println("palindrome");
}
else
{
System.out.println("Not palindrom");
}
}
}