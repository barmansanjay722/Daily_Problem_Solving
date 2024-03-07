package org.DSA.arrays.videoQuestions;

public class Minimum_sum_subarray {
    public static void main(String[] args) {
        int a[] = {1,2,5,6,7,2};
        int target = 8;
        System.out.println(minimumSumSubArray(a,target));
    }

    public static int minimumSumSubArray(int a[], int target) {
        int n = a.length;

        int l = 0;
        int r = 0;
        int curSum = 0;
        int minLength = Integer.MAX_VALUE;
//        int x = -1, y = -1;

        while (r < n) {
            curSum += a[r];
            while(curSum >= target) {
                minLength = Math.min(minLength, r-l+1);

                // if indices have to return
          /*      if(r-l+1 < minLength) {
                    minLength = r-l+1;
                    x = l;
                    y = r;
                }*/

                curSum -= a[l];
                l++;
            }
            r++;
        }
        if(minLength == Integer.MAX_VALUE)
            minLength = 0;

        return minLength;
    }
}
