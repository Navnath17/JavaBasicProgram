package com.startup.program;
import java.util.Scanner;
public class DeleteArrayByItemName {
public static void main(String[] args) 
{
int loc=0;
int item;
char ch;
Scanner sc = new Scanner(System.in);
int a[]={10,20,30,4,50,60};
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Enter item to be Delete form above array :");
item=sc.nextInt();
for(int i=0;i<a.length;i++)
{
if(a[i]==item)
{
loc=i;
break;
}
}
System.out.println("Item Found at location "+ loc);
for(int i=loc;i<a.length-1;i++)
{
a[i]=a[i+1];
}
System.out.println("Item delete successfuly Do You want to Print array ");
ch=sc.next().charAt(0);
if(ch=='y' || ch== 'Y')
{
for(int i=0;i<a.length-1;i++)
{
System.out.print(a[i]+" ");
}
}
else
{ System.exit(0); }
}
}