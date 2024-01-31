package org.DSA.recursion.videoQuestions;

public class PalindromString {
    public static void main(String[] args) {
        System.out.println(isPalindrom("racecar"));
    }

    static boolean isPalindrom(String s) {
        return isPalindromHelper(s,0,s.length()-1);
    }

    static boolean isPalindromHelper(String s, int l, int r) {
        if(l >= r) return true;

        if(s.charAt(l) == s.charAt(r)) {
            return isPalindromHelper(s, l+1, r-1);
        }
        else {
            return false;
        }
    }
}
