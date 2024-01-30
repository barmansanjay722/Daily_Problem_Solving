package org.DSA.recursion;

public class BasicRecursion {
    public static void main(String[] args) {
//        fun(5);
//        foo(5);
        bar(3);
    }

    static void fun(int n) {
        if(n > 0) {
            System.out.println(n);
            fun(n-1);                   // descending
        }
    }

    static void foo(int n) {
        if(n > 0) {
            foo(n-1);                   // accending
            System.out.println(n);
        }
    }

    static void bar(int n) {
        if(n > 0) {
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }
}
