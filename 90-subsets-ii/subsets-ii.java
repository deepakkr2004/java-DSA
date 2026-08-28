class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums); 
        backtrack(nums, 0, ans, curr);

        return ans;
    }
    public void backtrack(int[] nums, int i, List<List<Integer>> ans, List<Integer> curr){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backtrack(nums, i+1, ans, curr);

        curr.remove(curr.size()-1);
        
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        backtrack(nums, i+1, ans, curr);
    }
}