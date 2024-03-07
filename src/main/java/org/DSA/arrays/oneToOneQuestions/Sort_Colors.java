package org.DSA.arrays.oneToOneQuestions;

public class Sort_Colors {
    public static void main(String[] args) {
        int a[] = {2,0,2,1,1,0};
        sortArray(a);
        for(int e: a) {
            System.out.print(e+" ");
        }
    }

    static void sortArray(int a[]) {             // O(n)
        int low = 0, mid = 0, high = a.length-1;

        while(mid < high) {
            if(a[mid] == 2) {
                a[mid] = a[high];
                a[high] = 2;
                high--;
            }
            else if(a[mid] == 1){
                mid++;
            } else if (a[mid] == 0) {
                a[mid] = a[low];
                a[low] = 0;
                low++;
                mid++;
            }
        }
    }
}
