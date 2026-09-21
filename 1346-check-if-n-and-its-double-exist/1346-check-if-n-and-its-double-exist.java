class Solution {
    public boolean checkIfExist(int[] arr) {

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                for(int j =0;j<arr.length;j++){
                    if(arr[i]==2*arr[j] && i!=j){
                        return true;
                    }
                }
            }
            else{
                continue;
            }
        }
        return false;
        
    }
}