package org.DSA.backtracking.oneToOneQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination_Sum {
    // O(2^n)
    public static void main(String[] args) {

        int a[] = {8,1,3,7,2,1,6};
        int sum = 12;
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> ans = combination_sum(a,sum);
        for(ArrayList<Integer> list: ans) {
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> combination_sum(int a[], int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helperCombinationSum(a, ans, 0, sum, new ArrayList<>());
        return ans;
    }

    private static void helperCombinationSum(int[] a, ArrayList<ArrayList<Integer>> ans, int index,
                                             int sum,
                                             ArrayList<Integer> cur) {
        if(sum == 0) {
            ArrayList<Integer> curCopy = new ArrayList<>(cur);
            ans.add(curCopy);
        }

        for(int i=index; i<a.length; i++) {
            if(a[i] > sum) return;
            cur.add(a[i]);
            helperCombinationSum(a, ans, i+1, sum-a[i], cur);
            cur.remove(cur.size()-1);    // backtracking
        }

    }
}
