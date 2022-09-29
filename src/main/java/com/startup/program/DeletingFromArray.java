package com.startup.program;

import java.util.Scanner;

public class DeletingFromArray {
public static void main(String[] args) {
int n,loc;
System.out.println("Enter size of array");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int a[] = new int[n];
System.out.println("Enter Element of array");
for(int i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter location element to delete");
loc=sc.nextInt();
for(int i=loc;i<n-1;i++) 
{
a[i]=a[i+1];
}
System.out.println("Enter Element of array");
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+ " ");
}
// 10 20 30 40 50
// 0 1 2 3 4
}
}
