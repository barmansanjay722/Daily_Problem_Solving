package org.DSA.backtracking.oneToOneQuestions;

import java.util.ArrayList;
import java.util.List;

public class Smart_Keypad_Problem {
    public static void main(String[] args) {
        String input = "23";
        List<String> ans = smartKeypad(input);
        for (String s : ans) {
            System.out.print(s+ " ");
        }
        System.out.println();
    }

    static List<String> smartKeypad(String input) {

        String a[] = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        List<String> ans = new ArrayList<>();
        smartKeypadHelper(input, 0, ans, a, "");

        return ans;
    }

    static void smartKeypadHelper(String input, int index, List<String> ans, String a[], String cur) {

        if (index == input.length()) {
            ans.add(cur);
            return;
        }

        int indexOfButton = input.charAt(index)-'0';    // from and char find acutal int value by this
        String buttonString = a[indexOfButton];

        for(int i=0;i<buttonString.length();i++) {
            cur = cur + buttonString.charAt(i);
            smartKeypadHelper(input, index+1, ans, a, cur);
            cur = cur.substring(0, cur.length()-1);     // backtracking

//            smartKeypadHelper(input, index+1, ans, a, cur+buttonString.charAt(i));
        }
    }


    // tome complexity is Exponential time complexity O(k ^n)
}
