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
            }else{
                rightSum += num.charAt(i) - '0';
            }
        }
       
        if((rightSymbol + leftSymbol) % 2 == 1 || (rightSum - leftSum) != (leftSymbol - rightSymbol) * 9/2){
            return true;
        }
        return false;
    }
}