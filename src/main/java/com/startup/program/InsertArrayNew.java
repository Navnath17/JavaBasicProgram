package com.startup.program;

import java.util.Scanner;
public class InsertArrayNew {
public static void main(String[] args) {
int size, loc, item, i;
System.out.println("Enter Size of Array");
Scanner sc = new Scanner(System.in);
size=sc.nextInt();
int a[] = new int[size+1];
System.out.println("Enter Element in to Array");
for(i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Elements Inserted in to array ..");
System.out.println("Enter location to insert item");
loc=sc.nextInt();
System.out.println("Enter item to insert ");
item=sc.nextInt();
for(i=size;i>loc;i--)
{
a[i]=a[i-1];
}
a[loc]=item;
System.out.println(" New ..Elements Inserted in to array ..");
for(i=0;i<size+1;i++)
{
System.out.print(a[i]+" ");
}
}
}

