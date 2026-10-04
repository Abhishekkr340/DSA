class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                ans.add(matrix[j][right]);
            }
            right--;

            if (top > bottom || left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;

            for (int j = bottom; j >= top; j--) {
                ans.add(matrix[j][left]);
            }
            left++;
        }

        return ans;
    }
}