package org.DSA.timeComplexity;

public class BigONotation {
    public static void main(String[] args) {
        int a[] = {3,4,5,1,34,6};
        int key = 3;
        printAllPairsINArray(a);
    }

    // O(1) -> Constant time complexity
    static int getFirstNumber(int a[]) {
        return a[0];
    }

    // O(n) -> linear time complexity
    static boolean checkIfNumberIsPresent(int a[], int key) {
        for(int element: a) {
            if(element == key) return true;
        }
        return false;
    }

    static void printAllPairsINArray(int a[]) {
        int n = a.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }



    // in time complexity O(2n) is called exponential ( we don't want to run the programe in this)
}
