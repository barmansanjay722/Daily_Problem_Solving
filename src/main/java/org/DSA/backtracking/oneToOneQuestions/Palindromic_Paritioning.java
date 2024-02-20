package org.DSA.backtracking.oneToOneQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Palindromic_Paritioning {
    public static void main(String[] args) {
        String s = "abbaca";
        List<List<String>> ans = palindromicPartitioning(s);
        Iterator var3 = ans.iterator();

        while(var3.hasNext()) {
            List<String> list = (List)var3.next();
            Iterator var5 = list.iterator();

            while(var5.hasNext()) {
                String ss = (String)var5.next();
                System.out.print(ss + " ");
            }

            System.out.println();
        }
    }

    static List<List<String>> palindromicPartitioning(String s) {
        List<List<String>> ans = new ArrayList();
        palindromicHelper(s, ans, 0, new ArrayList());
        return ans;
    }

    static boolean isPalindrome(String s, int l, int r) {
        while(l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            ++l;
            --r;
        }

        return true;
    }

    static void palindromicHelper(String s, List<List<String>> ans, int index, List<String> cur) {
        if (index == s.length()) {
            List<String> copyCur = new ArrayList(cur);
            ans.add(copyCur);
        } else {
            for(int i = index; i < s.length(); ++i) {
                if (isPalindrome(s, index, i)) {
                    cur.add(s.substring(index, i + 1));
                    palindromicHelper(s, ans, i + 1, cur);
                    cur.remove(cur.size() - 1);
                }
            }

        }
    }

}
