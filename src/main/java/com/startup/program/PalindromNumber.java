package com.startup.program;

import java.util.Scanner;
public class PalindromNumber {
public static void main(String[] args) {
int n;
int orgnumber;
int r=0;
System.out.println("Enter Number ");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
orgnumber=n;
sc.close();
int rn=0;
while(n>0)
{
r=n % 10;
rn=(rn*10)+r;
n=n/10;
}
System.out.println(rn);
if(orgnumber==rn)
{
System.out.println("the number is palilndrome number");
}
else
System.out.println("Not Palindrome number");
}
}
