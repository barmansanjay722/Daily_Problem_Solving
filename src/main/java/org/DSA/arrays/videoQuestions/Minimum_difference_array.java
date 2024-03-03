package org.DSA.arrays.videoQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_difference_array {
    public static void main(String[] args) {
        int a[] = {12,9,8,11};
        List<List<Integer>> ans = minDifference(a);
        System.out.println(ans);
    }

    static List<List<Integer>> minDifference(int a[]) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        int n = a.length;

        for(int i=1;i<n;i++) {
            minDiff = Math.min(minDiff, a[i] - a[i-1]);
        }

        for(int i=1;i<n;i++) {
            if(a[i]-a[i=1]== minDiff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
