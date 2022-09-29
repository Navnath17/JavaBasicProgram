package com.startup.program;
import java.util.Scanner;

public class Sortelement {
public static void main(String[] args) {
int[] a = new int[5];
char reply='y';
System.out.println("Enter 5 number for array");
Scanner sc = new Scanner(System.in);
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Element stored successfuly. Do You want to Print Y/N");
reply=sc.next().charAt(0);
if(reply=='y')
{
System.out.println("array elements are : ");
for(int i=0;i<5;i++)
{
System.out.print(a[i]+" ");
}
}
else
{
System.out.println("Thank You");
System.exit(0);
}
}
}
