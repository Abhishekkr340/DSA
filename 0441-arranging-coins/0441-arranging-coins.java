class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            // Calculate total coins needed for 'mid' rows
            long coinsUsed = mid * (mid + 1) / 2; 
            
            if (coinsUsed == n) {
                return (int) mid;
            }
            
            if (coinsUsed > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // 'right' represents the maximum fully completed rows
        return (int) right; 
    }
}
