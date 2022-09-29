package com.startup.program;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
int n;
System.out.println("Enter a Number ");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
if(n%4==0 || n%400==0)
{
if(n%100 !=0)
{
System.out.println(" leap Year");
}
else
{
System.out.println(" not Leap Year");
}
}
else
{
System.out.println(" not Leap Year");
}
}
}
