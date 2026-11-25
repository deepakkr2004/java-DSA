class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        long LS = 0;
        long RS = 0;

        long result = Long.MAX_VALUE;
        int index = -1;

        for(int i=0; i<n; i++){
            LS += nums[i];
            RS = sum-LS;

            int n1 = i+1;
            int n2 = n-n1;

            long left_avg = LS/n1;
            long right_avg = (i==n-1) ? 0 : RS/n2;

            long diff = Math.abs(left_avg - right_avg);
            
            if(diff < result){
                result = diff;
                index = i;
            }
        }
        return index;
    }
}