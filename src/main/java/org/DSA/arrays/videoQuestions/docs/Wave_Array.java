package org.DSA.arrays.videoQuestions.docs;

import java.util.Arrays;

public class Wave_Array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        waveArray(a);
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void waveArray(int a[]) {     // O(nlogn)
        Arrays.sort(a);
        int n = a.length;
        for(int i=1;i<n;i+=2) {
            swap(a,a[i],a[i-1]);
        }
    }

    static void waveArrayNotLexographic(int a[]) {   // O(n)
        int n = a.length;
        for(int i=1;i<n;i+=2) {
            if(a[i] > a[i-1]) {
                swap(a,a[i],a[i-1]);
            }
            if(a[i] > a[i+1] && i < n-1) {
                swap(a, a[i], a[i+1]);
            }
        }
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
