class Solution {
    public boolean checkIfPangram(String sentence) {
         for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) < 0) {
                return false;
            }
        }
        return true; 
    
    }
}