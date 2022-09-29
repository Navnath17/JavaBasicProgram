package com.startup.program;
import java.util.Scanner;
public class ArrayDuplicate {
public static void main(String[] args) {
int n;
System.out.println("Enter size of array : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter " + n + " array element ");
for (int i = 0; i < n; i++)
{
a[i] = sc.nextInt();
}
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
if (a[i] == a[j]) {
System.out.print("Duplicate Elements are Found ==> " + a[i] + " ");
}
}
}
System.out.println();
}
}
