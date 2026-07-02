class Solution {
    public void setZeroes(int[][] matrix) {
        int arr[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int ii=0;
                    int jj=0;
                    while(jj<matrix[0].length){
                        arr[i][jj]=2;
                        jj++;
                    }
                    while(ii<matrix.length){
                        arr[ii][j]=2;
                        ii++;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               // System.out.print(arr[i][j]);
                if(arr[i][j]==2){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}