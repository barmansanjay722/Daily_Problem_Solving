package org.DSA.recursion.videoQuestions;

public class CountOccurrenceString {

    // check given string how many time is present in the big String
    // side note always remember base case will be always a definite number


    public static void main(String[] args) {
        System.out.println(countOcurences("aba","ababab"));
    }

    static int countOcurences(String t, String s) {
        return countOcurenceHelper(t,s,0);
    }

    static int countOcurenceHelper(String t, String s, int i) {
        if(i > s.length() - t.length()) {
            return 0;
        }

        int countOcurenceAnswer = countOcurenceHelper(t,s,i+1);
        boolean doSubstringCharmatch = s.substring(i, i+t.length()).equals(t);

        if(doSubstringCharmatch) return countOcurenceAnswer + 1;
        else return countOcurenceAnswer;
    }
}
