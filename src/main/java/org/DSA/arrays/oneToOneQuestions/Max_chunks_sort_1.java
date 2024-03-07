package org.DSA.arrays.oneToOneQuestions;

public class Max_chunks_sort_1 {
    public static void main(String[] args) {
        int a[] = {2,0,1,5,3,4,6};
        System.out.println(maxChunk1(a));
    }

    static int maxChunk1(int a[]) {
        if(a.length ==0 ) return 0;
        int chunks = 0;
        int maxSoFar = a[0];

        for(int i=0;i<a.length;i++) {
            maxSoFar = Math.max(maxSoFar, a[i]);
            if(i == maxSoFar) {
                chunks++;
            }
        }

        return chunks;
    }
}
