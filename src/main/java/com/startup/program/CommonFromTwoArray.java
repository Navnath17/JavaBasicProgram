package com.startup.program;

import java.util.Scanner;
public class CommonFromTwoArray {
public static void main(String[] args) {
int n1, n2;
System.out.println("Enter size of 1st Arrary");
Scanner sc = new Scanner(System.in);
n1 = sc.nextInt();
int a[] = new int[n1];
System.out.println("Enter Elements of 1st Arrary");
for (int i = 0; i < n1; i++) {
a[i] = sc.nextInt();
}
System.out.println("Enter size of 2st Arrary");
n2 = sc.nextInt();
int b[] = new int[n2];
for (int i = 0; i < n2; i++) {
b[i] = sc.nextInt();
}
System.out.println("Common Elements of Arrary");
for (int i = 0; i < n1; i++)
{
for (int j = 0; j < n2; j++)
{
if (a[i] == b[j]) 
{
System.out.print(a[i] + " ");
}
}
}
}
}
