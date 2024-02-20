package org.DSA.backtracking.oneToOneQuestions;

import java.util.ArrayList;

public class SubSequence_Array {       // O(2^n)
    public static void main(String[] args) {

        int a[] = {5,6,4};
        ArrayList<ArrayList<Integer>> ans = subsequence(a);
        for(ArrayList<Integer> list: ans) {
            System.out.println(list);
        }
    }

    static ArrayList<ArrayList<Integer>> subsequence(int a[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helperSubsequence(a, ans, 0, new ArrayList<>());
        return ans;
    }

    static void helperSubsequence(int a[],  ArrayList<ArrayList<Integer>> ans, int index, ArrayList<Integer> cur ) {

        ArrayList<Integer> curcopy = new ArrayList<>(cur);
        ans.add(curcopy);

        for(int i=index;i<a.length;i++) {
            cur.add(a[i]);
            helperSubsequence(a,ans, i+1,cur);
            cur.remove(cur.size()-1);    // Backtrack
        }
    }

}
