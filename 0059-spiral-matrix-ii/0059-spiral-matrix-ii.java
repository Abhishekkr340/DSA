class Solution {
    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];
        int top =0;
        int left = 0;
        int right = ans[0].length-1;
        int bottom = ans.length-1;

        int num = 1;

        while(num<=n*n){

            
            for (int i = left; i <= right; i++) {
                ans[top][i] = num;
                num++;
            }
            top++;

            for (int j = top; j <= bottom; j++) {
               ans[j][right] = num;
               num++;
            }
            right--;

            if (top <= bottom) {
                
            for (int i = right; i >= left; i--) {
                ans[bottom][i]=num;
                num++;
            }
            bottom--;
            }

            if(left<=right){

            for (int j = bottom; j >= top; j--) {
                ans[j][left] = num;
                num++;
            }
            left++;
            }
        }

        return ans;
    }
}