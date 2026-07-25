class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0) {

        int a = n%10;
        sum = sum+a;
        product = product*a;
        n=n/10;
        }
    int difference = product-sum;
    return difference;        
    }
    
    
}