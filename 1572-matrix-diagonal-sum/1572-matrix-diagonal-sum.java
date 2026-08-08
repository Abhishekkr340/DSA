class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum = sum + mat[i][i];
            sum = sum + mat[i][n-1-i];
        }
        if(n%2!=0){
            int a = (n/2);
            return sum = sum - mat[a][a];
        }
        else{
            return sum;
        }
        
    }
    
}