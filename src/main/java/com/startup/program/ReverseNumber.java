package com.startup.program;

import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
System.out.println("Enter Number");
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
sc.close();
int rem;
System.out.println("The reverse number ");
while(n>0)
{
rem=n%10;
System.out.print(rem);
n=n/10;
}
}
}