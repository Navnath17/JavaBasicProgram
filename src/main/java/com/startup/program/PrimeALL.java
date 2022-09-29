package com.startup.program;

import java.util.Scanner;
public class PrimeALL {
public static void main(String[] args) {
int temp = 0;
int i, j;
int total = 0;
System.out.println("Enter Number ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();
for (i = 1; i <= n; i++)
{
temp = 0;
for (j = 2; j <= i - 1; j++)
{
if (i % j == 0) {
temp = temp + 1;
}
}
if (temp == 0) {
System.out.print(i + " ");
total = total + 1;
}
}
System.out.println();
System.out.println("Total Prime Number between 1 to " + n + " is " + 
total);
/*
* 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89
* 97 101 103 107 109 113 127 131 137 139 149
*/
}
}