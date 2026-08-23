class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0;
        int rightSum = 0;
        int leftSymbol = 0;
        int rightSymbol = 0;
        for(int i=0; i<n/2; i++){
            if(num.charAt(i) == '?'){
                leftSymbol++;
            }else{
                leftSum += num.charAt(i) - '0';
            }
            
        }
        for(int i=n/2; i<n; i++){
            if(num.charAt(i) == '?'){
                rightSymbol++;
            }else
            rightSum += num.charAt(i) - '0';
        }
        int reqSum = rightSum - leftSum; 
        if((rightSymbol + leftSymbol) % 2 == 1){
            return true;
        }
        return reqSum != (leftSymbol - rightSymbol) * 9/2;
    }
}