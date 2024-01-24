package org.DSA.pattern.patternPractice;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 6;

        /*for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i-j;j++) {
                for(int k=i;k>0;k--) {
                    System.out.print(k);
                }
                break;
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }

            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
