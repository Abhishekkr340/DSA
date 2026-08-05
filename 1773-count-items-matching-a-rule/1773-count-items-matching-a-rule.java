class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i =0;i<items.size();i++){

            if(ruleKey.equalsIgnoreCase("type")) {
                if(ruleValue.equalsIgnoreCase(items.get(i).get(0))){
                        count++;
                 }
            }
                else if(ruleKey.equalsIgnoreCase("color")) {
                    if(ruleValue.equalsIgnoreCase(items.get(i).get(1))){
                        count++;
                    }
                }
                else if(ruleKey.equalsIgnoreCase("name")) {
                    if(ruleValue.equalsIgnoreCase(items.get(i).get(2))){
                        count++;
                    }
                }
        }
        return count;
        
    }
}