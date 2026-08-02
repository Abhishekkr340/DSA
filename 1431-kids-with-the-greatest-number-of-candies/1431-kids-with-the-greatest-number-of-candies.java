class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = extraCandies;
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            //candies[i]+=n;
            int a=candies[i]+n;
            int b= 0;

            for(int j=0;j<candies.length;j++){
                if(candies[j]>a){
                    b=candies[j];
                }
            }
            if(a>=b){
                ans.add(i,true);
            } else{
                ans.add(i,false);
            }
           //candies[i]=candies[i]-n;

        }
        return ans;
    }
}