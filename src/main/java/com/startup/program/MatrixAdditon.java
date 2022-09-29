package com.startup.program;

import java.util.Scanner;
public class MatrixAdditon {
public static void main(String[] args) {
int r, c;
System.out.println("Enter size of 2D array row and column");
Scanner sc = new Scanner(System.in);
r = sc.nextInt();
c = sc.nextInt();
int a[][] = new int[r][c];
int b[][] = new int[r][c];
int d[][] = new int[r][c]; // Can't define c[][] array because we 
// declared c var for column
System.out.println("Enter array elements of 1st Arrray (" + r * c + ") elements");
for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) {
a[i][j] = sc.nextInt();
}
}
System.out.println("Enter array elements of 2nd Arrray (" + r * c + ") elements");
for (int i = 0; i < r; i++) 
{
for (int j = 0; j < c; j++)
{
b[i][j] = sc.nextInt();
}
}
for (int i = 0; i < r; i++) 
{
for (int j = 0; j < c; j++)
{
d[i][j] = a[i][j] + b[i][j];
}
}

System.out.println("Addtion of matrix is : ");
for (int i = 0; i < r; i++) 
{
for (int j = 0; j < c; j++)
{
System.out.print(d[i][j] + " ");
}
System.out.println();
}
sc.close();
}
}
