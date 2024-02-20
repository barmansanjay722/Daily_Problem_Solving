package org.DSA;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

    }

    public static List<List<String>> partition(String s)
    {
        List<List<String>> ans = new ArrayList<>();

        return ans;
    }

    static void partitionHelper(String s, int index, List<List<String>> ans, List<String> cur) {
        if(index == s.length()) {
            List<String> copyCur = new ArrayList<>(cur);
            ans.add(copyCur);
            return;
        }

        for(int i=index;i<s.length();i++) {
            if(isPalindrome(s, index, i)) {
                cur.add(s.substring(index,i+1));
                partitionHelper(s, index+1, ans, cur);
            }
        }

    }


    static boolean isPalindrome(String s, int l, int r) {
        while (l <= r) {
            if(s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }
        return true;
    }

}
