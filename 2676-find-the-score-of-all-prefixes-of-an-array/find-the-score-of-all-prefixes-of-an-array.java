class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        int max = nums[0];
        long sum = 0;
        for(int i=0; i<n; i++){
            max = Math.max(nums[i],max);
            sum += nums[i] + max;
            ans[i] = sum;
            
        }
        return ans;
    }
}