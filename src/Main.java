/*
Question : Write a program to print the fibonacci series using recursion.
 */

import java.util.Scanner;

public class Main {
    static int FibonacciSeries(int n){
        //base condition
        if (n == 0 || n == 1)return n;
        // sub-Problem
       int perverse = FibonacciSeries(n - 1);
       int perverse2 = FibonacciSeries(n - 2);
        // self work
       return perverse + perverse2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ending digit :");
        int n = sc.nextInt();
        System.out.println("Printing the result :");
        System.out.println(FibonacciSeries(n));
    }
}