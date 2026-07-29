class Solution {

    int[][] dp;

    public int dfs(int[][] matrix, int i, int j) {

        // If already computed, return the stored answer
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int max = 1;

        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {

            int newRow = i + row[k];
            int newCol = j + col[k];

            if (newRow >= 0 &&
                newRow < matrix.length &&
                newCol >= 0 &&
                newCol < matrix[0].length &&
                matrix[newRow][newCol] > matrix[i][j]) {

                max = Math.max(max, 1 + dfs(matrix, newRow, newCol));
            }
        }

        // Store the result before returning
        dp[i][j] = max;

        return max;
    }

    public int longestIncreasingPath(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        dp = new int[r][c];

        int ans = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }

        return ans;
    }
}