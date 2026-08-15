class Solution {
    public int[] sumZero(int n) {
        int[] any = new int[n];
        int val = 1;

        for(int i=0;i<n-1;i+=2) {
            any[i]=val;
            any[i+1]=-val;
            val++;
        }
        return any;
    }
}