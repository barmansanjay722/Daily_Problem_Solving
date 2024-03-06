package org.DSA.arrays.videoQuestions;

import java.util.Arrays;

public class Make_matrix_equal {
    public static void main(String[] args) {

 /*       int a[][] =
                {{3,63,42},
                {18,12,12},
                {15,21,18},
                {33,84,24}};*/

        int a[][] = {{4,6,8,10,1000}};
        int k = 2;
        System.out.println(makeMatrixEqual(a,k));
    }

    static int makeMatrixEqual(int a[][], int k) {
        int n = a.length;
        if(n == 0) return 0;

        int m = a[0].length;
        int total = n * m;
        int b[] = new int[total];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                b[i*m + j] = a[i][j];          // to find element(index) in 2D matrix then formula is -> ( i * m + j )
            }
        }

        Arrays.sort(b);

        int median = b[total/2];
        return makeMatrixEqualHelper(b,median,k);
    }

    static int makeMatrixEqualHelper(int b[], int m, int k) {
        int count =0;
        for(int i=0;i<b.length;i++) {
            count += Math.abs((b[i]-m) / k);
        }
        return count;
    }
}
