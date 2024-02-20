package org.DSA;

public class Practice {
    public static void main(String[] args) {
        System.out.println(countOcurences("hello","hello world, hello universe"));
    }

    static int countOcurences(String t, String s) {
        return countOcurenceHelper(t,s,0);
    }

    static int countOcurenceHelper(String t, String s, int i) {
        if(i > s.length() - t.length()) {
            return 0;
        }

        int countAppearNUbmer = countOcurenceHelper(t, s, i+1);
        boolean isCountapearNumber = s.substring(i, i+t.length()).equals(t);

        if(isCountapearNumber) return countAppearNUbmer + 1;
        else
            return countAppearNUbmer;
    }
}
