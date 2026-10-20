class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness);
        int count = 0;
        long result = 0;
        for(int i=n-1; i>=n-k; i--){
            result += Math.max(happiness[i] - count, 0);
            count++;
        }
        return result;
    }
}