class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, 0, curr, ans);
        return ans;
    }
    public void backtrack(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans){

        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        //if choice include number
        curr.add(nums[i]);
        backtrack(nums, i+1, curr, ans);

        //backtrack
        curr.remove(curr.size()-1);

        //exclude 
        backtrack(nums, i+1, curr, ans);
    }
}