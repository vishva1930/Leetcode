class Solution {
    public void rotate(int[][] matrix) {
      int arr[][]=new int[matrix.length][matrix[0].length];
        int x=0;
        int y=0;
        for(int i=0;i<matrix.length;i++){
            y=0;
            for(int j=matrix[0].length-1;j>=0;j--){
               // System.out.print(matrix[j][i]);
                arr[x][y]=matrix[j][i];
                y++;
            }
            x++;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=arr[i][j];
            }
        }   
    }
}