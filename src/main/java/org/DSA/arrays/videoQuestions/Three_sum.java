package org.DSA.arrays.videoQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum {
    public static void main(String[] args) {
        int a[] = {4,2,-1,-3,0,1,2,3};
//        int sum = 4;

        Arrays.sort(a);
        // 3 sum
        List<List<Integer>> triplets = new ArrayList<>();       // O(n^2logn)


        
        for(int i=0;i<a.length-2;i++) {
            if(i > 0 && a[i] == a[i-1]) continue;
            List<List<Integer>> temp = twoSum(a, -a[i], 0);
            for(List<Integer> list: temp) {
                list.add(0,a[i]);
                triplets.add(list);
            }
        }
        System.out.println(triplets);


        /*List<List<Integer>> ans = twoSum(a,sum, 0);
        System.out.println(ans);*/
    }

    // two sum problem
    static List<List<Integer>> twoSum(int a[], int sum, int startForm) {    // O(nlogn)
        int l = startForm;
        int r = a.length-1;
        List<List<Integer>> ans = new ArrayList<>();

        while(l < r) {
            if(a[l] + a[r] > sum) {
                r--;
            }
            else if(a[l] + a[r] < sum) {
                l++;
            }
            else {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[l]);
                temp.add(a[r]);
                ans.add(temp);
                l++;
                r--;
            }
        }
        return ans;
    }
}
