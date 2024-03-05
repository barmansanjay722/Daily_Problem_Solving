package org.DSA.arrays.videoQuestions;

public class Maximum_absolute_value {
    public static void main(String[] args) {
        int a[] = {2,5,6,7,3,4,5};
        System.out.println(maximumdiff(a));
    }

    static int maximumdiff(int a[]) {      // O(n)
        int n = a.length;
        int aipi[] = new int[n];
        int aimi[] = new int[n];

        for(int i=0;i<n;i++) {
            aipi[i] = a[i] + i;
            aimi[i] = a[i] - i;
        }

        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for(int e: aipi) {
            minaipi = Math.min(minaipi, e);
            maxaipi = Math.max(maxaipi, e);
        }

        for(int e: aimi) {
            minaimi = Math.min(minaimi, e);
            maxaimi = Math.max(maxaimi, e);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaimi, diffaipi);
    }
}
