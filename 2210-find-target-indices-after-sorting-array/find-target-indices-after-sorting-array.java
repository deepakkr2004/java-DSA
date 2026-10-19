class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        for(int num : nums){
            if(num < target){
                count++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans.add(count);
                count++;
            }
        }
        return ans;
    }
}