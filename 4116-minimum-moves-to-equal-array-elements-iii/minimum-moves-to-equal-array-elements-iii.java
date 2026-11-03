class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(num,max);
        }
        int moves = 0;
        for(int i=0; i<nums.length; i++){
            moves += Math.abs(nums[i] - max);
        }
        return moves;
    }
}