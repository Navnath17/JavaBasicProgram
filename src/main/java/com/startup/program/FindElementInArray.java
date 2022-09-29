package com.startup.program;

import java.util.Scanner;
public class FindElementInArray {
public static void main(String[] args) {
int a[] = new int[5];
int f;
boolean status = false;
System.out.println("Enter Array Element");
Scanner sc = new Scanner(System.in);
for (int i = 0; i < 5; i++) {
a[i] = sc.nextInt();
}
System.out.println("Elements are inserted. ");
System.out.println("Enter Element to Find");
f = sc.nextInt();
for (int j = 0; j < 5; j++) 
{
if (a[j] == f) 
{
System.out.println("Element Found at Postion " + j);
status = true;
break;
}
}
if (status == false) {
System.out.println("Element Not Found .. Please enter Valid element");
}
sc.close();
}
}
