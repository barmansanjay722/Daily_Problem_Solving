package org.DSA.basic_JAVA.Arrays_Funcitons_Strings_2;

public class Place_lastNumber_in_Sorted_Position {
    public static void main(String[] args) {

        int a[] = {2,5,6,7,8,9,4};

        lastNumberInSortedPositoin(a);
        for(int e: a) {
            System.out.println(e);
        }
    }

    static void lastNumberInSortedPositoin(int a[]) {

        int n = a.length;
        int last = a[n-1];
        int swapIndex = n-2;

        while(swapIndex >=0 && a[swapIndex] > last) {
            swapIndex--;
        }

        for(int i= n-1;i>=swapIndex+2;i--) {
            a[i] = a[i-1];
        }

        a[swapIndex+1] = last;
    }
}

