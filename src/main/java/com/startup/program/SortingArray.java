package com.startup.program;

import java.util.Scanner;
public class SortingArray {
public static void main(String[] args) {
int n,temp=0;
System.out.println("Enter Array Size : ");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int a[] = new int[n];
System.out.println("Enter Array element : ");
for(int i= 0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j]) // here > or < for asc or desc 
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
