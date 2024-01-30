package org.DSA.recursion.videoQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(5));
    }

    static int fibonacciNumber(int n) {
        if(n == 1 || n == 0) return n;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    //
}
