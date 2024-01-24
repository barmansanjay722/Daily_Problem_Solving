package org.DSA.pattern.patternPractice;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 11;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
