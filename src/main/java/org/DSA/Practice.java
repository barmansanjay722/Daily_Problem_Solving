package org.DSA;

public class Practice {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'I') {
                sum = sum + 1;
            }
            else if(s.charAt(i) == 'V') {
                sum = sum + 5;
            }
            else if(s.charAt(i) == 'X') {
                sum = sum + 10;
            }
            else if(s.charAt(i) == 'L') {
                sum = sum + 50;
            }
            else if(s.charAt(i) == 'C') {
                sum = sum + 100;
            }
            else if(s.charAt(i) == 'D') {
                sum = sum + 500;
            }
            else if(s.charAt(i) == 'M') {
                sum = sum + 1000;
            }
        }
        return sum;
    }
}
