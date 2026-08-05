class Solution {
    public boolean judgeSquareSum(int c) {
        int n =(int) Math.sqrt(c);
        int[] arr = new int[n+1];
        for(int i=0; i<=n; i++){
            arr[i]=i;
        }
        
        int j = 0;
        int k = arr.length-1;
        while(j<=k){
            long sum = (1L*arr[j]*arr[j]) + (1L*arr[k]*arr[k]);
            if(sum == c){
                return true;
            }else if(sum < c){
                j++;
            }else{
                k--;
            } 
        }
        return false;
    }
}