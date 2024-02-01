package org.DSA;

public class Practice {
    public static void main(String[] args) {
        System.out.println(nthFibonacci(5));
    }
    public static int nthFibonacci(int n){
        //You can code here

        if(n <= 1) {
            return n;
        }

        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
