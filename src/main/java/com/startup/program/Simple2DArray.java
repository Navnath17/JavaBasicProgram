package com.startup.program;

import java.util.Scanner;
public class Simple2DArray {
public static void main(String[] args) {
int r,c;
System.out.println("Enter Size for array row and column : ");
Scanner sc = new Scanner(System.in);
r=sc.nextInt();
c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter " +r*c+" array element");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Elements stored successfully ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}
}