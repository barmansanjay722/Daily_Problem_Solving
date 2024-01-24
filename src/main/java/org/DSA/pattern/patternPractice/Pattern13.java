package org.DSA.pattern.patternPractice;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 6;

       /* for(int i=1;i<n;i++) {
            for(int j=1;j<n-i;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=2*i;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<=n;i++) {
            System.out.print("* ");
        }*/


        int i, j, k;

        // outer loop to handle rows
        for (i = 1; i <= n; i++) {

            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
