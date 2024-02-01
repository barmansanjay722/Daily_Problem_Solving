package org.DSA.recursion.videoQuestions;

public class PrintSubSets {
    // Time complexity -> O(2n)

    public static void main(String[] args) {
        printAllSubsets("abc");
    }

    static void printAllSubsets(String s) {
        pringAllSubsetsHelper(s,0,"");
    }

    static void pringAllSubsetsHelper(String s, int i, String cur) {
        if(i == s.length()) {
            System.out.print(cur+ " ");
            return;
        }

        pringAllSubsetsHelper(s,i+1,cur+s.charAt(i));
        pringAllSubsetsHelper(s, i+1, cur);
    }
}
