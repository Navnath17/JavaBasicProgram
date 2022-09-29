package com.startup.program;
import java.util.Scanner;
public class FiboExample {
public static void main(String[] args) {
int a=0,b=1,i,c,n;
System.out.println("Enter Number :");
Scanner sc = new Scanner(System.in);
n=Integer.parseInt(sc.next()); // we need to parse in case of next()
// n=sc.nextInt(); //direct interger
sc.close();
System.out.print(a+ " "+b +" ");
for(i=2;i<n;i++)
{
c=a+b; // 0 1 1 2 3
System.out.print(c +" ");
a=b;
b=c;
}
}
}
