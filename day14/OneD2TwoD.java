package day14;

class OneD2TwoD {
    public int[][] construct2DArray(int[] original, int m, int n) {
       int ar[][]=new int[m][n];
       int length=original.length;
       if(m*n!=length)return new int[0][0];
       int k=0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            ar[i][j]=original[k];
            k++;
        }
       }
       return ar;

    }
}
//2d ar[m][n]. m-n