package org.vaibhao;

/* 34) Write a program in Java to display and print the sum of following series
S= 1 + (x+2)/2! + (2x+3)/3! + (3x+4)/4! +…..+nth ter */


import java.util.Scanner;

public class DisplaySeries {
  public static int factorial(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of x: ");
    int x = input.nextInt();
    System.out.print("Enter the value of n: ");
    int n = input.nextInt();

    double sum = 1;
    for (int i = 1; i <= n; i++) {
      sum += (i * x + i + 1) / factorial(i + 1);
    }

    System.out.println("Sum of the series: " + sum);
  }
}