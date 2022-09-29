package com.startup.program;

import java.util.Scanner;

public class InsertArray {
public static void main(String[] args) {
int size, loc, item, i;
System.out.println("Enter Size of Array : ");
Scanner sc = new Scanner(System.in);
size = sc.nextInt();
int a[] = new int[size + 1];
System.out.println("Enter Elements in Array : ");
for (i = 0; i < size; i++) {
a[i] = sc.nextInt();
}
System.out.println("Enter location to insert element : ");
loc = sc.nextInt();
System.out.println("Enter Element to insert : ");
item = sc.nextInt();
for (i = size; i > loc; i--) {
a[i] = a[i - 1];
}
a[loc] = item;
size++;
System.out.println("Element Inserted Successfuly");
for (i = 0; i < a.length; i++) {
System.out.println(a[i] + " ");
}
}
}
