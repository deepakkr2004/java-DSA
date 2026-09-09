class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start = 1000;
        while(n >= start){
            ans += n-start+1;
            start *= 1000;
        }
        return ans;
    }
}