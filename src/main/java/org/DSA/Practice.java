package org.DSA;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
//        mergeAlternately(word1,word2);
    }

    public static String mergeAlternately(String word1, String word2) {
        String ans = "";
        int word1low = 0;
        int word2low = 0;
        while (word1low <= word1.length() - 1 || word2low <= word2.length() - 1) {
            if (word1low <= word1.length() - 1) {
                ans += word1.charAt(word1low);
            }
            if (word2low <= word2.length() - 1) {
                ans += word2.charAt(word2low);
            }
            word1low++;
            word2low++;
        }
        return ans;
    }
}
