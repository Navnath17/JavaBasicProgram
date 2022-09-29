package com.startup.program;

import java.util.Scanner;
public class PrimerNumber1 {
public static void main(String[] args) {
int n, i, counter = 0;
System.out.println("Enter Number");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for (i = 2; i < n - 1; i++) {
if (n % i == 0) {
counter++;
break;
}
}
if (counter == 1) {
System.out.println("not Prime beacuse divisible by = " + i);
} else {
System.out.println("Prime");
}
}
}
