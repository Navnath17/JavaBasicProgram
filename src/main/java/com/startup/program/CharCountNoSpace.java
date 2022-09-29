package com.startup.program;
import java.util.Scanner;
public class CharCountNoSpace {
public static void main(String[] args) {
//this program count string char but not space
String s="";
int c=0;
System.out.println("Enter String ");
Scanner sc = new Scanner(System.in);
s= sc.nextLine();
sc.close();
int n=s.length();
for(int i=0;i<=n-1;i++)
{
if(s.charAt(i) != ' ')
{
c++;
}
}
System.out.println("The String count with space is = "+s.length());
System.out.println("The String count without space is = "+c);
}
}
