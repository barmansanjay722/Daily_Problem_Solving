package org.DSA.array.oneToOneLearn.sorting;


/* have to select a element from unsorted array and then put in sorted array
         ( basically devide(imagination)  the given array in two parts) */


public class SelectionSort {
    public static void main(String[] args) {
        int a[]= {9,5,3,1,2};
        selectionSort(a);
        for(int e: a) {
            System.out.println(e);
        }
    }

    static void selectionSort(int a[]) {
        int n = a.length;
        for(int i=0;i<n-1;i++) {
            int min = i;      // assume i is the minimum index;
            for(int j=i+1;j<n;j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
