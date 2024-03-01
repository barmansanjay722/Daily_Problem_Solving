package org.DSA.arrays.videoQuestions.docs;

public class Multiple_left_rotate_array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {2,3};
        int k = 3;

        rotateByK(a,k);
        printArray(a);
    }

    static void printArray(int a[]) {
        for(int e: a) {
            System.out.print(e+" ");
        }
    }

    static void rotateByK(int a[], int k) {     // O(k*n) * m
        int n = a.length;
        for(int i=0;i<k;i++) {
            int temp = a[0];
            for(int j=0;j<n-1;j++) {
                a[j] = a[j+1];
            }
            a[n-1] = temp;
        }
    }


    // make new array and store the array data 2nd time (new approach)
    static int[][] multipleRotations(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int ans[][] = new int[m][n];

        int temp[] = new int[2 * n];
        for(int i=0;i<n;i++) {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }

        for(int i=0;i<m;i++) {
            int offset = (b[i]) % n
                    ;
            for(int j=0;j<n;j++) {
                ans[i][j] = temp[j+offset];
            }
        }
        return ans;
    }
}
