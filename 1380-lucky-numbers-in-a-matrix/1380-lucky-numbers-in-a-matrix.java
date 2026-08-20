class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            // Find minimum in current row
            int min = matrix[i][0];
            int minCol = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            // Check if it is maximum in its column
            boolean isLucky = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                ans.add(min);
            }
        }

        return ans;
    }
}