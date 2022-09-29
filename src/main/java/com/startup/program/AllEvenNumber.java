package com.startup.program;
import java.util.Scanner;
public class AllEvenNumber {
public static void main(String[] args) {
int n, i;
int total = 0;
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for (i = 1; i <= 100; i++) {
if (i % 2 == 0) {
System.out.print(i + " ");
total = total + 1;
}
}
System.out.println("");
System.out.println("Total Even Number are " + total);
}
}
