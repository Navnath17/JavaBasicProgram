package com.startup.program;

public class ReverseWord {
public static void main(String[] args) {
String s= "Atul Yadav";
String sr[] = s.split(" ");
int n=sr.length;
for(int i=n-1; i>=0;i-- )
{
System.out.print(sr[i]+ " ");
}
}
}