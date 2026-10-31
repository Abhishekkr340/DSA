class Solution {
     private static final String[] KEYPAD = {
        "",    "",    "abc",  "def", "ghi", 
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

         ArrayList<String> list = new ArrayList<>();
       if(digits.isEmpty()){
        return list;
       }
       else{
            padRet("",digits,list);
            return list;
       }
        
    }
    private static void padRet(String p, String up,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        String letters = KEYPAD[digit]; 

        
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            padRet(p + ch, up.substring(1), list);
        }
    }
    
}