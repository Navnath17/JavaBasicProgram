package com.startup.program;

import java.util.Scanner;
public class PirmerNumber {
public static void main(String[] args) {
int n = 0, i, tempnumber = 1;
System.out.println("Enter Number ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for (i = 2; i < n - 1; i++)
{
tempnumber = n % i;
if (tempnumber == 0) 
{
System.out.println("Not Primer");
break;
}
}
if (tempnumber != 0)
{
System.out.println("The number is primer");
}
sc.close();
}
}