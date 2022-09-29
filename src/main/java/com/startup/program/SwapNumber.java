package com.startup.program;

public class SwapNumber {
public static void main(String[] args) {
int a, b;
a = 10;
b = 20;
System.out.println("Befor swap a = " + a + " andb is = " + b);
a = a + b;
b = a - b;
a = a - b;
System.out.println("after swap a = " + a + " andb is = " + b);
}
}