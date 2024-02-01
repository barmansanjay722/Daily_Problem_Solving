package org.DSA.recursion.oneToOneLearn;

public class Power_with_Module {

    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        int c = 4;
        int m = 30;

        System.out.println(power(a,b));
        System.out.println(fastPower(a,c,m));
    }


    // power
    // Time complexity -> O(b) / O(n)
    static double power(double a, double b) {
        if(b == 0) return 1;

        return a * power(a, b-1);
    }


    // fast power
    // Time compelexity -> O(log b)    (log mtlb hota h yato half half krte jana h yato double double)

    static double fastPower(double a, int b, int m) {
        if(b == 0) return 1;

        if(b < 0) return fastPower(1/a, Math.abs(b),m);

        if(b % 2==0) {
            return fastPower((a % m  * a % m) % m, b /2, m);
        }
        else {
            return (a % m * fastPower(a, b-1, m) % m) %m;
        }
    }
}
