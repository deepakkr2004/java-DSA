class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[n/2];
        int moves = 0;
        for(int i=0; i<n/2; i++){
            moves += Math.abs(nums[i]-mid);//lhs of mid
            moves += Math.abs(nums[n-i-1]-mid);//rhs of mid
        }
        return moves;
    }
}