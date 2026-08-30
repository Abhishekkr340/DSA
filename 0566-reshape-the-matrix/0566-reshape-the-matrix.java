class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];

        if(mat.length*mat[0].length != r*c) {
            return mat;
        }
        

        for(int i = 0;i<r*c;i++){
            
            int oldRow = i/mat[0].length;
            int oldCol = i%mat[0].length;

            int newRow = i/c;
            int newCol = i%c;

            ans[newRow][newCol]=mat[oldRow][oldCol];
        }
        return ans;
    }
}