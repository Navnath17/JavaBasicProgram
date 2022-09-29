package com.startup.program;
import java.util.Scanner;
public class PrimeNumber2 {
public static void main(String[] args) {
int i,j,n;
int temp=0;
int total=0;
System.out.println("Enter Number ");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
sc.close();
for(i=1;i<=n;i++)
{
temp=0;
for(j=2;j<=i-1;j++)
{
if(i%j==0)
{
temp++;
break;
}
}
if(temp==0)
{
System.out.print(i+" ");
total=total+1;
}
}
System.out.println("Total Prime Number are = "+total);
}
}
