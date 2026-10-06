class Solution {
    public int minAddToMakeValid(String s) {
        int leftNeeded = 0;
        int rightNeeded = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                rightNeeded++;
            } else {
                if (rightNeeded > 0) {
                    rightNeeded--;
                } else {
                    leftNeeded++;
                }
            }
        }
        
        return leftNeeded + rightNeeded;
    }
}
