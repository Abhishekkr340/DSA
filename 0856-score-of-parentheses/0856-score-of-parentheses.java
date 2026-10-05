class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); 

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); 
            } else {
                int currentLevelScore = stack.pop();
                int outerLevelScore = stack.pop();
                
                
                int evaluatedScore = Math.max(2 * currentLevelScore, 1);
                
                
                stack.push(outerLevelScore + evaluatedScore);
            }
        }

        return stack.pop();
    }
}