package org.DSA.sorting;

// insertion sort taking element from right side and then put it into left side by sorting order

public class InsertionSort {
    public static void main(String[] args) {
        int a[]= {9,5,3,1,2};
        insertionSort(a);
        for(int e: a) {
            System.out.println(e);
        }
    }

    static void insertionSort(int a[]) {
        int n = a.length;
        for(int i=1;i<n;i++) {
            int last = a[i];
            int swapIndex = i-1;
            while(swapIndex >=0 && a[swapIndex] > last) {
                swapIndex--;
            }
            int j = i;
            while (j > swapIndex+1) {
                a[j] = a[j-1];
                j--;
            }
            a[swapIndex+1] = last;
        }
    }
}
