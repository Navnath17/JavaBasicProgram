package com.startup.program;
import java.util.Scanner;
public class AddtionOfArray {
public static void main(String[] args) {
char reply;
int sum = 0;
int a[];
a = new int[5];
System.out.println("Enter Five Number ");
Scanner sc = new Scanner(System.in);
for (int i = 0; i < 5; i++) {
a[i] = sc.nextInt();
}
System.out.println("Element stored Successfuly. Do You want to Print additon of element Y/N");
reply = sc.next().toLowerCase().charAt(0);
if (reply == 'y')
{
for (int i = 0; i < 5; i++) 
{
if (i == 4)
{
sum = sum + a[i];
System.out.print(a[i] + " = " + sum);
break;
}
System.out.print(a[i] + " + ");
sum = sum + a[i];
}
} 
else {
System.out.println("Thank You");
System.exit(0);
}
}
}