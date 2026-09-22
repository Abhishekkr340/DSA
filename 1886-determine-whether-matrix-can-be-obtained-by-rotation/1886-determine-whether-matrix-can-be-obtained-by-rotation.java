public class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        // Flags to track if the matrix matches target at 0, 90, 180, and 270 degrees
        boolean r0 = true, r90 = true, r180 = true, r270 = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check 0-degree rotation (exact match)
                if (mat[i][j] != target[i][j]) r0 = false;
                
                // Check 90-degree clockwise rotation
                if (mat[i][j] != target[j][n - 1 - i]) r90 = false;
                
                // Check 180-degree rotation
                if (mat[i][j] != target[n - 1 - i][n - 1 - j]) r180 = false;
                
                // Check 270-degree clockwise rotation
                if (mat[i][j] != target[n - 1 - j][i]) r270 = false;
            }
        }
        
        // If it matches any of the four rotation states, return true
        return r0 || r90 || r180 || r270;
    }
}
