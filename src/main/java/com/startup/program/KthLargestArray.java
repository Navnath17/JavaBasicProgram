package com.startup.program;

import java.util.Scanner;
public class KthLargestArray {
public static void main(String[] args) {
int n, k, temp;
System.out.println("Enter Size of Array");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter Array Element");
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
System.out.println("Enter Position for Largest Element");
k = sc.nextInt();
for (int i = 0; i < n; i++) 
{
for (int j = i + 1; j < n; j++) 
{
if (a[i] < a[j]) {
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
if (i == k - 1) {
System.out.println(k + "th Laragest Element is = " + a[i]);
break;
}
}
}
}