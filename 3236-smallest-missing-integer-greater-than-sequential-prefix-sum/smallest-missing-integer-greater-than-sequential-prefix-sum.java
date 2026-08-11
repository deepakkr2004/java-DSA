class Solution {
    public int missingInteger(int[] nums) {
        int max = nums[0];
        int j = 1;
        while(j < nums.length && nums[j] == nums[j - 1] + 1){
            max+=nums[j];
            j++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        while(set.contains(max)){
            max++;
        }
        return max;
    }
}