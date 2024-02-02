package org.DSA.recursion.oneToOneLearn;

public class Matrix_Path {
    public static void main(String[] args) {
        System.out.println(metrixPath(2,2));
    }

    static int metrixPath(int n , int m) {
        if(n ==1 || m == 1) return 1;

        return metrixPath(n-1,m) + metrixPath(n,m-1);


        // we are getting divided in two parts (tree grapth) so the time complexity is O(2n)
    }
}
