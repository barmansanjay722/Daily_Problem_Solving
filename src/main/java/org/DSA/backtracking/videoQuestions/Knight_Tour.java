package org.DSA.backtracking.videoQuestions;

public class Knight_Tour {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = knightTour(n);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }

    static int[][] knightTour(int n) {

        int ans[][]  = new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                ans[i][j] = -1;                 //  fill the fields -1
            }
        }

        ans[0][0] = 0;                          // starting from 0,0 so make it 0
        int[] movesX = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
        int[] movesY = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        knightTourProblem(n, ans, movesX, movesY, 0,0,1);

        return ans;
    }

    static boolean knightTourProblem(int n, int ans[][], int[] movesX, int[] movesY, int curX, int curY, int step) {

        if(step == n*n) {
            return true;
        }

        for(int i=0;i<8;i++) {
            int nextX = curX + movesX[i];
            int nextY = curY + movesY[i];
            if(isValid(nextX,nextY,ans,n)) {
                ans[nextX][nextY] = step;
                boolean isTourCompleted = knightTourProblem(n,ans,movesX,movesY,nextX,nextY,step+1);
                if(isTourCompleted) {
                    return true;
                }

                ans[nextX][nextY] = -1;
            }
        }
        return false;
    }

    static boolean isValid(int x, int y, int ans[][], int n) {
        if(x < n && y < n && x >=0 && y >=0 && ans[x][y] == -1) {
            return true;
        }
        return false;
    }
}
