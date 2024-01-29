package org.DSA.array.oneToOneLearn.basicArray;

public class Find_min_Array {

    public static void main(String[] args) {
        int arr[] = {2,5,1,8,4};

        int min = Integer.MAX_VALUE;

        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
