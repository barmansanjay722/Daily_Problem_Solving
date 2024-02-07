package org.DSA.basic_JAVA.Arrays_Funcitons_Strings_2;

public class Element_Sum_MIn_Max {
    public static void main(String[] args) {

        int numbers[] = {12,23,4,5,7,2,56};

        // find sum of array
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        System.out.println(sum);


        // find min from array
        int min = Integer.MAX_VALUE;

        for(int num : numbers) {
            if(num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
