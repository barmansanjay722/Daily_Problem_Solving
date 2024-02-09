package org.DSA.backtracking.videoQuestions;

public class Generate_Parentheses {
    public static void main(String[] args) {
        generateParentheses(2,"",0,0,0);
    }

    static void generateParentheses(int n, String cur, int index, int open, int close) {

        if(index == 2*n) {
            System.out.println(cur);
            return;
        }

        if(open < n) {
            cur = cur + "(";
            generateParentheses(n, cur, index+1,open+1, close);
            cur = cur.substring(0,cur.length()-1);     // backtracking
        }

        if(close < open) {
            cur = cur + ")";
            generateParentheses(n, cur, index+1,open, close+1);
            cur = cur.substring(0,cur.length()-1);     // backtracking
        }
    }
}
