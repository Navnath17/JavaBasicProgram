package com.startup.program;
import java.util.Scanner;
public class FindSmallFromArray {
public static void main(String[] args) {
int small,n;
System.out.println("Enter array item size");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int a[] = new int[n];
System.out.println("Enter array item : ");
System.out.println();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
small=a[0];
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
small=a[j];
}
}
}
System.out.println();
System.out.println("The Smallest Number in array is "+ small);
}
}
